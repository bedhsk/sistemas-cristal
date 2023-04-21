package Entidades;

import clases.*;
import Entidades.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            c.desconectar();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EntidadCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Cliente " + cliente.getNombre() + " no ingresado");
            return false;
        }
    }
}
