package EjDecisiones;

import java.util.Scanner;

/*
 * Determinar si un alumno aprueba o desaprueba un curso,
 *  sabiendo que aprueba si su promedio de tres calificaciones es mayor o igual a 60; desaprueba en caso contrario
 */
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la nota del primer exámen: ");
        int nota1 = sc.nextInt();

        System.out.println("Ingrese la nota del segundo exámen: ");
        int nota2 = sc.nextInt();

        System.out.println("Ingrese la nota del tercer exámen: ");
        int nota3 = sc.nextInt();

        double promedio = nota1 + nota2 + nota3;

        if (promedio >= 60) {
            System.out.println("Felicidades, usted aprobó.");
        } else {
            System.out.println("No ha aprobado.");
        }


        sc.close();
    }

}
