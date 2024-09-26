package EjDecisiones;
/*
 * En una Granja existen N conejos, N1 blancos y N2 negros. Suponiendo que P1 es el
 *  precio de venta de los conejos blancos y P2 es el precio de venta de los conejos negros, 
 * imprima el monto total de la venta. Informe al final el color de los conejos que se más se vendieron.
 */
import java.util.Scanner;
public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de conejos blancos: ");
        int conejosBlancos = sc.nextInt();
        System.out.println("Ingrese el número de conejos negros: ");
        int conejosNegros = sc.nextInt();

        System.out.println("Ingrese el precio por cada uno de los conejos blancos: ");
        int precioBlancos = sc.nextInt();
        System.out.println("Ingrese el precio por cada uno de los conejos negros. ");
        int precioNegros = sc.nextInt();

        String masVendido = "";

        if (conejosBlancos > conejosNegros) {
            masVendido = "conejos blancos";
        } else {
            masVendido = "conejos negros";
        }

        int ventaTotal = (conejosBlancos * precioBlancos) + (conejosNegros * precioNegros);

        System.out.println("El monto total de la venta es de $" + ventaTotal + ". Los conejos que más se vendieron fueron los " + masVendido);

        sc.close();
    }
}
