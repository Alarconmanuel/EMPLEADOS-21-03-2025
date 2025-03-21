public class EmpleadoHoras extends Empleados{

    private double horasTrabajadas;
    private double pagoHoras;
    private double salario;

    public EmpleadoHoras(String nombre, int edad, double horasTrabajadas, double pagoHoras, double salario) {
        super(nombre, edad);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHoras = pagoHoras;
        this.salario = salario;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoHoras() {
        return pagoHoras;
    }

    public void setPagoHoras(double pagoHoras) {
        this.pagoHoras = pagoHoras;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+"EmpleadoHoras{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", pagoHoras=" + pagoHoras +
                ", salario=" + salario +
                '}';
    }

    public void calcularSalario (){
        salario = pagoHoras*horasTrabajadas;
    }

    public void mostrarInformacion (){
        super.mostarInformacion();
        System.out.println("HORAS TRABAJADAS: "+horasTrabajadas);
        System.out.println("PAGO POR HORA: "+pagoHoras);
    }
}
