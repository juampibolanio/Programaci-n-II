package POO.PersonasEJ4;

import java.util.Random;

public class Personas {
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    public Personas() {
        this.dni = generaDNI(); 
        this.sexo = 'H'; 
    }

    public Personas(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI(); 
        comprobarSexo(sexo);
    }

    public Personas(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI(); 
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public String calcularIMC() {
        double imc = this.peso / Math.pow(this.altura, 2);
    
        if (imc < 20) {
            return "Se encuentra debajo de su peso ideal.";
        } else if (imc >= 20 && imc <= 25) {
            return "Se encuentra en su peso ideal.";
        } else {
            return "Se encuentra con sobrepeso.";
        }
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    public void comprobarSexo(String sexo) {
        char sexoChar = sexo.charAt(0); // Corregido para tomar el primer carácter
        if (sexoChar != 'H' && sexoChar != 'M') {
            this.sexo = 'H'; // Valor por defecto si el sexo no es válido
        } else {
            this.sexo = sexoChar;
        }
    }

    public int generaDNI() {
        Random random = new Random();
        return 10000000 + random.nextInt(90000000); 
    }

    @Override
    public String toString() {
        return "Persona |  Nombre: " + nombre + " - Edad :" + edad + " - DNI: " + dni + " - Sexo: " + sexo + " - Peso: " + peso
                + " - Altura: " + altura;
    }

    // Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}