package EjDecisiones;

import java.util.Scanner;

/*
 * Dados los lados de un triángulo, informar qué tipo es: isósceles, escaleno o equilátero.
 */
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los tres lados del triángulo: ");
        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();
        
        if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)) {
            System.out.println("El triángulo es escaleno. ");
        } else if ((lado1 == lado2) && (lado2 == lado3) && (lado1 == lado3)) {
            System.out.println("El triángulo es equilátero.");
        } else {
            System.out.println("El triángulo es isósceles.");
        }
        sc.close();
    }
}
