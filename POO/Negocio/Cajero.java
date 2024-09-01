public class Cajero extends Empleado {
    private int nroCaja;

    public Cajero(String nombreYApellido, int dni, int cantHoras, int sueldo, int nroCaja) {
        super(nombreYApellido, dni, cantHoras, sueldo);
        this.nroCaja = nroCaja;
    }


    

}
