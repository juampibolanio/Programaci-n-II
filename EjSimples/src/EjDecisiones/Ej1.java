package EjDecisiones;
/*
Escribir dos funciones que resuelvan los siguientes problemas:
a) Dado un número entero n, indicar si es par o no.
b) Dado un número entero n, indicar si es primo o no.
 */

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int number = sc.nextInt();

        //llamo a las funciones
        esPar(number);

        if (esPrimo(number)) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }

        sc.close();
    }


    public static void esPar(int num) {

        if (num % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado no es par.");
        }
    }

    public static boolean esPrimo(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % 2 == 0) {
                return false;
            }
        }

        return true;
    }
}