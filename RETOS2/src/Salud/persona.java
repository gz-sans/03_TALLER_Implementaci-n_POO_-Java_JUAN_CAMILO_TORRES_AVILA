package Salud;

import java.util.Scanner;

public class persona {

    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private char sexo;

    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de documento: ");
        tipoDoc = sc.nextLine();
        System.out.println("Ingrese el número de documento: ");
        documento = sc.nextInt();
        sc.nextLine(); // Consume el salto de línea después de leer el int
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese el peso (en kg): ");
        peso = sc.nextDouble();
        System.out.println("Ingrese la estatura (en m): ");
        estatura = sc.nextDouble();
        System.out.println("Ingrese la edad: ");
        edad = sc.nextInt();
        sc.nextLine(); // Consume el salto de línea después de leer el int
        System.out.println("Ingrese el sexo (M/F): ");
        sexo = sc.nextLine().charAt(0);
    }

    public void mostrarPersona() {
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso (kg): " + peso);
        System.out.println("Estatura (m): " + estatura);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }

    public String calcularImc() {
        double imc = peso / (estatura * estatura);
        if (imc < 20) {
            return "PESOBAJO";
        } else if (imc >= 20 && imc <= 25) {
            return "PESOIDEAL";
        } else {
            return "SOBREPESO";
        }
    }

    public boolean mayorEdad() {
        return edad >= 18;
    }

}
