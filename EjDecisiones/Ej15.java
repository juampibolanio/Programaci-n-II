package EjDecisiones;
/*
 * Dado un numero entre 1 y 7 escriba su correspondiente día de la semana así:
1- Lunes 2- Martes 3- Miércoles 4- Jueves 5- Viernes 6- Sábado 7- Domingo
 */
import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 7: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Es lunes.");
                break;
            case 2:
                System.out.println("Es martes.");
                break;
            case 3:
                System.out.println("Es miércoles.");
                break;
            case 4:
                System.out.println("Es jueves.");
                break;
            case 5:
                System.out.println("Es viernes.");
                break;
            case 6:
                System.out.println("Es sábado.");
                break;
            case 7:
                System.out.println("Es domingo.");
                break;
            default:
                System.out.println("El número no corresponde a ningún día de la semana.");
                break;
        }
        sc.close();
    }
}
