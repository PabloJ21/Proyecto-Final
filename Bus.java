public class Bus extends Vehiculo {
    private int númeroDePasajeros, númeroDePuertas, númeroDeBolsasAire, numeroDeEjes, numeroSalidasEmergencia;
    private double capacidadDelMaletero;
    private boolean aireAcondicionado, cámaraReversa, ABS;

    public Bus(TipoCombustible tipoCombustible, String marca, boolean nuevo, String modelo, int cambios,
            int velocidadMaxima, int cilindraje, boolean transmisionAutomatica, double precioVenta,
            double precioAlquiler, double precioCompra, int númeroDePasajeros, int númeroDePuertas,
            int númeroDeBolsasAire, int numeroDeEjes, int numeroSalidasEmergencia, double capacidadDelMaletero,
            boolean aireAcondicionado, boolean cámaraReversa, boolean ABS) {
        super(tipoCombustible, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, transmisionAutomatica,
                precioVenta, precioAlquiler, precioCompra);
        this.númeroDePasajeros = númeroDePasajeros;
        this.númeroDePuertas = númeroDePuertas;
        this.númeroDeBolsasAire = númeroDeBolsasAire;
        this.numeroDeEjes = numeroDeEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
        this.capacidadDelMaletero = capacidadDelMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.cámaraReversa = cámaraReversa;
        this.ABS = ABS;
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

    public int getNumeroDeEjes() {
        return numeroDeEjes;
    }

    public void setNumeroDeEjes(int numeroDeEjes) {
        this.numeroDeEjes = numeroDeEjes;
    }

    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    public double getCapacidadDelMaletero() {
        return capacidadDelMaletero;
    }

    public void setCapacidadDelMaletero(double capacidadDelMaletero) {
        this.capacidadDelMaletero = capacidadDelMaletero;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCámaraReversa() {
        return cámaraReversa;
    }

    public void setCámaraReversa(boolean cámaraReversa) {
        this.cámaraReversa = cámaraReversa;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    @Override
    public String obtenerInformacion() {
        return "Bus [Marca=" + getMarca() +
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
                ", Número de Ejes=" + numeroDeEjes +
                ", Número de Salidas de Emergencia=" + numeroSalidasEmergencia +
                ", Capacidad del Maletero=" + capacidadDelMaletero + " m3" +
                ", Aire Acondicionado=" + (aireAcondicionado ? "Sí" : "No") +
                ", Cámara Reversa=" + (cámaraReversa ? "Sí" : "No") +
                ", ABS=" + (ABS ? "Sí" : "No") + "]";
    }

}
