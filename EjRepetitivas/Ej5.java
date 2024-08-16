package EjRepetitivas;

import java.util.Scanner;

/*
 * Dado un número ingresado por el usuario determinar si es primo o no.
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número para saber si es primo: ");
        int num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        sc.close();
    }

    public static boolean esPrimo(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}