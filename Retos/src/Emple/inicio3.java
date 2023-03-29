package Emple;

import Emple.Empleado;

public class inicio3 {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("CC", 123456, "Juan", "Perez", "Gerente", 5000, 8, "Ventas");
        empleados[1] = new Empleado("CE", 654321, "Maria", "Gonzalez", "Asistente", 7000, 6, "Contabilidad");
        empleados[2] = new Empleado("TI", 789012, "Carlos", "Rojas", "Desarrollador", 6000, 7, "Tecnología");

        // Imprimir información de los empleados
        for (int i = 0; i < empleados.length; i++) {
            empleados[i].imprimirInformacion();
            System.out.println();
        }
    }
}
