
class Caja {
    private Empleados empleado;
    private int nroCaja;
  
    public Caja(Empleados empleado, int nroCaja) {
      this.empleado = empleado;
      this.nroCaja = nroCaja;
    }
  
    public String toString() {
      return this.empleado.toString() + "\nNro de caja: " + this.nroCaja;
    }

    public Empleados getEmpleado() {
      return empleado;
    }

    public void setEmpleado(Empleados empleado) {
      this.empleado = empleado;
    }

    public int getNroCaja() {
      return nroCaja;
    }

    public void setNroCaja(int nroCaja) {
      this.nroCaja = nroCaja;
    }
  }