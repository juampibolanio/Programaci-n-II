package EjSecuenciales;

import java.util.Scanner;

/*
Escriba un algoritmo que dado el número de horas trabajadas por un empleado
y el sueldo por hora, calcule el sueldo total de ese empleado. Tenga en cuenta que las horas extras se pagan el doble.
 */
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.println("Ingrese su sueldo por hora: ");
        int sueldoHora = sc.nextInt();


        int horasNormales = horas;
        int horasExtra = 0;

        if (horasNormales > 8) {
            horasNormales = 8;
            horasExtra = horas -8;
        }

        int sueldoTotal = (horasNormales * sueldoHora) + (horasExtra * sueldoHora * 2);

        System.out.println("Su sueldo total es de: $" + sueldoTotal);
        sc.close();
    }
}
