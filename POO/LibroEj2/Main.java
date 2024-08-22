package POO.LibroEj2;

public class Main {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro(1234, "El pibe", "Martín Hidalgo", 250);
        System.out.println(libro1.toString());
        Libro libro2 = new Libro(4365, "Mi planta de naranja lima", "José de Vasconcelos", 300);
        System.out.println(libro2.toString());

        String masPaginas;
        int cantidadPaginas;

        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            masPaginas = libro1.getTitulo();
            cantidadPaginas = libro1.getNumPaginas();
        } else {
            masPaginas = libro2.getTitulo();
            cantidadPaginas = libro2.getNumPaginas();
        }
        System.out.println();
        System.out.println("Entre estos libros, el de mayor número de páginas es: " + masPaginas + " con " + cantidadPaginas + " páginas.");
    }
}
