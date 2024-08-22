package POO.EscrituraEJ3;
/*
 * Escribir una clase Papel que contenga un atributo texto, un método escribir, que reciba una
cadena de caracteres para agregar al texto, y el método toString() que imprima el contenido del
texto.
Escribir una clase Birome que contenga un atributo cantidad de tinta, y un método escribir, que
reciba un texto y un papel (objeto de la clase Papel) sobre el cual escribir. Cada letra escrita
debe reducir la cantidad de tinta contenida. Cuando la tinta se acabe, debe imprimir un mensaje
de error indicando que la tinta se ha acabado.
 */
public class Papel {
    private String texto;

    public Papel() {
        this.texto = "";
    }

    public void escribir(String cadenaCaracteres) {
        this.texto += cadenaCaracteres;
    }

    @Override
    public String toString() {
        return texto;
    }

    
}
