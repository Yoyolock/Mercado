package Mercado;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static int idboleta;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("Opciones CRUD clientes \n"
                    +"1. Crear cliente \n"
                    +"2. Listar clientes \n"
                    +"3. Eliminar clientes \n"
                    +"4. Editar clientes \n");
            System.out.println("------------------");
            System.out.println("Opciones CURD Cajeros \n"
                    +"5. Crear cajeros \n"
                    +"6. Listar cajeros \n"
                    +"7. Eliminar cajeros \n"
                    +"8. Editar cajeros \n");
            System.out.println("------------------");
            System.out.println("Opciones CRUD Productos \n"
                    +"9. Crear productos (para los precios: utilizar 'coma' y no 'punto')\n"
                    +"10. Listar productos \n"
                    +"11. Eliminar productos \n"
                    +"12. Editar productos \n");
            System.out.println("------------------");
            System.out.println("Opciones CRUD Reponedores \n"
                    +"13. Crear reponedor \n"
                    +"14. Listar reponedores \n"
                    +"15. Eliminar reponedor \n"
                    +"16. Edtiar reponedor \n");
            System.out.println("------------------");
            System.out.println("Gestión de boleta \n"
                    +"17. Crear boleta y asociarla a un cliente, cajero y caja \n"
                    +"18. Listar los productos dentro de la boleta\n");
            System.out.println("------------------\n"
                    +"Opciones de Horario\n"
                    +"19. Registrar horario\n"
                    +"20. Registrar entrada\n"
                    +"21. Registrar Salida\n"
                    +"22. Listar Horarios\n");
            System.out.println("------------------\n"
                    +"Opciones del cierre de caja\n"
                    +"23. Configurar cierre de caja\n"
                    +"24. Mostrar cierre de caja\n"
                    +"25. Salir\n"
                    +"-> ");

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
                case 5:
                    Servicios.crearCajero();
                    break;
                case 6:
                    Servicios.verCajeros();
                    break;
                case 7:
                    Servicios.borrarCajero();
                    break;
                case 8:
                    Servicios.editarCajeros();
                    break;
                case 9:
                    Servicios.crearProductos();
                    break;
                case 10:
                    Servicios.listarProductos();
                    break;
                case 11:
                    Servicios.borrarProductos();
                    break;
                case 12:
                    Servicios.editarProductos();
                    break;
                case 13:
                    Servicios.crearReponedor();
                    break;
                case 14:
                    Servicios.listarReponedor();
                    break;
                case 15:
                    Servicios.borrarReponedor();
                    break;
                case 16:
                    Servicios.editarReponedor();
                    break;
                case 17:
                    Servicios.crearBoleta();
                    break;
                case 18:
                    Servicios.mostarBoleta();
                    break;
                case 19:
                    Servicios.registrarHorario();
                    break;
                case 20:
                    Servicios.registrarEntrada();
                    break;
                case 21:
                    Servicios.registrarSalida();
                    break;
                case 22:
                    Servicios.mostrarHorarios();
                    break;
                case 23:
                    Servicios.cierreDeCaja();
                    break;
                case 24:
                    Servicios.mostrarCierreDeCaja();
                default:
                    break;
            }
        }while (opcion != 25);
        Conexion conexion = new Conexion();

        try(Connection cnx = conexion.get_connection()) {
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}

