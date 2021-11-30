package Mercado;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Funciones {

    //SE CREA CRUD DE CLIENTES

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
                System.out.println("---------------------------------------------------");
                System.out.println("ID: " + rs.getInt("IDcliente"));
                System.out.println("Nombre de cliente: " + rs.getString("namePersona"));
                System.out.println("---------------------------------------------------");
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

    //SE CREA CRUD DE CAJEROS

    public static void crearCajeroDB(Cajeros cajeros){
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO Cajeros (namePersona, IDcaja) VALUES (?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, cajeros.getNamePersona());
                ps.setInt(2, cajeros.getIDcaja());
                ps.executeUpdate();
                System.out.println("Se creó el cajero de forma existosa");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }
    public static void verCajerosDB(){
        Conexion dbConnect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = dbConnect.get_connection()){
            String query = "SELECT * FROM Cajeros";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("---------------------------------------------------");
                System.out.println("ID de Cajero: " + rs.getInt("IDcajeros"));
                System.out.println("ID de caja: " + rs.getInt("idcaja"));
                System.out.println("Nombre Cajero/a: "  + rs.getString("namePersona"));
                System.out.println("---------------------------------------------------");
            }
        }catch (SQLException e){
            System.out.println("No se pudo recuperar información de el/la cajero/a");
            System.out.println(e);
        }
    }
    public static void borrarCajeroDB(int IDcajeros){
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM Cajeros WHERE IDcajeros = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, IDcajeros);
                ps.executeUpdate();
                System.out.println("El cajero fue eliminado del sistema de forma existosa");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void editarCajeroDB(Cajeros cajeros){
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "UPDATE Cajeros SET namePersona = ?, idcaja = ? WHERE idcajeros = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, cajeros.getNamePersona());
                ps.setInt(2, cajeros.getIdcaja());
                ps.setInt(3, cajeros.getIDcajeros());
                ps.executeUpdate();
                System.out.println("los cajeros se han actualizado de forma exitosa");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("No se pudo actualizar la información");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    //SE CREA EL CRUD DE PRODUCTOS

    public static void crearProductosBD(Productos productos){
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO Productos (nameProducto, precio) VALUES (?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, productos.getNameProducto());
                ps.setString(2, productos.getPrecio());
                ps.executeUpdate();
                System.out.println("Se añadió el producto de forma exitosa");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void listarProductosDB(){
        Conexion dbConnect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = dbConnect.get_connection()){
            String query = "SELECT * FROM productos";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("---------------------------------------------------");
                System.out.println("ID: " + rs.getInt("IDproducto"));
                System.out.println("Nombre del producto: " + rs.getString("nameproducto"));
                System.out.println("El precio del producto es: " + rs.getString("precio"));
                System.out.println("---------------------------------------------------");
            }
        }catch (SQLException e){
            System.out.println("No se pudo recuperar información del producto");
        }
    }
    public static void borrarProductosDB(int IDproducto){
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM productos WHERE IDproducto = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, IDproducto);
                ps.executeUpdate();
                System.out.println("El producto ha sido eliminado del registro de forma exitosa");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void editarProductosDB(Productos productos){
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "UPDATE productos SET nameproducto = ?, precio = ? WHERE idproducto = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, productos.getNameProducto());
                ps.setString(2, productos.getPrecio());
                ps.setInt(3, productos.getIDproducto());
                ps.executeUpdate();
                System.out.println("La información se ha actualizado exitosamente");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("No se pudo actualizar la información");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    //SE CREA EL CRUD DE REPONEDORES

    public static void crearReponedorDB(Reponedores reponedores){
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO reponedores (namePersona) VALUES (?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, reponedores.getNamePersona());
                ps.executeUpdate();
                System.out.println("El reponedor se ha registrado de forma exitosa");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void listarReponedorDB(){
        Conexion dbConnect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = dbConnect.get_connection()){
            String query = "SELECT * FROM reponedores";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("---------------------------------------------------");
                System.out.println("ID: " + rs.getInt("idreponedor"));
                System.out.println("El nombre de el/la reponedor/a es: " + rs.getString("namePersona"));
                System.out.println("---------------------------------------------------");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void borrarReponedorDB(int IDreponedor){
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM reponedores WHERE idreponedor = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, IDreponedor);
                ps.executeUpdate();
                System.out.println("El reponedor se ha borrado del sistema de forma exitosa");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void actualizarReponedorDB(Reponedores reponedores){
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "UPDATE reponedores SET namePersona = ? WHERE idreponedor = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, reponedores.getNamePersona());
                ps.setInt(2, reponedores.getIDreponedor());
                ps.executeUpdate();
                System.out.println("La información se ha actualizado exitosamente");
            }catch (SQLException e){
                System.out.println(e);
                System.out.println("No se pudo actualizar la información");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}