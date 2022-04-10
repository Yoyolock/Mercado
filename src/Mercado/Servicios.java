package Mercado;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Servicios {


    //SE CREAN LOS SERVICIOS CORRESPONDIENTE A LOS CLIENTES

    public static void crearCliente() {
        Scanner reader = new Scanner(System.in);

        System.out.println("indique el nombre del cliente");
        String name = reader.nextLine();

        Cliente registro = new Cliente();
        registro.setNamePersona(name);

        Funciones.crearClienteDB(registro);
    }
    public static void verCliente(){
        Funciones.verClienteDB();
    }
    public static void borrarCliente(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Indica la ID del cliente");
        int idcliente = reader.nextInt();

        Funciones.borrarClienteDB(idcliente);
    }
    public static void editarCliente(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Edite el nombre del/a cliente");
        String name = reader.nextLine();

        System.out.println("Indique la ID del cliente a modificar");
        int idcliente = reader.nextInt();

        Cliente update = new Cliente();
        update.setidcliente(idcliente);
        update.setNamePersona(name);
        Funciones.editarClientesDB(update);
    }

    //SE CREAN LOS SERVICIOS CORRESPONDIENTES A LOS CAJEROS

    public static void crearCajero(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Escriba el nombre de el/la cajero/a");
        String name = reader.nextLine();

        System.out.println("Asocie el cajero a la ID de alguna caja");
        int idcaja = reader.nextInt();

        Cajeros registro = new Cajeros();
        registro.setNamePersona(name);
        registro.setIdcaja(idcaja);

        Funciones.crearCajeroDB(registro);
    }
    public static void verCajeros(){
        Funciones.verCajerosDB();
    }
    public static void borrarCajero(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Indica la ID del cajero al cual quieres borrar del sistema");
        int IDcajeros = reader.nextInt();
        Funciones.borrarCajeroDB(IDcajeros);
    }
    public static void editarCajeros(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Actualiza el nombre del cajero");
        String name = reader.nextLine();

        System.out.println("Indica la ID del cajero a modificar");
        int IDcajeros = reader.nextInt();

        System.out.println("Indica la ID de la caja");
        int idcaja = reader.nextInt();

        Cajeros actualizacion = new Cajeros();
        actualizacion.setIDcajeros(IDcajeros);
        actualizacion.setNamePersona(name);
        actualizacion.setIdcaja(idcaja);
        Funciones.editarCajeroDB(actualizacion);
    }

    //SE CREAN LOS SERVICIOS CORRESPONDIENTES A LOS PORDUCTOS

    public static void crearProductos(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe el nombre del producto");
        String nameProducto = reader.nextLine();

        System.out.println("Indica el precio del producto");
        Float precio = reader.nextFloat();

        Productos registro = new Productos();
        registro.setNameProducto(nameProducto);
        registro.setPrecio(precio);

        Funciones.crearProductosBD(registro);
    }
    public static void listarProductos(){
        Funciones.listarProductosDB();
    }
    public static void borrarProductos(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Indica la ID del producto a eliminar");
        int IDproducto = reader.nextInt();
        Funciones.borrarProductosDB(IDproducto);
    }
    public static void editarProductos(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe el nuevo nombre del producto");
        String nameProducto = reader.nextLine();

        System.out.println("Indica la ID del producto a modificar");
        int IDproducto = reader.nextInt();

        System.out.println("Elige el nuevo precio de el producto");
        Float precio = reader.nextFloat();

        Productos actualizacion = new Productos();
        actualizacion.setIDproducto(IDproducto);
        actualizacion.setNameProducto(nameProducto);
        actualizacion.setPrecio(precio);
        Funciones.editarProductosDB(actualizacion);
    }

    //SE CREAN SERVICIOS DE REPONEDOR

    public static void crearReponedor(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Escribe el nombre del reponedor");
        String nameReponedor = reader.nextLine();

        Reponedores registro = new Reponedores();
        registro.setNamePersona(nameReponedor);

        Funciones.crearReponedorDB(registro);
    }
    public static void listarReponedor(){
        Funciones.listarReponedorDB();
    }
    public static void borrarReponedor(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Indica la ID del reponedor a borrar");
        int IDreponedor = reader.nextInt();
        Funciones.borrarReponedorDB(IDreponedor);
    }
    public static void editarReponedor(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Actualiza el nuevo nombre de el/la reponedor/a");
        String nameReponedor = reader.nextLine();

        System.out.println("Indica la ID del reponedor a modificar");
        int IDreponedor = reader.nextInt();

        Reponedores actualizacion = new Reponedores();
        actualizacion.setNamePersona(nameReponedor);
        actualizacion.setIDreponedor(IDreponedor);
        Funciones.actualizarReponedorDB(actualizacion);
    }

    //SE CREAN LOS SERVICIOS CORRESPONDIENTES A LA BOLETA

    public static void crearBoleta(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Genere la ID de una boleta");
        int idboleta = reader.nextInt();

        System.out.println("Asigne la boleta a la ID de un cliente");
        int idcliente = reader.nextInt();

        System.out.println("Asigne la boleta a la ID de un cajero");
        int idcajeros = reader.nextInt();

        System.out.println("Asigne la boleta a la ID de una caja");
        int idcaja = reader.nextInt();

        Boleta registro = new Boleta();
        registro.setIdboleta(idboleta);
        registro.setIdcliente(idcliente);
        registro.setIdcajeros(idcajeros);
        registro.setIdcaja(idcaja);

        Funciones.crearBoletaDB(registro);
    }
    public static void mostarBoleta(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Indique cual es la ID de la boleta a vizualizar");
        int idboletaquery = reader.nextInt();
        Funciones.mostrarBoletaDB(idboletaquery);
    }
    public static void registrarHorario(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Indique el día laboral del cual quiere agregar información");
        String turno = reader.nextLine();

        System.out.println("Indique el ID del horario");
        int id = reader.nextInt();

        System.out.println("Indique la ID de la caja");
        int idcaja = reader.nextInt();

        System.out.println("Indique la ID del cajero");
        int idcajeros = reader.nextInt();

        Horario registro = new Horario();
        registro.setTurno(turno);
        registro.setId(id);
        registro.setIdcaja(idcaja);
        registro.setIdcajeros(idcajeros);

        Funciones.registrarHorarioDB(registro);
    }
    public static void registrarEntrada(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Indica la hora de entrada al dia laboral");
        String entrada = reader.nextLine();

        System.out.println("Indica la ID del día del cual quieres añadir informacón con respecto a la entrada de los tarbajadores");
        int id = reader.nextInt();

        Horario actulalizacion = new Horario();
        actulalizacion.setId(id);
        actulalizacion.setEntrada(entrada);
        Funciones.registrarEntradaDB(actulalizacion);
    }
    public static void registrarSalida(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Indica la hora de salida del día laboral");
        String salida = reader.nextLine();

        System.out.println("Indica la ID del día del cual quieres añadir informacón con respecto a la entrada de los tarbajadores");
        int id = reader.nextInt();

        Horario actualizacion = new Horario();
        actualizacion.setId(id);
        actualizacion.setSalida(salida);
        Funciones.registarSalidaDB(actualizacion);
    }
    public static void mostrarHorarios(){
        Funciones.listarHorariosDB();
    }
    public static void cierreDeCaja(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Indique la ID del dia del cual quiere obtener información");
        int id = reader.nextInt();

        System.out.println("Indique la cantidad de ventas realizadas durante ese día");
        int cantidadVentas = reader.nextInt();

        Horario registro = new Horario();
        registro.setId(id);
        registro.setCantidadVentas(cantidadVentas);
        Funciones.cierreDeCajaDB(registro);
    }
    public static void mostrarCierreDeCaja(){
        Funciones.mostrarCierreDeCajaDB();
    }
}