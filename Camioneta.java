public class Camioneta extends Vehiculo {
    private int númeroDePasajeros, númeroDePuertas, númeroDeBolsasAire;
    private double capacidadDelMaletero;
    private boolean aireAcondicionado, cámaraReversa, VelocidadCrucero, ABS, sensoresColisión, sensorTráficoCruzado,
            asistenteCarril, cuatroXcuatro;

    public Camioneta(TipoCombustible tipoCombustible, String marca, boolean nuevo, String modelo, int cambios,
            int velocidadMaxima, int cilindraje, boolean transmisionAutomatica, double precioVenta,
            double precioAlquiler, double precioCompra, int númeroDePasajeros, int númeroDePuertas,
            int númeroDeBolsasAire, double capacidadDelMaletero, boolean aireAcondicionado, boolean cámaraReversa,
            boolean velocidadCrucero, boolean ABS, boolean sensoresColisión, boolean sensorTráficoCruzado,
            boolean asistenteCarril, boolean cuatroXcuatro) {
        super(tipoCombustible, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, transmisionAutomatica,
                precioVenta, precioAlquiler, precioCompra);
        this.númeroDePasajeros = númeroDePasajeros;
        this.númeroDePuertas = númeroDePuertas;
        this.númeroDeBolsasAire = númeroDeBolsasAire;
        this.capacidadDelMaletero = capacidadDelMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.cámaraReversa = cámaraReversa;
        this.VelocidadCrucero = velocidadCrucero;
        this.ABS = ABS;
        this.sensoresColisión = sensoresColisión;
        this.sensorTráficoCruzado = sensorTráficoCruzado;
        this.asistenteCarril = asistenteCarril;
        this.cuatroXcuatro = cuatroXcuatro;
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

    public boolean isVelocidadCrucero() {
        return VelocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        VelocidadCrucero = velocidadCrucero;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    public boolean isSensoresColisión() {
        return sensoresColisión;
    }

    public void setSensoresColisión(boolean sensoresColisión) {
        this.sensoresColisión = sensoresColisión;
    }

    public boolean isSensorTráficoCruzado() {
        return sensorTráficoCruzado;
    }

    public void setSensorTráficoCruzado(boolean sensorTráficoCruzado) {
        this.sensorTráficoCruzado = sensorTráficoCruzado;
    }

    public boolean isAsistenteCarril() {
        return asistenteCarril;
    }

    public void setAsistenteCarril(boolean asistenteCarril) {
        this.asistenteCarril = asistenteCarril;
    }

    public boolean isCuatroXcuatro() {
        return cuatroXcuatro;
    }

    public void setCuatroXcuatro(boolean cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }

    @Override
    public String obtenerInformacion() {
        return "Camioneta [Marca=" + getMarca() +
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
                ", Capacidad del Maletero=" + capacidadDelMaletero + " L" +
                ", Aire Acondicionado=" + (aireAcondicionado ? "Sí" : "No") +
                ", Cámara Reversa=" + (cámaraReversa ? "Sí" : "No") +
                ", Velocidad Crucero=" + (VelocidadCrucero ? "Sí" : "No") +
                ", ABS=" + (ABS ? "Sí" : "No") +
                ", Sensores de Colisión=" + (sensoresColisión ? "Sí" : "No") +
                ", Sensor de Tráfico Cruzado=" + (sensorTráficoCruzado ? "Sí" : "No") +
                ", Asistente de Carril=" + (asistenteCarril ? "Sí" : "No") +
                ", 4X4=" + (cuatroXcuatro ? "Sí" : "No") + "]";
    }

}
