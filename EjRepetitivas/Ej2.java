package EjRepetitivas;
/*
 * Obtener un algoritmo que imprima por pantalla 
 * todos los números comprendidos entre el 5 y el 230, pero en orden inverso. Por ejemplo: 230,229,228,……………….,6,5.
 */
public class Ej2 {
    public static void main(String[] args) {
        for (int i = 230; i >= 5; i--) {
            System.out.println(i);
        }
    }
}