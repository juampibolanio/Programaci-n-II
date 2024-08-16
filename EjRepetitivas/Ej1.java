package EjRepetitivas;
/*
 * Obtener un algoritmo que imprima por pantalla todos los números pares del 2 al 300.
 */
public class Ej1 {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 300; i+=2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
