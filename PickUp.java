public class PickUp extends Vehiculo {
    private int númeroDePasajeros, númeroDePuertas, númeroDeBolsasAire;
    private boolean aireAcondicionado, cámaraReversa, ABS, cuatroXcuatro;
    private double capacidadCajaCarga;

    public PickUp(TipoCombustible tipoCombustible, String marca, boolean nuevo, String modelo, int cambios,
            int velocidadMaxima, int cilindraje, boolean transmisionAutomatica, double precioVenta,
            double precioAlquiler, double precioCompra, int númeroDePasajeros, int númeroDePuertas,
            int númeroDeBolsasAire, boolean aireAcondicionado, boolean cámaraReversa, boolean ABS,
            boolean cuatroXcuatro, double capacidadCajaCarga) {
        super(tipoCombustible, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, transmisionAutomatica,
                precioVenta, precioAlquiler, precioCompra);
        this.númeroDePasajeros = númeroDePasajeros;
        this.númeroDePuertas = númeroDePuertas;
        this.númeroDeBolsasAire = númeroDeBolsasAire;
        this.aireAcondicionado = aireAcondicionado;
        this.cámaraReversa = cámaraReversa;
        this.ABS = ABS;
        this.cuatroXcuatro = cuatroXcuatro;
        this.capacidadCajaCarga = capacidadCajaCarga;
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

    public boolean isCuatroXcuatro() {
        return cuatroXcuatro;
    }

    public void setCuatroXcuatro(boolean cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }

    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    @Override
    public String obtenerInformacion() {
        return "PickUp [Marca=" + getMarca() +
                ", Modelo=" + getModelo() +
                ", Tipo de Combustible=" + getTipoCombustible() +
                ", Año=" + (isNuevo() ? "Nuevo" : "Usado") +
                ", Número de Pasajeros=" + númeroDePasajeros +
                ", Número de Puertas=" + númeroDePuertas +
                ", Número de Bolsas de Aire=" + númeroDeBolsasAire +
                ", Aire Acondicionado=" + (aireAcondicionado ? "Sí" : "No") +
                ", Cámara Reversa=" + (cámaraReversa ? "Sí" : "No") +
                ", ABS=" + (ABS ? "Sí" : "No") +
                ", 4x4=" + (cuatroXcuatro ? "Sí" : "No") +
                ", Capacidad de Caja de Carga=" + capacidadCajaCarga + " m³]";
    }

}
