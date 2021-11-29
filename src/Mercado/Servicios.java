package Mercado;

import java.util.Scanner;

public class Servicios {

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

}
