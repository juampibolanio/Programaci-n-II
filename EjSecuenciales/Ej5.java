package EjSecuenciales;

import java.util.Scanner;

/*
Leer dos números y encontrar:
a. La suma del doble del primero más el cuadrado del segundo.
b. El promedio de sus cubos.
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        double n1 = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        double n2 = sc.nextInt();

        double suma = (n1 * 2) + Math.pow(n2, 2);
        double promedio = (((Math.pow(n1, 3)) + (Math.pow(n2, 3))) / 2);

        System.out.println("Los resultados son: ");
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        sc.close();
    }
}
