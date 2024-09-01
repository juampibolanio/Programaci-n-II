package POO.PersonasEJ4;

import java.util.Scanner;

public class RegistroCivil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------] Bienvenido al Registro Civil [---------");
        System.out.println("-| A continuación, ingrese los datos solicitados |-");
        System.out.print("Ingrese el nombre y apellido: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese el sexo (M/F): ");
        String sexo = sc.next();

        System.out.print("Ingrese la altura en metros: ");
        double altura = sc.nextDouble();

        System.out.print("Ingrese el peso en kilogramos: ");
        double peso = sc.nextDouble();

        Personas persona1 = new Personas(nombre, edad, sexo, peso, altura);

        persona1.generaDNI(); // generar DNI
        persona1.comprobarSexo(sexo);
        String imc = persona1.calcularIMC();

        System.out.println("----------] Nombre completo: " + persona1.getNombre() + " [----------");
        System.out.println("- Edad: " + persona1.getEdad() + " años");
        System.out.println("- Sexo: " + persona1.getSexo());
        System.out.println("- Altura: " + altura + " m");
        System.out.println("- Peso: " + peso + " kg");
        System.out.println("- Índice de masa corporal: " + imc);
        System.out.println("- ¿Es mayor de edad? " + persona1.esMayorDeEdad());
        System.out.println("-------------------------------------------------------------------");

        sc.close();
    }
}