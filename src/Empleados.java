public class Empleados {

    protected  String nombre;
    protected int edad;

    public Empleados() {
    }

    public Empleados(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "name='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void  mostarInformacion (){
        System.out.println("NOMBRE: "+nombre);
        System.out.println("EDAD: "+edad);
    }
}
