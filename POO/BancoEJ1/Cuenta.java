

/*
 * Crea una clase llamada Cuenta que tendrá los siguientes atributos:
1. titular y cantidad (puede tener decimales). Crear sus métodos get, set.
2. Crear dos constructores que permitan crear una cuenta para un titular y la cantidad.
Tendrá dos métodos especiales:
1. ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida
es negativa, no se hará nada.
2. retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual
a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
 */
public class Cuenta {
    private String titular;
    private double cantidad;
    
    public Cuenta() {
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresarDinero(double cant) {
        if (cant > 0) {
            cantidad += cant;
        }
    }

    public void retirarDinero(double cant) {
        if (cantidad - cant < 0) {
            cantidad = 0;
        } else {
            cantidad -= cant;
        }
    }
    
}