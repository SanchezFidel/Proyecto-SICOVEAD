package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;
    static String url = "jdbc:mysql://localhost:3306/bd_ventas?useTimezone=true&serverTimezone=UTC";
    static String user = "root";
    static String pass = "12qwaszxF";

    public Connection Conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de Conexion a Base de Datos : " + e);
        }
        return con;

    }

    public static Connection ConectarDB() {
        Connection conex = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de Conexion a Base de Datos : " + e);
        }
        return conex;

    }
}
