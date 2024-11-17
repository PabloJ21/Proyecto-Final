public abstract class Vehiculo {
    private TipoCombustible tipoCombustible;
    private String marca;
    private boolean nuevo;
    private String modelo;
    private int cambios;
    private int velocidadMaxima;
    private int cilindraje;
    private boolean transmisionAutomatica;
    private double precioVenta, precioAlquiler, precioCompra;

    public Vehiculo(TipoCombustible tipoCombustible, String marca, boolean nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, boolean transmisionAutomatica, double precioVenta, double precioAlquiler, double precioCompra) {
        this.tipoCombustible = tipoCombustible;
        this.marca = marca;
        this.nuevo = nuevo;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.transmisionAutomatica = transmisionAutomatica;
        this.precioVenta = precioVenta;
        this.precioAlquiler = precioAlquiler;
        this.precioCompra = precioCompra;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public boolean isTransmisionAutomatica() {
        return transmisionAutomatica;
    }

    public void setTransmisionAutomatica(boolean transmisionAutomatica) {
        this.transmisionAutomatica = transmisionAutomatica;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public boolean pasarRevisionTecnica() {
        return true;
    }

    public abstract String obtenerInformacion();

    @Override
    public String toString() {
        return "Vehiculo [tipoCombustible=" + tipoCombustible + ", marca=" + marca + ", nuevo=" + nuevo + ", modelo="
                + modelo + ", cambios=" + cambios + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje="
                + cilindraje + ", transmisionAutomatica=" + transmisionAutomatica + ", precioVenta=" + precioVenta
                + "]";
    }

    

}
