package EjDecisiones;

import java.util.Scanner;

/*
 * Hacer un algoritmo que imprima el nombre de un artículo, clave, precio original y su precio con descuento. 
 * El descuento lo hace en base a la clave, si la clave es 01 el descuento es del 10% 
 * y si la clave es 02 el descuento en del 20% (solo existen dos claves).
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del artículo: ");
        String articulo = sc.next();

        System.out.println("Ingrese la clave del artículo: ");
        int clave = sc.nextInt();

        System.out.println("Ingrese el precio del artículo: ");
        int precio = sc.nextInt();

        double descuento = 0;
        double precioTotal = 0;

        if (clave == 01) {
            descuento = precio * 0.10;
            precioTotal = precio - descuento;
        } else if (clave == 02) {
            descuento = precio * 0.20;
            precioTotal = precio - descuento;
        } else {
            precioTotal = precio;
        }

        System.out.println("Nombre del artículo: " + articulo);
        System.out.println("Precio original: " + precio);
        System.out.println("Precio total: " +  precioTotal);

        sc.close();
    }
}
