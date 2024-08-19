package POO.BancoEJ1;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------] Bienvenido al banco [-----------");
        System.out.print("- Ingrese el nombre del titular: ");
        String nombreTitular = sc.nextLine();
        System.out.println();
        
        Cuenta cuenta1 = new Cuenta(nombreTitular, 0);

        boolean salir = false;
        int opcion;

            System.out.println("--| BIENVENIDO " + cuenta1.getTitular() + " |--");
        while (!salir) {
            System.out.println("- Balance actual: $" + cuenta1.getCantidad());
            System.out.println("- |1| Ingresar dinero");
            System.out.println("- |2| Retirar dinero");
            System.out.println("- |3| Salir ");
            System.out.println("---------------------------------------------");
            System.out.print("- Ingrese la opción que desea: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("- Balance actual: $" + cuenta1.getCantidad());
                System.out.print("- Ingrese el monto a añadir: ");
                double monto = sc.nextDouble();

                cuenta1.ingresarDinero(monto);
                System.out.println("Operación finalizada.");
                System.out.println("- Balance actual: $" + cuenta1.getCantidad());
                System.out.println();
            } else if (opcion == 2) {
                System.out.println("- Balance actual: $" + cuenta1.getCantidad());
                System.out.print("- Ingrese el monto a retirar: ");
                double monto = sc.nextDouble();
                
                cuenta1.retirarDinero(monto);
                System.out.println("Operación finalizada.");
                System.out.println("- Balance actual: $" + cuenta1.getCantidad());
                System.out.println();
            } else if (opcion == 3) {
                salir = true;
                System.out.println("Gracias por utilizar nuestros servicios");
            } else {
                System.out.println("- Opción no válida. Ingrese nuevamente.");
            }
        }
        sc.close();
    }
}