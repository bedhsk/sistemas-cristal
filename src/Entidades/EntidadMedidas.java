package Entidades;

import clases.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author brian
 */
public class EntidadMedidas {

    private int id;
    private float busto;
    private float cintura;
    private float talle;
    private float largoFalda;
    private float cadera;
    private float espalda;
    private float largoManga;
    private float bocaManga;

    public EntidadMedidas(int id, float busto, float cintura, float talle, float largoFalda, float cadera, float espalda, float largoManga, float bocaManga) {
        this.id = id;
        this.busto = busto;
        this.cintura = cintura;
        this.talle = talle;
        this.largoFalda = largoFalda;
        this.cadera = cadera;
        this.espalda = espalda;
        this.largoManga = largoManga;
        this.bocaManga = bocaManga;
    }
    
    public EntidadMedidas() {
        this.id = 0;
        this.busto = 0;
        this.cintura = 0;
        this.talle = 0;
        this.largoFalda = 0;
        this.cadera = 0;
        this.espalda = 0;
        this.largoManga = 0;
        this.bocaManga = 0;
    }

    public int getId() {
        return id;
    }

    public float getBusto() {
        return busto;
    }

    public float getCintura() {
        return cintura;
    }

    public float getTalle() {
        return talle;
    }

    public float getLargoFalda() {
        return largoFalda;
    }

    public float getCadera() {
        return cadera;
    }

    public float getEspalda() {
        return espalda;
    }

    public float getLargoManga() {
        return largoManga;
    }

    public float getBocaManga() {
        return bocaManga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBusto(float busto) {
        this.busto = busto;
    }

    public void setCintura(float cintura) {
        this.cintura = cintura;
    }

    public void setTalle(float talle) {
        this.talle = talle;
    }

    public void setLargoFalda(float largoFalda) {
        this.largoFalda = largoFalda;
    }

    public void setCadera(float cadera) {
        this.cadera = cadera;
    }

    public void setEspalda(float espalda) {
        this.espalda = espalda;
    }

    public void setLargoManga(float largoManga) {
        this.largoManga = largoManga;
    }

    public void setBocaManga(float bocaManga) {
        this.bocaManga = bocaManga;
    }
    
    
}
