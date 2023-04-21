package Entidades;

import clases.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
}
