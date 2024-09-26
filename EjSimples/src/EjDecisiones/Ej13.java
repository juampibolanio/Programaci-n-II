package EjDecisiones;
/*
 * Una compañía de seguros está abriendo un depto. de finanzas y estableció un programa para captar clientes, que consiste en lo siguiente: 
 * Si el monto por el que se efectúa la fianza es menor que $50 000 la cuota a pagar será por el 3% del monto, 
 * y si el monto es mayor que $50 000 la cuota a pagar será el 2% del monto. La compañía desea determinar cuál será la cuota que debe pagar un cliente.
 */
import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto de la fianza: ");
        double fianza = sc.nextDouble();

        double cuota = 0;

        if (fianza < 50000) {
            cuota = fianza * 0.03;
        } else {
            cuota = fianza * 0.02;
        }

        System.out.println("La cuota que debe pagar es de: $" + cuota);
        sc.close();
    }
}