package POO.Supermercado;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Supermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleados empleado1 = new Empleados("Matias", "Martinez", 34790678, 5000);
        Random numAleatorio = new Random();

        System.out.println("-----------------] Bienvenido al supermercado [-----------------");
        System.out.print("- Ingrese su nombre: ");
        String nombreCliente = sc.next();
        System.out.println();
        System.out.print("- Ingrese su apellido: ");
        String apellidoCliente = sc.next();
        System.out.println();
        System.out.print("- Ingrese su número de DNI (Sin guiones ni puntos): ");
        int dniCliente = sc.nextInt();
        System.out.println();
        System.out.println("-- Los clientes mayoristas pueden acceder hasta un 30% de descuento en su compra --");
        System.out.println("--- ¿Usted es un cliente mayorista? Ingrese el número correspondiente ---");
        System.out.println("-------- [1] Sí ------------------------------- No [2] --------");
        System.out.println();

        boolean esMayorista = false;
        while (true) {
            int opcionM = sc.nextInt();
            if (opcionM == 1) {
                esMayorista = true;
                break;
            } else if (opcionM == 2) {
                esMayorista = false;
                break;
            } else {
                System.out.println("--- Opción no válida. Ingrese un valor correcto ---");
                System.out.println("--- ¿Usted es un cliente mayorista? ---");
                System.out.println("--- [1] Sí ----------------------------- No [2] ---");
            }
        }

        Cliente cliente1 = new Cliente(nombreCliente, apellidoCliente, dniCliente, esMayorista);
        boolean compraEnProceso = true;

        ArrayList<Transaccion> ticketCompra = new ArrayList<>();
        double importeTotal = 0;

        while (compraEnProceso) {
            sc.nextLine();  
            System.out.println("-----------------------------------------");
            System.out.print("- Ingrese el nombre del artículo a comprar: ");
            String nombreProducto = sc.nextLine();
            System.out.print("- Ingrese el precio unitario del producto: ");
            double precioUnitario = sc.nextDouble();
            System.out.print("- Ingrese la cantidad de unidades a comprar: ");
            int cantidadUnidades = sc.nextInt();
            System.out.println("-----------------------------------------");

            Producto nuevoProducto = new Producto(nombreProducto, precioUnitario, cantidadUnidades);
            Transaccion nuevaTransaccion = new Transaccion(nuevoProducto);
            double transaccion = nuevaTransaccion.PagarProducto();

            importeTotal += transaccion;
            ticketCompra.add(nuevaTransaccion);
            System.out.println();
            System.out.println("[---------------------------------]");
            System.out.println("- ¿Desea ingresar otro producto? -");
            System.out.println("---- [1] Sí ---------- No [2] ----");

            int opcion = sc.nextInt();
            if (opcion == 1) {
                continue;
            } else if (opcion == 2) {
                compraEnProceso = false;
            } else {
                System.out.println("-- Opción incorrecta. Vuelva a ingresar el valor --");
            }
        }

        int num = numAleatorio.nextInt(15) + 1; 

        Caja caja = new Caja(empleado1, num);

        System.out.println("-------------] Ticket de compra [-------------");
        System.out.println();
        System.out.println("- Cliente: " + cliente1.getNombre() + " " + cliente1.getApellido());
        System.out.println("- DNI: " + cliente1.getDni());
        System.out.println("- Caja N°" + caja.getNroCaja());
        System.out.println("- Atendido por: " + empleado1.getNombre() + " " + empleado1.getApellido());
        System.out.println("-------------] Productos de su compra [-------------");
        System.out.println();
        for (Transaccion transaccion2 : ticketCompra) {
            transaccion2.infoTransaccion();
        }
        System.out.println();

        if (cliente1.isMayorista()) {
            double descuento = importeTotal * 0.30;
            importeTotal -= descuento;
        }
        
        System.out.println("-----------] Importe total de su compra: $" + importeTotal + " [-----------");
        System.out.println();
        System.out.println("-- Presione ENTER para realizar el pago --");
        sc.nextLine(); 
        sc.nextLine();
        System.out.println("-- ¡Pago realizado correctamente! --");
        sc.close();
    }
}