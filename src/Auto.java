public class Auto  extends Vehiculo{
    private int numeroPuertas;

    public Auto(String marca, String modelo, int anio, double precioPorDia, int numeroPuertas) {
        super(marca, modelo, anio, precioPorDia);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+"Auto{" +
                "numeroPuertas=" + numeroPuertas +
                '}';
    }


}
