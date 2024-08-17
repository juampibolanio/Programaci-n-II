package POO.Supermercado;

public class Producto {
    private String nombre;
    private int precio;
    private int cantidad;
    

    public Producto(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
    }

    public void disminuirStock(int cantidad) {
        this.cantidad -= 1;
    }
}
