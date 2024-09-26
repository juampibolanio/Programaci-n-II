package EjRepetitivas;
/*
Crea un algoritmo que pida al usuario su código de usuario (un número entero) y su
contraseña numérica (otro número entero), 
y no le permita seguir hasta que introduzca como código 1024 y como contraseña 4567 */

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userCode;
        int password;

        while (true) {
            System.out.println("Ingrese su código de usuario: ");
            userCode = sc.nextInt();

            if (userCode == 1024) {
                break;
            } else {
                System.out.println("Usuario incorrecto, vuelva a intentar.");
                continue;
            }
        }
        
        while (true) {
            System.out.println("Ingrese su contraseña: ");
            password = sc.nextInt();

            if (password == 4567) {
                System.out.println("Sesión iniciada correctamente.");
                break;
            } else {
                System.out.println("Contraseña incorrecta, intente nuevamente.");
                continue;
            }
        }
        sc.close();
    }
}
