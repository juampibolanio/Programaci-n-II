package EjRepetitivas;

import java.util.Scanner;

/*
 * Escriba un algoritmo que permita ingresar un Número N positivo y muestre por pantalla la suma de sus dígitos.
 */
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero positivo: ");

        int num;
        while (true) {
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("El número debe ser positivo.");
            } else{
                break;
            }
        }
        
        int suma = 0;
        int numTemporal = num;

        while (numTemporal > 0) {
            int digito = numTemporal % 10;

            suma += digito;
            numTemporal /= 10;
        }

        System.out.println("La suma de los dígitos es: " + suma);
        sc.close();
    }
}