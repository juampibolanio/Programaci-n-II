
import java.util.Scanner;
public class Maina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Birome birome1 = new Birome(100);
        Papel papel1 = new Papel();

        System.out.println("Ingrese el texto que desea escribir: ");
        String textoParaEscribir = sc.nextLine();

        birome1.escribir(textoParaEscribir, papel1);
        
        System.out.println("Tinta restante: " + birome1.getCantidadTinta());

        sc.close();
    }
}
