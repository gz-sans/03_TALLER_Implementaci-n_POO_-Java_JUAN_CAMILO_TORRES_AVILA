package Emple;

public class Empleado extends Persona3 {
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;

    public Empleado(String tipoDocumento, int numeroDocumento, String nombres, String apellidos,
                    String cargo, double valorHora, int horasTrabajadas, String departamento) {
        super(tipoDocumento, numeroDocumento, nombres, apellidos);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    // Getters y setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Métodos
    public double calcularHonorarios() {
        double total = valorHora * horasTrabajadas;
        double reteica = total * 0.00966;
        return total - reteica;
    }

    public void imprimirInformacion() {
        System.out.println("Tipo de documento: " + getTipoDocumento());
        System.out.println("Número de documento: " + getNumeroDocumento());
        System.out.println("Nombres: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Cargo: " + cargo);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor por hora: " + valorHora);
        System.out.println("Total a pagar: " + calcularHonorarios());
    }
}


