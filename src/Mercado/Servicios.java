package Mercado;

import java.util.Scanner;

public class Servicios {

    //SE CREAN LOS SERVICIOS CORRESPONDIENTE A LOS CLIENTES

    public static void crearCliente(){
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
        int IDcliente = reader.nextInt();
        Funciones.borrarClienteDB(IDcliente);
    }
    public static void editarCliente(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Edite el nombre del/a cliente");
        String name = reader.nextLine();

        System.out.println("Indique la ID del cliente a modificar");
        int IDcliente = reader.nextInt();
        Cliente update = new Cliente();
        update.setIDcliente(IDcliente);
        update.setNamePersona(name);
        Funciones.editarClientesDB(update);
    }

    //SE CREAN LOS SERVICIOS CORRESPONDIENTES A LOS CAJEROS

    public static void crearCajero(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Escriba el nombre de el/la cajero/a");
        String name = reader.nextLine();

        Cajeros registro = new Cajeros();
        registro.setNamePersona(name);

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
        String precio = reader.nextLine();

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
        String precio = reader.nextLine();

        Productos actualizacion = new Productos();
        actualizacion.setIDproducto(IDproducto);
        actualizacion.setNameProducto(nameProducto);
        actualizacion.setPrecio(precio);
        Funciones.editarProductosDB(actualizacion);
    }

    //SE CREAN SERVICIOS

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

}