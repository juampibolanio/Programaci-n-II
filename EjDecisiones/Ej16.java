package EjDecisiones;
/*
 * Elabore una solución que solicite el ingreso de un número entero distinto de 0 y se informe si es par o no
 */
import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero distinto de 0: ");
        int num = sc.nextInt();

        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Es par.");
            } else {
                System.out.println("Es impar.");
            }
        } else {
            System.out.println("El valor ingresado no corresponde.");
        }
        sc.close();
    }
}