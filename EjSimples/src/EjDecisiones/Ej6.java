package EjDecisiones;

import java.util.Scanner;

/*
 * Solicitar la edad de dos hermanos, mostrando un mensaje que informe la edad del mayor y cuántos años de diferencia tiene con el menor.
 */
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la edad del primer hermano: ");
        int edad1 = sc.nextInt();

        System.out.println("Ingrese la edad del segundo hermano: ");
        int edad2 = sc.nextInt();

        int mayor = 0;

        if (edad1 > edad2) {
            mayor = edad1;
            System.out.println("El hermano mayor tiene " + mayor + " años, la diferencia con el menor es de " + (mayor - edad2) + " años.");
        } else if (edad2 > edad1) {
            mayor = edad2;
            System.out.println("El hermano mayor tiene " + mayor + " años, la diferencia con el menor es de " + (mayor - edad1) + " años.");
        } else {
            System.out.println("Los hermanos tienen la misma edad.");
        }






        sc.close();
    }

}
