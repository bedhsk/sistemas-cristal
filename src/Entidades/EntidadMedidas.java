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

    public boolean create(Conexion c) {
        try {
            String sql = "INSERT INTO venta (id, busto, cintura, talle, largoFalda, cadera, espalda, largoManga, bocaManga) values (?,?,?,?,?,?)";
            PreparedStatement ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, this.id);
            ps.setFloat(2, this.busto);
            ps.setFloat(3, this.cintura);
            ps.setFloat(4, this.talle);
            ps.setFloat(5, this.largoFalda);
            ps.setFloat(6, this.cadera);
            ps.setFloat(7, this.espalda);
            ps.setFloat(8, this.largoManga);
            ps.setFloat(9, this.bocaManga);

            ps.execute();
            ps.close();
            ps = null;
            c.desconectar();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error al insertar la venta: " + ex);
            return false;
        }
    }
}
