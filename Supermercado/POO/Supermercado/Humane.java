
class Humane {

    private String nombre;
    private String apellido;
    private int dni;
  
    public Humane(String nombre, String apellido, int dni) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.dni = dni;
    }

    public String toString() {
      return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nDNI: " + this.dni;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public String getApellido() {
      return apellido;
    }

    public void setApellido(String apellido) {
      this.apellido = apellido;
    }

    public int getDni() {
      return dni;
    }

    public void setDni(int dni) {
      this.dni = dni;
    }
  }