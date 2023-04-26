package Entidades;

import clases.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brian
 */
public class EntidadPedido {
    private int     id;
    private String  descripcion;
    private String  fechaEntrega;
    private String  fechaInicial;
    private String  cliente;
    private float   total;
    private String  accesorios;
    private String  fechaTallado;
    private String  fechaTallado2;
    private EntidadMedidas  medidas;

    public EntidadPedido(int id, String descripcion, String fechaEntrega, String fechaInicial, String clienteId, float total, String accesorios, String fechaTallado, String fechaTallado2, int medidas, float busto, float cintura, float talle, float largoFalda, float cadera, float espalda, float largoManga, float bocaManga) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.fechaInicial = fechaInicial;
        this.cliente = clienteId;
        this.total = total;
        this.accesorios = accesorios;
        this.fechaTallado = fechaTallado;
        this.fechaTallado2 = fechaTallado2;
        this.medidas = new EntidadMedidas(id, busto, cintura, talle, largoFalda, cadera, espalda, largoManga, bocaManga);
    }
    
    public EntidadPedido() {
        this.id = 0;
        this.descripcion = "";
        this.fechaEntrega = "";
        this.fechaInicial = "";
        this.cliente = "";
        this.total = 0;
        this.accesorios = "";
        this.fechaTallado = "";
        this.fechaTallado2 = "";
        this.medidas = new EntidadMedidas();
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public String getCliente() {
        return cliente;
    }

    public float getTotal() {
        return total;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public String getFechaTallado() {
        return fechaTallado;
    }

    public String getFechaTallado2() {
        return fechaTallado2;
    }

    public EntidadMedidas getMedidas() {
        return medidas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    public void setFechaTallado(String fechaTallado) {
        this.fechaTallado = fechaTallado;
    }

    public void setFechaTallado2(String fechaTallado2) {
        this.fechaTallado2 = fechaTallado2;
    }

    public void setMedidas(EntidadMedidas medidas) {
        this.medidas = medidas;
    }

    public void setMedidas(int id, float busto, float cintura, float talle, float largoFalda, float cadera, float espalda, float largoManga, float bocaManga) {
        this.medidas.setId(id);
        this.medidas.setBusto(busto);
        this.medidas.setCintura(cintura);
        this.medidas.setTalle(talle);
        this.medidas.setLargoFalda(largoFalda);
        this.medidas.setCadera(cadera);
        this.medidas.setEspalda(espalda);
        this.medidas.setLargoManga(largoManga);
        this.medidas.setBocaManga(bocaManga);
    }
    
    public boolean Create(Conexion c){
        String sql = "CALL InsertarPedido(cNombre,descripcion ,accesorios ,fechaE ,fechaI ,fechaT1 , fechaT2 , total , cBusto, cCintura , cTalle , cLargoF , cCadera , cEspalda , cLargoM , cBoca )";
        try {
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setString(1, this.cliente);
            ps.setString(2, this.descripcion);
            ps.setString(3, this.accesorios);
            ps.setString(4, this.fechaEntrega);
            ps.setString(5, this.fechaInicial);
            ps.setString(6, this.fechaTallado);
            ps.setString(7, this.fechaTallado2);
            ps.setFloat(8, this.total);
            ps.setFloat(9, this.medidas.getBusto());
            ps.setFloat(10, this.medidas.getCintura());
            ps.setFloat(11, this.medidas.getTalle());
            ps.setFloat(12, this.medidas.getLargoFalda());
            ps.setFloat(13, this.medidas.getCadera());
            ps.setFloat(14, this.medidas.getEspalda());
            ps.setFloat(15, this.medidas.getLargoManga());
            ps.setFloat(16, this.medidas.getBocaManga());
            ps.execute();
            ps.close();
            ps = null;
            System.out.println("Pedido ingresado con exito.");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EntidadCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Pedido no ingresado");
            return false;
        }
    }
    
    public DefaultTableModel select(Conexion c) {
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("id");
        datos.addColumn("Clientes");
        datos.addColumn("Fecha Registro");
        datos.addColumn("Fecha Entrega");
        datos.addColumn("Tallado 1");
        datos.addColumn("Tallado 2");
        datos.addColumn("Accesorios");
        datos.addColumn("Total");

        try {
            java.sql.Statement sql = c.conectar().createStatement();
            ResultSet res = sql.executeQuery("SELECT pedido.id, cliente.nombre, pedido.Fecha_Entrega, pedido.Fecha_Inicial, pedido.Fecha_Tallado, pedido.Fecha_Tallado2, pedido.Accesorios, pedido.Total FROM mydb.pedido INNER JOIN mydb.cliente ON cliente.id = pedido.cliente_id;");

            while (res.next()) {
                Object[] fila = new Object[8];
                fila[0] = res.getString("pedido.id");
                fila[1] = res.getString("cliente.nombre");
                fila[2] = res.getString("pedido.Fecha_Entrega");
                fila[3] = res.getString("pedido.Fecha_Inicial");
                fila[4] = res.getString("pedido.Fecha_Tallado");
                fila[5] = res.getString("pedido.Fecha_Tallado2");
                fila[6] = res.getString("pedido.Accesorios");
                fila[7] = res.getString("pedido.Total");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }

    public boolean delete(Conexion c, int id) {
        try {
            String sql = "DELETE FROM Pedido WHERE ID = ?";
            PreparedStatement ps = (PreparedStatement) c.conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            ps = null;
//            c.desconectar();
            return true;
        } catch (SQLException ex) {
            System.out.println("Fallo al elimiar: " + ex);
            return false;
        }
    }
}
