package EjSecuenciales;

import java.util.Scanner;

/*
Calcula el precio de un boleto de viaje,
tomando en cuenta el número de kilómetros que se van a recorrer, siendo el precio Bs/.10,50 por Km.
 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de kilómetros a recorrer: ");
        double km = sc.nextInt();

        double total = 10.50 * km;

        System.out.println("El precio de su boleto es de $" + total);
        sc.close();
    }
}
