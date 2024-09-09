import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tienda miTienda = new Tienda(); //crear una nueva tienda

        Clientes cliente1 = new Clientes(10, "Marcos López", "marcoslopez@gmail.com", "3523345364");
        Clientes cliente2 = new Clientes(4, "Rocío Pereira", "rociope@gmail.com", "2345435345");
        Clientes cliente3 = new Clientes(7, "Edgardo García", "edgarcia@hotmail.com", "343565345");

        //agregar los clientes
        miTienda.agregarCliente(cliente1);
        miTienda.agregarCliente(cliente2);
        miTienda.agregarCliente(cliente3);

        //listar los clientes
        miTienda.mostrarClientes();

        //actualizar la informacion de un cliente
        miTienda.actualizarDatos(7, "Juan Pérez", "juanperez@outlook.com", "3243345453");

        //eliminar un cliente de la lista
        miTienda.eliminarCliente(10);

        //verificar si se elimino el cliente
        miTienda.mostrarClientes();

        sc.close();        
    }
}
