package Mercado;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Funciones {

    //Se crea el CRUD de Clientes

    public static void crearClienteDB(Cliente cliente){
        Conexion dbConnect = new Conexion();

        try(Connection connection = dbConnect.get_connection()){
            PreparedStatement ps = null;
                try{
                    String query = "INSERT INTO clientes (namePersona) VALUES (?)";
                    ps = connection.prepareStatement(query);
                    ps.setString(1, cliente.getNamePersona());
                    ps.executeUpdate();
                }catch (SQLException ex){
                    System.out.println(ex);
                }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void verClienteDB(){
        Conexion dbConnect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = dbConnect.get_connection()){
            String query = "SELECT * FROM Clientes";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("ID: " + rs.getInt("IDcliente"));
                System.out.println("Nombre de cliente: " + rs.getString("namePersona"));
            }
        }catch (SQLException e){
            System.out.println("no se pudo recuperar información del cliente");
            System.out.println(e);
        }
    }
    public static void borrarClienteDB(int IDcliente){
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM Clientes WHERE IDcliente = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, IDcliente);
                ps.executeUpdate();
                System.out.println("El cliente fue eliminado del registro exitosamente");
            }catch (SQLException e){
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void  editarClientesDB(Cliente cliente){
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "UPDATE Clientes SET namePersona = ? WHERE IDcliente = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, cliente.getNamePersona());
                ps.setInt(2, cliente.getIDcliente());
                ps.executeUpdate();
                System.out.println("Cliente se ha actulizado de forma exitosa");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("No se puedo actualizar al cliente");
            }
        }catch (SQLException e){

        }
    }
}

