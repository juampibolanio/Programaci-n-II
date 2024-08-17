package POO.Supermercado;

class Empleado extends Humane {

    private double sueldo;

    public Empleado(String nombre, String apellido, int dni, double sueldo) {
    super(nombre, apellido, dni);
    this.sueldo = sueldo;
    }

    public String toString() {
    return "\n" + super.toString() + "\nSueldo: " + this.sueldo;
    }
}
