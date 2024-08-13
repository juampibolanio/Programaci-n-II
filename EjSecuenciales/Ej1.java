package EjSecuenciales;

import java.util.Scanner;

/*
Calcula el precio de un boleto de viaje, tomando en cuenta el número de kilómetros que se van a recorrer, siendo el precio $45 por Km.
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de kilómetros a recorrer: ");
        int km = sc.nextInt();

        int total = km * 45;

        System.out.println(STR."El precio de su viaje es de: $\{total}");
        sc.close();
    
    }
}
