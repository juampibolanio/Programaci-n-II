package EjDecisiones;

/*
 * Leer 2 números; si son iguales que los multiplique, si el primero es mayor que el segundo que los reste y si no que los sume.
 */

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dos números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int resul = 0;

        if (num1 == num2) {
            resul = num1 * num2;
        } else if (num1 > num2){
            resul = num1 - num2;
        } else {
            resul = num1 + num2;
        }

        System.out.println("El resultado es: " + resul);

        sc.close();
    }

}
