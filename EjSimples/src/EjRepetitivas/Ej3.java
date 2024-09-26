package EjRepetitivas;

import java.util.Scanner;

/*
 * Calcular la suma y el promedio de números ingresados. La cantidad de números a ingresar no se conoce, 
 * pero se sabe que deben pertenecer al rango [0,100]. La carga finaliza cuando el usuario ingresa un valor fuera del rango.
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int suma = 0;
        int totalIngresados = 0;

        System.out.println("Ingrese números de un rango de 1 a 100: ");

        while (true) {
            num = sc.nextInt();
            
            if (num < 0 || num > 100) {
                break;  
            }
            suma += num;
            totalIngresados += 1;
        }
    
        double promedio = suma / totalIngresados;

        System.out.println("La suma de todos los números ingresados es de: " + suma);
        System.out.println("El promedio es de: " +  promedio);
        sc.close();
    }
}
