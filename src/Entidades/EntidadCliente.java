package Entidades;

import clases.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class EntidadCliente {

    private String nombre;
    private String telefono;
    private String whatsapp;
    private String correo;

    public EntidadCliente(String nombre, String telefono, String whatsapp, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.whatsapp = whatsapp;
        this.correo = correo;
    }

    public EntidadCliente() {
        this.nombre = "";
        this.telefono = "";
        this.whatsapp = "";
        this.correo = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public boolean Create(Conexion c) {
        String sql = "INSERT INTO Cliente (Nombre, Telefono, Whatsapp, Correo) values (?,?,?,?)";
        try {
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setString(1, this.nombre);
            ps.setString(2, this.telefono);
            ps.setString(3, this.whatsapp);
            ps.setString(4, this.correo);
            ps.execute();
            ps.close();
            ps = null;
            System.out.println("Cliente " + this.nombre + " ingresado con exito.");
            // c.desconectar();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EntidadCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Cliente " + this.nombre + " no ingresado");
            return false;
        }
    }
    
    public DefaultTableModel select(Conexion c) {
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("id");
        datos.addColumn("Nombre");
        datos.addColumn("Telefono");
        datos.addColumn("Whatsapp");
        datos.addColumn("Correo");

        try {
            java.sql.Statement sql = c.conectar().createStatement();
            ResultSet res = sql.executeQuery("select * from Cliente");

            while (res.next()) {
                Object[] fila = new Object[5];
                fila[0] = res.getString("id");
                fila[1] = res.getString("Nombre");
                fila[2] = res.getString("Telefono");
                fila[3] = res.getString("Whatsapp");
                fila[4] = res.getString("Correo");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }

    public boolean delete(Conexion c, int id) {
        try {
            String sql = "DELETE FROM Cliente WHERE ID = ?";
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
