package EjDecisiones;
/*
 * Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas extras trabajadas en una empresa, 
 * sabiendo que cuando las horas de trabajo exceden de 40, el resto se consideran horas extras 
 * y que estas se pagan al doble de una hora normal cuando no exceden de 8; 
 * si las horas extras exceden de 8 se pagan las primeras 8 al doble de lo que se pagan las horas normales y el resto al triple.
 */

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su sueldo por hora: ");
        int sueldoHora = sc.nextInt();
        System.out.println("Ingrese las horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();

        int sueldoNormal = 0; 
        int sueldoDoble = 0;
        int sueldoTriple = 0;
        int sueldoTotal = 0;
        int horasExtra = 0;

        if (horasTrabajadas > 40) {
            sueldoNormal = 40 * sueldoHora;
            horasExtra = horasTrabajadas - 40;
            if (horasExtra > 8) {
                sueldoDoble = 8 * sueldoHora * 2;
                sueldoTriple = (horasExtra - 8) * sueldoHora * 3;
            } else {
                sueldoDoble = horasExtra * sueldoHora * 2;
            }
        } else {
            sueldoNormal = horasTrabajadas * sueldoHora;
        }

        sueldoTotal = sueldoNormal + sueldoTriple + sueldoDoble;

        System.out.println("Su sueldo es de: $" + sueldoTotal);
        sc.close();
    }
}
