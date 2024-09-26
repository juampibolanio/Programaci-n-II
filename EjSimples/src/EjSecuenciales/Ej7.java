package EjSecuenciales;
/*
Un profesor desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en un grupo de estudiantes.
 */
import java.util.Scanner;
public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de hombres: ");
        double numHombres = sc.nextInt();
        System.out.println("Ingrese el número de mujeres: ");
        double numMujeres = sc.nextInt();

        double total = numHombres + numMujeres;
        
        double porcentajeHombres = (numHombres / total) * 100;
        double porcentajeMujeres = (numMujeres / total) * 100;

        System.out.println("En el grupo de estudiantes el % " + porcentajeHombres + " son hombres y el % " + porcentajeMujeres + " son mujeres.");

        sc.close();
    }
}
