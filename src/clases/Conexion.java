package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @authors brian, carlos y santizo
 */
public class Conexion {

    Connection cx;
    String bd = "mydb";
    String url = "jdbc:mysql://localhost:3306/" + bd;
    String user = "root";

    //String pass = "bbbbbbb7";
    String pass = "Kamado_Tanjiro_12";

    public Connection conectar() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            cx = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Se conectó correctamente");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conectó");
            System.out.println(ex);
        }
        return cx;
    }

    public void desconectar() {
        try {
            cx.close();
            System.out.println("Se desconectó correctamente");
        } catch (SQLException ex) {
            System.out.println("No se pudo cerrrar conexión");
        }
    }

    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.conectar();
        c.desconectar();
    }
}
