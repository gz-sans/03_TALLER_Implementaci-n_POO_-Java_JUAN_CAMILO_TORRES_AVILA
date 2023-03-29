package Salud;

import Salud.persona2;

public class inicio2 {

    public static void main(String[] args) {

        persona2 persona1 = new persona2();
        persona1.pedirDatos();
        persona1.mostrarPersona();

        String imc = persona1.calcularImc();
        System.out.println("\n--- Estado de Peso ---");
        if (imc.equals("PESOBAJO")) {
            System.out.println("El peso está por debajo de lo ideal.");
        } else if (imc.equals("PESOIDEAL")) {
            System.out.println("El peso es ideal.");
        } else {
            System.out.println("Tiene sobrepeso.");
        }

        boolean mayorEdad = persona1.mayorEdad();
        if (mayorEdad) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

    }

}
