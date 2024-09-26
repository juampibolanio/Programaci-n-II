package EjDecisiones;

import java.util.Scanner;

/*
 * Diseñar una solución que permita ingresar tres números enteros, e informe cuál es el mayor.
 */
public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[3];
        System.out.println("Ingrese tres números enteros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        int mayor = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            } 
        }

        System.out.println("El número mayor es: " + mayor);

        sc.close();
    }
}
