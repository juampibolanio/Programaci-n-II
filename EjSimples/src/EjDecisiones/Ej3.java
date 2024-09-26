package EjDecisiones;

import java.util.Scanner;

/*
Escribir funciones que resuelvan los siguientes problemas:
a) Dado un año indicar si es bisiesto. Nota: un año es bisiesto si es un número divisible por
4, pero no si es divisible por 100, excepto que también sea divisible por 400.

 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(esBisiesto(n));
        sc.close();
    }


    public static boolean esBisiesto(int año) {

        if ((año % 4 == 0) && (año % 100 != 0)) {
            return true;
        } else if ((año % 100 == 0) && (año % 400 == 0)) {
            return true;
        }

        return false;
    }

}
