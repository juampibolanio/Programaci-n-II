package EjRepetitivas;

import java.util.Scanner;

/*
 * En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un
Algoritmo que lea los sueldos que cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 
y cuántos cobran más de $300. Además el programa deberá informar el importe que gasta la empresa en sueldos al personal.
 */
public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de empleados: ");
        int numEmpleados = sc.nextInt();

        int importeTotal = 0;
        int sueldoBasico = 0;
        int sueldoGrande = 0;

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Ingrese el sueldo del empleado N° " + (i + 1)); 
            int sueldoEmpleado = sc.nextInt();

            importeTotal += sueldoEmpleado;

            if (sueldoEmpleado >= 100 && sueldoEmpleado <= 300) {
                sueldoBasico += 1;
            } else if (sueldoEmpleado > 300) {
                sueldoGrande += 1;
            }

        }

        System.out.println("Hay " + sueldoBasico + " empleados que cobran entre $100 y $300.");
        System.out.println("Hay " + sueldoGrande + " empleados que cobran más de $300.");
        System.out.println("El importe total de gastos en sueldos es de: " + importeTotal);

        sc.close();
    }
}