public class EmpleadoPlanta extends Empleados{

    private double salario;

    public EmpleadoPlanta(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+"EmpleadoPlanta{" +
                "salario=" + salario +
                '}';
    }

    public void calcularSalario (){
        salario = 2100000;
    }

    public void mostrarInformacion (){
        super.mostarInformacion();
        System.out.println("SALARIO: "+salario);
    }
}

