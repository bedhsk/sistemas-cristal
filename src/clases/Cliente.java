/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.sql.*;  
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author carlo
 */
public class Cliente {
    private String nombre;
    private String telefono;
    private String whatsapp;
    private String correo;

    public Cliente(String nombre, String telefono, String whatsapp, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.whatsapp = whatsapp;
        this.correo = correo;
    }
    
    public Cliente() {
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
    
    public boolean Create(Conexion c){
        String sql = "INSERT INTO mydb.cliente (Nombre, Telefono, Whatsapp, Correo)";
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
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Cliente " + this.nombre + " no ingresado");
            return false;
        }
    }
    
    public boolean Create(Conexion c,String nombre, String telefono, String whatsapp, String correo){
        String sql = "INSERT INTO mydb.cliente (Nombre, Telefono, Whatsapp, Correo)";
        this.nombre = nombre;
        this.telefono = telefono;
        this.whatsapp = whatsapp;
        this.correo = correo;
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
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Cliente " + this.nombre + " no ingresado");
            return false;
        }
    }
}
