public class Electrico extends Vehiculo {
    private int autonomíaCargaCompleta;
    private double tiempoRealizarCarga;

    public Electrico(TipoCombustible tipoCombustible, String marca, boolean nuevo, String modelo, int cambios,
            int velocidadMaxima, int cilindraje, boolean transmisionAutomatica, double precioVenta,
            double precioAlquiler, double precioCompra, int autonomíaCargaCompleta, double tiempoRealizarCarga) {
        super(tipoCombustible, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, transmisionAutomatica,
                precioVenta, precioAlquiler, precioCompra);
        this.autonomíaCargaCompleta = autonomíaCargaCompleta;
        this.tiempoRealizarCarga = tiempoRealizarCarga;
    }

    public int getAutonomíaCargaCompleta() {
        return autonomíaCargaCompleta;
    }

    public void setAutonomíaCargaCompleta(int autonomíaCargaCompleta) {
        this.autonomíaCargaCompleta = autonomíaCargaCompleta;
    }

    public double getTiempoRealizarCarga() {
        return tiempoRealizarCarga;
    }

    public void setTiempoRealizarCarga(double tiempoRealizarCarga) {
        this.tiempoRealizarCarga = tiempoRealizarCarga;
    }

    @Override
    public String obtenerInformacion() {
        return "Eléctrico [Marca=" + getMarca() +
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
                ", Autonomía Carga Completa=" + autonomíaCargaCompleta + " km" +
                ", Tiempo para Realizar Carga=" + tiempoRealizarCarga + " horas]";
    }

}
