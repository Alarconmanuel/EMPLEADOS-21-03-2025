import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Empleados> lstempleados = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        int op;
        boolean estado=true;

        do {
            System.out.println("""
                    1.REGISTRAR EMPLEADO DE PLANTA
                    2.REGISTRAR EMPLEADO POR HORAS 
                    3.MOSTAR EMPLEADOS
                    4.SALIR
                    """);

            op = teclado.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("INGRESA EL NOMBRE: ");
                    String nombre = teclado.next();
                    System.out.println("INGRESA LA EDAD: ");
                    int edad = teclado.nextInt();
                    double salario = 2100000;
                    System.out.println("SALARIO: " + salario);

                    lstempleados.add(new EmpleadoPlanta(nombre, edad, salario));
                }
                case 2 -> {
                    System.out.println("INGRESA EL NOMBRE: ");
                    String nombre = teclado.next();
                    System.out.println("INGRESA LA EDAD: ");
                    int edad = teclado.nextInt();
                    System.out.println("INGRESA LAS HORAS TRABAJADAS: ");
                    double horas = teclado.nextDouble();
                    double pago = 98000;
                    double salario = pago * horas;
                    System.out.println("HORAS TRABAJADAS: "+horas);
                    System.out.println("VALOR HORA: "+pago);
                    System.out.println("SALARIO: " + salario);

                    lstempleados.add(new EmpleadoHoras(nombre, edad, horas, pago, salario));
                }
                case 3 -> {
                    for (Empleados emp : lstempleados) {
                        System.out.println(emp);
                    }
                }
                case 4 -> {
                    System.out.println("SALIR");
                    estado = false;
                }
                default -> {
                    System.out.println("OPCION INVALIDA");
                }
            }
        } while (estado);

    }
}