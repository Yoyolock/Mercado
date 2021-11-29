package Mercado;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println();
            System.out.println("Aplicación de mensajes \n"
                    +"1. crear cliente \n"
                    +"2. listar clientes \n"
                    +"3. eliminar clientes \n"
                    +"4. editar clientes \n"
                    +"5. salir"
                    +"\n>");
            //Se lee la opción del usuario
            opcion = reader.nextInt();

            switch (opcion){
                case 1:
                    Servicios.crearCliente();
                    break;
                case 2:
                    Servicios.verCliente();
                    break;
                case 3:
                    Servicios.borrarCliente();
                    break;
                case 4:
                    Servicios.editarCliente();
                    break;
                default:
                    break;
            }
        }while (opcion != 20);
        Conexion conexion = new Conexion();

        try(Connection cnx = conexion.get_connection()) {

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
