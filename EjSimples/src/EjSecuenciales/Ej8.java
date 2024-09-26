package EjSecuenciales;
/*
 * Elabore un programa que realice la conversión de cm. a pulgadas.
a. Donde 1cm = 0.39737 pulgadas.
 */

import java.util.Scanner;
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor en centímetros (cm) >> ");
        double cm = sc.nextInt();

        double conversionPulgadas = cm * 0.393701;

        System.out.println(cm + " centímetros, equivalen a " + conversionPulgadas + " pulgadas.");

        sc.close();
    }

}
