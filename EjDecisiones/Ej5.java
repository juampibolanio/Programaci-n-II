package EjDecisiones;

import java.util.Scanner;

/*
 * En un almacén se hace un 20% de descuento a los clientes cuya compra supere los $1000.
 *  Mostrar por pantalla cuál será la cantidad que pagará una persona por su compra.
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto de su compra: ");
        int montoCompra = sc.nextInt();

        if (montoCompra > 1000) {
            double descuento = montoCompra * 0.20;
            System.out.println("Se le ha aplicado un %20 de descuento.");
            System.out.println("El total de su compra es de: $" + (montoCompra - descuento));
        } else {
            System.out.println("El total de su compra será de: $" + montoCompra);
        }

        sc.close();
    }

}
