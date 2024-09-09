public class Birome {
    private int cantidadTinta;

    public Birome(int cantidadTinta) {
        this.cantidadTinta = cantidadTinta;
    }

    public void escribir(String texto, Papel papel) {
        int caracteresAEscribir = texto.length();

        if (caracteresAEscribir < cantidadTinta) {
            String textoAEscribir = texto.substring(0, caracteresAEscribir);
            papel.escribir(textoAEscribir);
            cantidadTinta -= caracteresAEscribir;
        }

        if (cantidadTinta == 0) {
            System.out.println("La tinta se ha acabado. No es posible escribir más.");
        }
    }

    public int getCantidadTinta() {
        return cantidadTinta;
    }    

    



}
