package EjDecisiones;

import java.util.Scanner;

/*
Escribir una implementación propia de la función abs, que devuelva el valor absoluto de
cualquier valor que reciba.
 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int number = sc.nextInt();

        //llamo a la funcion

        valorAbsoluto(number);
        sc.close();
    }


    public static void valorAbsoluto(int num) {
        if (num >= 0) {
            System.out.println("Valor absoluto = " + num);
        } else if (num < 0 ) {
            System.out.println("Valor absoluto = " + (num * -1));
        }
    }
}
