package EjSecuenciales;

import java.util.Scanner;

/*
Leer tres números enteros de un Digito y almacenarlos
en una sola variable que contenga a esos tres dígitos Por ejemplo si A=5 y B=6 y C=2 entonces X=562
 */
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese tres números de un dígito: ");
        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = sc.next();

        String juntar = n1 + n2 + n3;

        System.out.println(juntar);
        sc.close();
    }
}
