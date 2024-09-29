import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tienda miTienda = new Tienda(); //crear una nueva tienda

        boolean continuar = true;
        while (continuar) {
            System.out.println("------] Bienvenido a la tienda [------");
            System.out.println("[1] Buscar cliente ");
            System.out.println("[2] Listar clientes ");
            System.out.println("[3] Agregar cliente ");
            System.out.println("[4] Eliminar cliente ");
            System.out.println("[5] Modificar cliente ");
            System.out.println("[6] Salir");
            System.out.println("- Elija la opción que desee:  ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la id del cliente: ");
                    int idCliente = sc.nextInt();
                    sc.nextLine();
                    miTienda.buscarCliente(idCliente);
                    break;
                case 2:
                    miTienda.mostrarClientes();
                    break;
                case 3:
                    System.out.println("Ingrese la ID del cliente: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el nombre completo del cliente: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el correo electrónico del cliente: ");
                    String correo = sc.nextLine();
                    System.out.println("Ingrese el número de teléfono del cliente: ");
                    String tel = sc.nextLine();

                    Cliente cliente = new Cliente(id, nombre, correo, tel);
                    miTienda.agregarCliente(cliente);
                    break;

                case 4:
                    System.out.println("Ingrese la id del cliente que desea eliminar: ");
                    int idE = sc.nextInt();
                    miTienda.eliminarCliente(idE);
                    break;
                case 5:
                    System.out.println("Ingrese la ID del cliente que desea modificar: ");
                    int idN = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el nuevo nombre completo del cliente: ");
                    String nombreN = sc.nextLine();
                    System.out.println("Ingrese el nuevo correo electrónico del cliente: ");
                    String correoN = sc.nextLine();
                    System.out.println("Ingrese el nuevo número de teléfono del cliente: ");
                    String telN = sc.nextLine();

                    miTienda.actualizarDatos(idN, nombreN, correoN, telN);
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Ha salido.");
                    break;
                default:
                    System.out.println("Ha ingresado una opción incorrecta, intente nuevamente. ");
            }
        }
        sc.close();
    }
}