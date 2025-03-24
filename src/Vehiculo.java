public class Vehiculo {

    protected String marca, modelo;
    protected int anio;
    protected double precioPorDia;
    protected boolean disponible;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, double precioPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioPorDia = precioPorDia;
        this.disponible = true;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", precioPorDia=" + precioPorDia +
                ", disponible=" + disponible +
                '}';
    }

    public boolean disponible() {
        return disponible;
    }

    public void alquilar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public double calcularCosto(int dias) {
        double costo = dias * precioPorDia;
        if (dias > 7) {
            costo *= 0.9; // Descuento del 10%
        }
        return costo;
    }

}
