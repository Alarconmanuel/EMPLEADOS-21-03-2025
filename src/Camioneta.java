public class Camioneta extends Vehiculo{
    private double capacidadCarga;

    public Camioneta(String marca, String modelo, int anio, double precioPorDia, double capacidadCarga) {
        super(marca, modelo, anio, precioPorDia);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString()+"Camioneta{" +
                "capacidadCarga=" + capacidadCarga +
                '}';
    }


}
