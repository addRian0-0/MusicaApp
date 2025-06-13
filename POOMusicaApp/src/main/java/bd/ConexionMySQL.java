package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    public static Connection getConnection() {
        Connection conexion = null;

        String url = "jdbc:mysql://localhost:3306/POO_MUSICA?serverTimezone=UTC";
        String usuario = "addrian";
        String contraseña = "Addrian80642325!";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conexion;
    }

}

