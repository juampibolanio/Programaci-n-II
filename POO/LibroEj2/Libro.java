package POO.LibroEj2;
/*
 * Crear una clase Libro que contenga los siguientes atributos:
1. ISBN, Título, Autor, Número de páginas
Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el método
toString() para mostrar la información relativa al libro con el siguiente formato:
“El libro con ISBN creado por el autor tiene páginas”
Crear una aplicación que permita crear 2 objetos Libro (los valores que se quieran) y mostrarlos
por pantalla. Por último, indicar cuál de los 2 tiene más páginas.
 */

public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    public Libro(int isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + " | Título: " + titulo + " | Autor: " + autor + " | Número de páginas: " + numPaginas;
    }


    
}
