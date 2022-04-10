package Mercado;

import org.json.JSONArray;
import org.json.JSONObject;

import java.sql.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Scanner;


public class Funciones {

    //SE CREA CRUD DE CLIENTES

    public static void crearClienteDB(Cliente cliente) {
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO clientes (namePersona) VALUES (?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, cliente.getNamePersona());
                ps.executeUpdate();
                System.out.println("Se registró cliente de forma exitosa");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void verClienteDB() {
        Conexion dbConnect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = dbConnect.get_connection()) {
            String query = "SELECT * FROM Clientes";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("---------------------------------------------------");
                System.out.println("ID: " + rs.getInt("IDcliente"));
                System.out.println("Nombre de cliente: " + rs.getString("namePersona"));
                System.out.println("---------------------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("no se pudo recuperar información del cliente");
            System.out.println(e);
        }
    }

    public static void borrarClienteDB(int IDcliente) {
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM Clientes WHERE IDcliente = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, IDcliente);
                ps.executeUpdate();
                System.out.println("El cliente fue eliminado del registro exitosamente");
            } catch (SQLException e) {
                System.out.println("No se pudo eliminar la información dentro del sistema");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void editarClientesDB(Cliente cliente) {
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE Clientes SET namePersona = ? WHERE idcliente = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, cliente.getNamePersona());
                ps.setInt(2, cliente.getidcliente());
                ps.executeUpdate();
                System.out.println("Cliente se ha actulizado de forma exitosa");
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("No se puedo actualizar al cliente");
            }
        } catch (SQLException e) {

        }
    }

    //SE CREA CRUD DE CAJEROS

    public static void crearCajeroDB(Cajeros cajeros) {
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO Cajeros (namePersona, idcaja) VALUES (?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, cajeros.getNamePersona());
                ps.setInt(2, cajeros.getidcaja());
                ps.executeUpdate();
                System.out.println("Se creó el cajero de forma existosa");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void verCajerosDB() {
        Conexion dbConnect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = dbConnect.get_connection()) {
            String query = "SELECT * FROM Cajeros";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("---------------------------------------------------");
                System.out.println("ID de Cajero: " + rs.getInt("IDcajeros"));
                System.out.println("ID de caja: " + rs.getInt("idcaja"));
                System.out.println("Nombre Cajero/a: " + rs.getString("namePersona"));
                System.out.println("---------------------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo recuperar información de el/la cajero/a");
            System.out.println(e);
        }
    }

    public static void borrarCajeroDB(int IDcajeros) {
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM Cajeros WHERE IDcajeros = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, IDcajeros);
                ps.executeUpdate();
                System.out.println("El cajero fue eliminado del sistema de forma existosa");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void editarCajeroDB(Cajeros cajeros) {
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE Cajeros SET namePersona = ?, idcaja = ? WHERE idcajeros = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, cajeros.getNamePersona());
                ps.setInt(2, cajeros.getIdcaja());
                ps.setInt(3, cajeros.getIDcajeros());
                ps.executeUpdate();
                System.out.println("los cajeros se han actualizado de forma exitosa");
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("No se pudo actualizar la información");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //SE CREA EL CRUD DE PRODUCTOS

    public static void crearProductosBD(Productos productos) {
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO Productos (nameProducto, precio) VALUES (?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, productos.getNameProducto());
                ps.setFloat(2, productos.getPrecio());
                ps.executeUpdate();
                System.out.println("Se añadió el producto de forma exitosa");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void listarProductosDB() {
        Conexion dbConnect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = dbConnect.get_connection()) {
            String query = "SELECT * FROM productos";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("---------------------------------------------------");
                System.out.println("ID: " + rs.getInt("IDproducto"));
                System.out.println("Nombre del producto: " + rs.getString("nameproducto"));
                System.out.println("El precio del producto es: " + rs.getString("precio"));
                System.out.println("---------------------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo recuperar información del producto");
        }
    }

    public static void borrarProductosDB(int IDproducto) {
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM productos WHERE IDproducto = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, IDproducto);
                ps.executeUpdate();
                System.out.println("El producto ha sido eliminado del registro de forma exitosa");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void editarProductosDB(Productos productos) {
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE productos SET nameproducto = ?, precio = ? WHERE idproducto = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, productos.getNameProducto());
                ps.setFloat(2, productos.getPrecio());
                ps.setInt(3, productos.getIDproducto());
                ps.executeUpdate();
                System.out.println("La información se ha actualizado exitosamente");
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("No se pudo actualizar la información");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //SE CREA EL CRUD DE REPONEDORES

    public static void crearReponedorDB(Reponedores reponedores) {
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO reponedores (namePersona) VALUES (?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, reponedores.getNamePersona());
                ps.executeUpdate();
                System.out.println("El reponedor se ha registrado de forma exitosa");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void listarReponedorDB() {
        Conexion dbConnect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connection = dbConnect.get_connection()) {
            String query = "SELECT * FROM reponedores";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("---------------------------------------------------");
                System.out.println("ID: " + rs.getInt("idreponedor"));
                System.out.println("El nombre de el/la reponedor/a es: " + rs.getString("namePersona"));
                System.out.println("---------------------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void borrarReponedorDB(int IDreponedor) {
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM reponedores WHERE idreponedor = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, IDreponedor);
                ps.executeUpdate();
                System.out.println("El reponedor se ha borrado del sistema de forma exitosa");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void actualizarReponedorDB(Reponedores reponedores) {
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE reponedores SET namePersona = ? WHERE idreponedor = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, reponedores.getNamePersona());
                ps.setInt(2, reponedores.getIDreponedor());
                ps.executeUpdate();
                System.out.println("La información se ha actualizado exitosamente");
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("No se pudo actualizar la información");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void crearBoletaDB(Boleta boleta) {
        Conexion dbConnect = new Conexion();

        try (Connection connection = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            ResultSet rs = null;
            try {
                String query = "INSERT INTO boleta (idboleta, idcaja, idcajeros, idcliente, fecha) VALUES (?,?,?,?,?)";
                ps = connection.prepareStatement(query);
                ps.setInt(1, boleta.getIdboleta());
                ps.setInt(2, boleta.getIdcaja());
                ps.setInt(3, boleta.getIdcajeros());
                ps.setInt(4, boleta.getIdcliente());
                ps.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
                ps.setTimestamp(5, Timestamp.from(Instant.now()));
                ps.executeUpdate();
                int opcion = 1;
                do{
                    Scanner reader = new Scanner(System.in);
                    System.out.println("¿Desea agregar productos a la boleta?\n"
                                        +"1. Si\n"
                                        +"2. No\n");
                    opcion = reader.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("A continuación indique la ID del producto que desea agregar a la boleta");
                            int idproducto = reader.nextInt();
                            System.out.println("Inidique la cantidad de este producto que desea agregar");
                            int cantidad = reader.nextInt();
                            String query2 = "INSERT INTO boletaproducto (idboleta, idproducto, cantidad) VALUES (?,?,?)";
                            ps = connection.prepareStatement(query2);
                            ps.setInt(1, boleta.getidboleta());
                            ps.setInt(2, idproducto);
                            ps.setInt(3, cantidad);
                            ps.executeUpdate();
                        case 2:
                            break;
                        default:
                    }
                }while (opcion != 2);
                System.out.println(" \n Operación realizada exitosamente");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
        }
    }
    public static void mostrarBoletaDB(int idboletaquery) {
        Conexion dbConnect = new Conexion();
        PreparedStatement psTraevalores = null;
        ResultSet RStraeValores = null;
        //Se crea el objeto mostrarBoletaJSON de tipo de dato JSON
        JSONObject mostrarBoletaJSON = new JSONObject();
        //Se añaden variables de la boleta
        try (Connection connection = dbConnect.get_connection()){
            String traerVariables = "SELECT * FROM boleta WHERE idboleta =" + idboletaquery;
            psTraevalores = connection.prepareStatement(traerVariables);
            RStraeValores = psTraevalores.executeQuery();
            RStraeValores.next();
            mostrarBoletaJSON.put("ID de la boleta es: ", idboletaquery);
            mostrarBoletaJSON.put("La ID de la caja es: ", RStraeValores.getInt("idcaja"));
            mostrarBoletaJSON.put("La ID del cajero es: ", RStraeValores.getInt("idcajeros"));
            mostrarBoletaJSON.put("Su ID como cliente es: ", RStraeValores.getInt("idcliente"));
            mostrarBoletaJSON.put("Fecha: ", RStraeValores.getTimestamp("fecha"));
        }catch (SQLException e){
            System.out.println(e);
        }
        try (Connection connection = dbConnect.get_connection()) {
            String productos = "SELECT * FROM boletaproducto WHERE idboleta = " + idboletaquery;
            PreparedStatement psTraeProductos = null;
            ResultSet queryProductos = null;
            psTraeProductos = connection.prepareStatement(productos);
            queryProductos = psTraeProductos.executeQuery();

            //Se crea el Arraylist de productos
            JSONArray listaProducto = new JSONArray();
            while (queryProductos.next()) {
                //Se crea el JSONOBJECT del producto y se añade a la lista
                PreparedStatement psIngresaProducto = null;
                ResultSet rsIngresaProducto = null;
                String producto = "SELECT * FROM productos WHERE idproducto = " + queryProductos.getInt("idproducto");
                psIngresaProducto = connection.prepareStatement(producto);
                rsIngresaProducto = psIngresaProducto.executeQuery();
                rsIngresaProducto.next();
                JSONObject productoJSON = new JSONObject();
                productoJSON.put("Nombre: ", rsIngresaProducto.getString("nameproducto"));
                productoJSON.put("ID del producto: ", rsIngresaProducto.getInt("idproducto"));
                productoJSON.put("precio: ", rsIngresaProducto.getFloat("precio"));
                listaProducto.put(productoJSON);
            }
            //Se añade listaproducto al objeto JSON mostrarBoletaJSON
            mostrarBoletaJSON.put("Productos: ",listaProducto);
            System.out.println("Su boleta es: " + mostrarBoletaJSON);


        } catch (SQLException e) {
            System.out.println("\n No se pudo listar los productos");
            System.out.println(e);
        }
    }
    public static void registrarHorarioDB(Horario horario){
        Conexion dbConnect = new Conexion();
        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement PSregistrador = null;
            try {
                String horarioRegistro = "INSERT INTO registrohorario (turno, entrada, salida, idcaja, idcajeros, id, cantidadventas) VALUES (?,?,?,?,?,?,?)";
                PSregistrador = connection.prepareStatement(horarioRegistro);
                PSregistrador.setString(1, horario.getTurno());
                PSregistrador.setString(2, "");
                PSregistrador.setString(3, "");
                PSregistrador.setInt(4, horario.getIdcaja());
                PSregistrador.setInt(5, horario.getIdcajeros());
                PSregistrador.setInt(6, horario.getId());
                PSregistrador.setInt(7, horario.getCantidadVentas());
                PSregistrador.executeUpdate();
                System.out.println("\nSe ha registrado con exito el horario");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void registrarEntradaDB(Horario horario){
        Conexion dbConnect = new Conexion();
        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement PSregistroEntrada = null;
            try {
                String registroEntrada = "UPDATE registrohorario SET entrada = ? WHERE id = ?";
                PSregistroEntrada = connection.prepareStatement(registroEntrada);
                PSregistroEntrada.setString(1, horario.getEntrada());
                PSregistroEntrada.setInt(2, horario.getId());
                PSregistroEntrada.executeUpdate();
                System.out.println("Se registro la entrada de forma exitosa");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void registarSalidaDB(Horario horario){
        Conexion dbConnect = new Conexion();
        try (Connection connection = dbConnect.get_connection()){
            PreparedStatement PSregistroSalida = null;
            try {
                String registroEntrada = "UPDATE registrohorario SET salida = ? WHERE id = ?";
                PSregistroSalida = connection.prepareStatement(registroEntrada);
                PSregistroSalida.setString(1, horario.getSalida());
                PSregistroSalida.setInt(2, horario.getId());
                PSregistroSalida.executeUpdate();
                System.out.println("Se registro la salida de forma exitosa");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void listarHorariosDB(){
        Conexion dbConnect = new Conexion();
        PreparedStatement PSmostrarHorarios = null;
        ResultSet RSmostrarHorarios = null;

        try (Connection connection = dbConnect.get_connection()){
            String listarHorarios = "SELECT * FROM registrohorario";
            PSmostrarHorarios = connection.prepareStatement(listarHorarios);
            RSmostrarHorarios = PSmostrarHorarios.executeQuery();

            while (RSmostrarHorarios.next()){
                System.out.println("---------------------------------------------------");
                System.out.println("ID: " + RSmostrarHorarios.getInt("id"));
                System.out.println("Fecha: " + RSmostrarHorarios.getString("turno"));
                System.out.println("Entrada: " + RSmostrarHorarios.getString("entrada"));
                System.out.println("Salida: " + RSmostrarHorarios.getString("salida"));
                System.out.println("ID caja: " + RSmostrarHorarios.getInt("idcaja"));
                System.out.println("ID cajero: " + RSmostrarHorarios.getInt("idcajeros"));
                System.out.println("---------------------------------------------------");
            }
        }catch (SQLException e){
            System.out.println("No se pudo listar los horarios");
            System.out.println(e);
        }
    }
    public static  void cierreDeCajaDB(Horario registro){
        Conexion dbConnect = new Conexion();
        PreparedStatement PSmostrarCaja = null;
        //Se añaden variables a la caja
        try (Connection connection = dbConnect.get_connection()){
            String mostrarCaja = "UPDATE registrohorario SET cantidadventas = ? WHERE id = ?";
            PSmostrarCaja = connection.prepareStatement(mostrarCaja);
            PSmostrarCaja.setInt(1, registro.getCantidadVentas());
            PSmostrarCaja.setInt(2, registro.getId());
            PSmostrarCaja.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void mostrarCierreDeCajaDB(){
        Conexion dbConnect = new Conexion();
        PreparedStatement PSmostrarCierreDeCaja = null;
        ResultSet RSmostrarCierreDeCaja = null;
        try (Connection connection = dbConnect.get_connection()){
            String mostrarCierreDeCaja = "SELECT cantidadventas, idcajeros, turno, idcaja FROM registrohorario";
            PSmostrarCierreDeCaja = connection.prepareStatement(mostrarCierreDeCaja);
            RSmostrarCierreDeCaja = PSmostrarCierreDeCaja.executeQuery();

            while (RSmostrarCierreDeCaja.next()){
                System.out.println("---------------------------------------------------");
                System.out.println("Cantidad de ventas: " + RSmostrarCierreDeCaja.getInt("cantidadventas"));
                System.out.println("Día del cual se adquiere información: " + RSmostrarCierreDeCaja.getString("turno"));
                System.out.println("Caja utilizada: " + RSmostrarCierreDeCaja.getInt("idcaja"));
                System.out.println("Cajero al servicio de la caja: " + RSmostrarCierreDeCaja.getInt("idcajeros"));
                System.out.println("---------------------------------------------------");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
