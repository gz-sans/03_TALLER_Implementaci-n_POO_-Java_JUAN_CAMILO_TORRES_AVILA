package Salud;

import Salud.persona;

public class inicio {

    public static void main(String[] args) {
        persona persona = new persona();
        persona.pedirDatos();
        System.out.println("Los datos ingresados son:");
        persona.mostrarPersona();
        System.out.println("El IMC es: " + persona.calcularImc());
        if (persona.mayorEdad()) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }

}
