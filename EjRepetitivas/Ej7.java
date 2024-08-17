package EjRepetitivas;

import java.util.Scanner;

/*
 * Se pide representar el algoritmo que nos calcule la suma de los N primeros números impares. 
 * Es decir, si ingresamos un 5, nos haga la suma de 1+3+5+7+9.
 */
public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        while (true) {
            System.out.println("Ingrese un número positivo: ");
            number = sc.nextInt();
            if (number > 0) {
                break;
            } else {
                System.out.println("Debe ser un número positivo.");
                continue;
            }
        }

        int sumaTotal = 0;
        int numAnterior = 1;
        
        for (int i = 0; i < number; i++) {
            sumaTotal += numAnterior;
            numAnterior += 2;
        }

        System.out.println("La suma de los " + number + " primeros números impares es de " + sumaTotal);
        sc.close();
    }

}
