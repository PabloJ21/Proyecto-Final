public class Moto extends Vehiculo {
    public Moto(TipoCombustible tipoCombustible, String marca, boolean nuevo, String modelo, int cambios,
            int velocidadMaxima, int cilindraje, boolean transmisionAutomatica, double precioVenta,
            double precioAlquiler, double precioCompra) {
        super(tipoCombustible, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, transmisionAutomatica,
                precioVenta, precioAlquiler, precioCompra);

    }

    @Override
    public String obtenerInformacion() {
        return "Moto [Marca=" + getMarca() +
                ", Modelo=" + getModelo() +
                ", Tipo de Combustible=" + getTipoCombustible() +
                ", Año=" + (isNuevo() ? "Nuevo" : "Usado") +
                ", Cambios=" + getCambios() +
                ", Velocidad Máxima=" + getVelocidadMaxima() + " km/h" +
                ", Cilindraje=" + getCilindraje() + " cc" +
                ", Transmisión Automática=" + (isTransmisionAutomatica() ? "Sí" : "No") +
                ", Precio de Venta=" + getPrecioVenta() + " USD" +
                ", Precio de Alquiler=" + getPrecioAlquiler() + " USD" +
                ", Precio de Compra=" + getPrecioCompra() + " USD]";
    }

}
