package EjSecuenciales;
/*
En un hospital existen 3 áreas: Urgencias, Pediatría y Traumatología. El presupuesto anual del hospital se reparte de la siguiente manera:
Área    Presupuesto
Urgencias   37%
Pediatría   42%
Traumatología   21%
Obtener la cantidad de dinero que recibirá cada área para cualquier monto presupuestal.
 */
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto presupuestal total: ");
        double budget = sc.nextInt();

        double urgencia = budget * 0.37;
        double pediatria = budget * 0.42;
        double traumatologia = budget * 0.21;

        System.out.println("A cada área le corresponderán los siguientes montos: ");
        System.out.println("Urgencia " +  urgencia);
        System.out.println("Pediatría: " + pediatria);
        System.out.println("Traumatología: " +  traumatologia);
        sc.close();
    }
}
