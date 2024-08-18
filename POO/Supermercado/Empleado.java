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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
