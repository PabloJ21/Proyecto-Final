public class Camion extends Vehiculo {
    private double capacidadCarga;
    private String tipoCamion;
    private boolean aireAcondicionado, frenosAire, ABS;
    private int numeroDeEjes;

    public Camion(TipoCombustible tipoCombustible, String marca, boolean nuevo, String modelo, int cambios,
            int velocidadMaxima, int cilindraje, boolean transmisionAutomatica, double precioVenta,
            double precioAlquiler, double precioCompra, double capacidadCarga, String tipoCamion,
            boolean aireAcondicionado, boolean frenosAire, boolean ABS, int numeroDeEjes) {
        super(tipoCombustible, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, transmisionAutomatica,
                precioVenta, precioAlquiler, precioCompra);
        this.capacidadCarga = capacidadCarga;
        this.tipoCamion = tipoCamion;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosAire = frenosAire;
        this.ABS = ABS;
        this.numeroDeEjes = numeroDeEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    public int getNumeroDeEjes() {
        return numeroDeEjes;
    }

    public void setNumeroDeEjes(int numeroDeEjes) {
        this.numeroDeEjes = numeroDeEjes;
    }

    @Override
    public String obtenerInformacion() {
        return "Camion [Marca=" + getMarca() +
                ", Modelo=" + getModelo() +
                ", Tipo de Combustible=" + getTipoCombustible() +
                ", Año=" + (isNuevo() ? "Nuevo" : "Usado") +
                ", Cambios=" + getCambios() +
                ", Velocidad Máxima=" + getVelocidadMaxima() + " km/h" +
                ", Cilindraje=" + getCilindraje() + " cc" +
                ", Transmisión Automática=" + (isTransmisionAutomatica() ? "Sí" : "No") +
                ", Precio de Venta=" + getPrecioVenta() + " USD" +
                ", Precio de Alquiler=" + getPrecioAlquiler() + " USD" +
                ", Precio de Compra=" + getPrecioCompra() + " USD" +
                ", Capacidad de Carga=" + capacidadCarga + " kg" +
                ", Tipo de Camión=" + tipoCamion +
                ", Aire Acondicionado=" + (aireAcondicionado ? "Sí" : "No") +
                ", Frenos de Aire=" + (frenosAire ? "Sí" : "No") +
                ", ABS=" + (ABS ? "Sí" : "No") +
                ", Número de Ejes=" + numeroDeEjes + "]";
    }

}
