public abstract class Empleado extends Persona {
    protected int cantHoras;
    protected int sueldo;

    public Empleado(String nombreYApellido, int dni, int cantHoras, int sueldo) {
        super(nombreYApellido, dni);
        this.cantHoras = cantHoras;
        this.sueldo = sueldo;
    }

}