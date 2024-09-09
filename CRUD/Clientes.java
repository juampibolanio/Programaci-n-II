public class Clientes {
    private int id;
    private String nombre;
    private String correo;
    private String telefono;

    public Clientes() {
    }

    public Clientes(int id, String nombre, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente: ID = " + id + "- Nombre =" + nombre + "- Correo =" + correo + "- Teléfono=" + telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    


}
