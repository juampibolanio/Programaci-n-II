public class Cliente extends Persona {
    private boolean esMayorista;
    private int nroSocio;

    public Cliente(String nombreYApellido, int dni, boolean esMayorista, int nroSocio) {
        super(nombreYApellido, dni);
        this.esMayorista = esMayorista;
        this.nroSocio = nroSocio;
    }

    
}
