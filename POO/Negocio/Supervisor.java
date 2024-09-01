public class Supervisor extends Empleado {
    private int nroSector;
    private int nroPersonasACargo;
    public Supervisor(String nombreYApellido, int dni, int cantHoras, int sueldo, int nroSector,
            int nroPersonasACargo) {
        super(nombreYApellido, dni, cantHoras, sueldo);
        this.nroSector = nroSector;
        this.nroPersonasACargo = nroPersonasACargo;
    }

    
}
