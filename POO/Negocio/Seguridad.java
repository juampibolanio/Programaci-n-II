public class Seguridad extends Persona {
    private int nroSector;

    public Seguridad(String nombreYApellido, int dni, int nroSector) {
        super(nombreYApellido, dni);
        this.nroSector = nroSector;
    }

}
