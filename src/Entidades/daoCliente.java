package Entidades;

import clases.*;
import Entidades.*;
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
public class daoCliente {

    Conexion c;

    public daoCliente() {
        try {
            this.c = new Conexion();
        } catch (SQLException ex) {
            Logger.getLogger(daoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Desconectar() {
        c.desconectar();
    }

    public boolean Create(EntidadCliente cliente) {
        String sql = "INSERT INTO Cliente (Nombre, Telefono, Whatsapp, Correo) values (?,?,?,?)";
        try {
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getTelefono());
            ps.setString(3, cliente.getWhatsapp());
            ps.setString(4, cliente.getCorreo());
            ps.execute();
            ps.close();
            ps = null;
            System.out.println("Cliente " + cliente.getNombre() + " ingresado con exito.");
            // c.desconectar();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EntidadCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Cliente " + cliente.getNombre() + " no ingresado");
            return false;
        }
    }

    public DefaultTableModel select() {
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

    public boolean delete(int id) {
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
