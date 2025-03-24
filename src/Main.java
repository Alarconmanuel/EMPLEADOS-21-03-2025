import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> lstVehiculos = new ArrayList<>();
        List<Cliente> lstClientes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int op;
        boolean seguir = true;

        do {
            System.out.println("""
                    1. AGREGAR AUTO
                    2. AGREGAR CAMIONETA
                    3. REGISTRAR CLIENTE
                    4. ALQUILAR VEHÍCULO
                    5. VER VEHÍCULOS DISPONIBLES
                    6. DEVOLVER VEHÍCULO
                    7. SALIR
                    """);

            op = teclado.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("MARCA DEL AUTO: ");
                    String marca = teclado.nextLine();
                    System.out.println("MODELO: ");
                    String modelo = teclado.nextLine();
                    System.out.println("AÑO: ");
                    int anio = teclado.nextInt();
                    System.out.println("PRECIO POR DÍA: ");
                    double precio = teclado.nextDouble();
                    System.out.println("NÚMERO DE PUERTAS: ");
                    int puertas = teclado.nextInt();

                    lstVehiculos.add(new Auto(marca, modelo, anio, precio, puertas));
                    System.out.println("AUTO REGISTRADO.");
                }
                case 2 -> {
                    System.out.println("MARCA DE LA CAMIONETA: ");
                    String marca = teclado.nextLine();
                    System.out.println("MODELO: ");
                    String modelo = teclado.nextLine();
                    System.out.println("AÑO: ");
                    int anio = teclado.nextInt();
                    System.out.println("PRECIO POR DÍA: ");
                    double precio = teclado.nextDouble();
                    System.out.println("CAPACIDAD DE CARGA (KG): ");
                    double carga = teclado.nextDouble();

                    lstVehiculos.add(new Camioneta(marca, modelo, anio, precio, carga));
                    System.out.println("CAMIONETA REGISTRADA.");
                }
                case 3 -> {
                    System.out.println("NOMBRE DEL CLIENTE: ");
                    String nombre = teclado.nextLine();
                    System.out.println("CÉDULA: ");
                    String cedula = teclado.nextLine();
                    System.out.println("NÚMERO DE LICENCIA: ");
                    String licencia = teclado.nextLine();

                    lstClientes.add(new Cliente(nombre, cedula, licencia));
                    System.out.println("CLIENTE REGISTRADO.");
                }
                case 4 -> {
                    System.out.println("VEHÍCULOS DISPONIBLES:");
                    for (int i = 0; i < lstVehiculos.size(); i++) {
                        if (lstVehiculos.get(i).disponible) {
                            System.out.println(i + ". " + lstVehiculos.get(i));
                        }
                    }

                    System.out.println("INGRESE EL NÚMERO DEL VEHÍCULO A ALQUILAR: ");
                    int numVehiculo = teclado.nextInt();
                    if (numVehiculo >= 0 && numVehiculo < lstVehiculos.size() && lstVehiculos.get(numVehiculo).disponible) {
                        System.out.println("DÍAS DE ALQUILER: ");
                        int dias = teclado.nextInt();
                        double total = lstVehiculos.get(numVehiculo).calcularCosto(dias);
                        lstVehiculos.get(numVehiculo).alquilar();
                        System.out.println("ALQUILER CONFIRMADO. TOTAL A PAGAR: $" + total);
                    } else {
                        System.out.println("VEHÍCULO NO DISPONIBLE.");
                    }
                }
                case 5 -> {
                    System.out.println("VEHÍCULOS DISPONIBLES:");
                    for (Vehiculo carro : lstVehiculos) {
                        if (carro.disponible) {
                            System.out.println(carro);
                        }
                    }
                }
                case 6 -> {
                    System.out.println("INGRESE EL NÚMERO DEL VEHÍCULO A DEVOLVER: ");
                    int numDevolver = teclado.nextInt();
                    if (numDevolver >= 0 && numDevolver < lstVehiculos.size()) {
                        lstVehiculos.get(numDevolver).devolver();
                        System.out.println("VEHÍCULO DEVUELTO.");
                    } else {
                        System.out.println("NÚMERO INVÁLIDO.");
                    }
                }
                case 7 -> {
                    System.out.println("SALIENDO...");
                    seguir = false;
                }
                default -> {
                    System.out.println("OPCIÓN INCORRECTA, INTENTA OTRA VEZ.");
                }
            }
        } while (seguir);
    }
}
