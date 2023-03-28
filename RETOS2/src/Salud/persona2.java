package Salud;

import java.util.Scanner;

public class persona2 {

    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;

    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su tipo de documento: ");
        this.tipoDoc = sc.nextLine();

        System.out.println("Ingrese su número de documento: ");
        this.documento = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese su nombre: ");
        this.nombre = sc.nextLine();

        System.out.println("Ingrese su apellido: ");
        this.apellido = sc.nextLine();

        System.out.println("Ingrese su peso en kg: ");
        this.peso = sc.nextDouble();

        System.out.println("Ingrese su estatura en m: ");
        this.estatura = sc.nextDouble();

        System.out.println("Ingrese su edad: ");
        this.edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese su sexo: ");
        this.sexo = sc.nextLine();
    }

    public void mostrarPersona() {
        System.out.println("\n--- Datos de la Persona ---");
        System.out.println("Tipo de documento: " + this.tipoDoc);
        System.out.println("Número de documento: " + this.documento);
        System.out.println("Nombre completo: " + this.nombre + " " + this.apellido);
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Estatura: " + this.estatura + " m");
        System.out.println("Edad: " + this.edad);
        System.out.println("Sexo: " + this.sexo);
    }

    public String calcularImc() {
        double pesoActual = this.peso / Math.pow(this.estatura, 2);
        if (pesoActual < 20) {
            return "PESOBAJO";
        } else if (pesoActual <= 25) {
            return "PESOIDEAL";
        } else {
            return "SOBREPESO";
        }
    }

    public boolean mayorEdad() {
        return this.edad >= 18;
    }

}
