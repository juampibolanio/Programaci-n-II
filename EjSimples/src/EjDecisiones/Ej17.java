package EjDecisiones;
/*
 * Se desea leer un número de dos cifras, y que se muestre por pantalla sus dígitos. Luego informe si la suma de sus dígitos es múltiplo de 3 o no.
 */
import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número de dos cifras: ");
        int num = sc.nextInt();


        if (num >= 10 && num <= 99) {
            int decena = num / 10;
        int unidad = num % 10;

        System.out.println("El primer dígito es " + decena);
        System.out.println("El segundo dígito es " + unidad);

        int suma = unidad + decena;
        System.out.println("La suma de los dígitos es: " + suma);

        if (suma % 3 == 0) {
            System.out.println("La suma de los dígitos es múltiplo de 3.");
        } else {
            System.out.println("La suma de los dígitos no es múltiplo de 3.");
        }
        } else {
            System.out.println("El número debe ser de dos cifras.");
        }
        sc.close();
    }
}
