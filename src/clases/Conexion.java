package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @authors brian, carlos y santizo
 */
public class Conexion {

    Connection cx;
    String bd = "mydb";
    String url = "jdbc:mariadb://localhost:3306/" + bd;
    String user = "root";
    //String pass = "bbbbbbb7";
    String pass = "Kamado_Tanjiro_12";

    public Conexion() throws SQLException {
        cx = DriverManager.getConnection(url, user, pass);
        System.out.println("bd conectada");
    }

    public Connection conectar() throws SQLException {
        return cx;
    }

    public void desconectar() {
        try {
            cx.close();
            System.out.println("bd desconectada");
        } catch (SQLException ex) {
            System.out.println("No se pudo cerrrar conexión");
        }
    }
}
