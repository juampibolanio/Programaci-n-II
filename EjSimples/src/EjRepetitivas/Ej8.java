package EjRepetitivas;

import java.util.Scanner;

/*
 * Teniendo en cuenta que la clave es “111MIL”, escribir un algoritmo que nos pida una clave. Solo tenemos 3 intentos para acertar, 
 * si fallamos los 3 intentos nos mostrara un mensaje indicándonos que hemos agotado esos 3 intentos. 
 * Si acertamos la clave, saldremos del proceso.
 */
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String claveIngresada;
        String clave = "111MIL";
        int intentos = 3;

        while (intentos > 0) {
            System.out.println("Ingrese la clave: ");
            claveIngresada = sc.next();
            
            if (claveIngresada.equals(clave)) {
                System.out.println("Clave correcta.");
                break;
            } else {
                intentos -= 1;
                System.out.println("Clave incorrecta. Le quedan " + intentos + " intentos.");
            } 
        } 
        if (intentos == 0) {
            System.out.println("Ya no le quedan intentos.");
        }

        sc.close();
    }

}