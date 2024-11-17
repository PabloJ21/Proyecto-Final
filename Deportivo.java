public class Deportivo extends Vehiculo {
    private int númeroDePasajeros, númeroDePuertas, númeroDeBolsasAire, númeroCaballosFuerza;
    private double tiempoAlcanza100kmh;

    public Deportivo(TipoCombustible tipoCombustible, String marca, boolean nuevo, String modelo, int cambios,
            int velocidadMaxima, int cilindraje, boolean transmisionAutomatica, double precioVenta,
            double precioAlquiler, double precioCompra, int númeroDePasajeros, int númeroDePuertas,
            int númeroDeBolsasAire, int númeroCaballosFuerza, double tiempoAlcanza100kmh) {
        super(tipoCombustible, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, transmisionAutomatica,
                precioVenta, precioAlquiler, precioCompra);
        this.númeroDePasajeros = númeroDePasajeros;
        this.númeroDePuertas = númeroDePuertas;
        this.númeroDeBolsasAire = númeroDeBolsasAire;
        this.númeroCaballosFuerza = númeroCaballosFuerza;
        this.tiempoAlcanza100kmh = tiempoAlcanza100kmh;
    }

    public int getNúmeroDePasajeros() {
        return númeroDePasajeros;
    }

    public void setNúmeroDePasajeros(int númeroDePasajeros) {
        this.númeroDePasajeros = númeroDePasajeros;
    }

    public int getNúmeroDePuertas() {
        return númeroDePuertas;
    }

    public void setNúmeroDePuertas(int númeroDePuertas) {
        this.númeroDePuertas = númeroDePuertas;
    }

    public int getNúmeroDeBolsasAire() {
        return númeroDeBolsasAire;
    }

    public void setNúmeroDeBolsasAire(int númeroDeBolsasAire) {
        this.númeroDeBolsasAire = númeroDeBolsasAire;
    }

    public int getNúmeroCaballosFuerza() {
        return númeroCaballosFuerza;
    }

    public void setNúmeroCaballosFuerza(int númeroCaballosFuerza) {
        this.númeroCaballosFuerza = númeroCaballosFuerza;
    }

    public double getTiempoAlcanza100kmh() {
        return tiempoAlcanza100kmh;
    }

    public void setTiempoAlcanza100kmh(double tiempoAlcanza100kmh) {
        this.tiempoAlcanza100kmh = tiempoAlcanza100kmh;
    }

    @Override
    public String obtenerInformacion() {
        return "Deportivo [Marca=" + getMarca() +
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
                ", Número de Pasajeros=" + númeroDePasajeros +
                ", Número de Puertas=" + númeroDePuertas +
                ", Número de Bolsas de Aire=" + númeroDeBolsasAire +
                ", Caballos de Fuerza=" + númeroCaballosFuerza +
                ", Tiempo para Alcanzar 100 km/h=" + tiempoAlcanza100kmh + " segundos]";
    }

}
