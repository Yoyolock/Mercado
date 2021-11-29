package Mercado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Mercado", "postgres", "kkck1234");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}

