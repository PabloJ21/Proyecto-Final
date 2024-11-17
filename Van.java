public class Van extends Vehiculo {
    private int númeroDePasajeros, númeroDePuertas, númeroDeBolsasAire;
    private double capacidadDelMaletero;
    private boolean aireAcondicionado, cámaraReversa, ABS;

    public Van(TipoCombustible tipoCombustible, String marca, boolean nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, boolean transmisionAutomatica, double precioVenta, double precioAlquiler, double precioCompra, int númeroDePasajeros, int númeroDePuertas, int númeroDeBolsasAire, double capacidadDelMaletero, boolean aireAcondicionado, boolean cámaraReversa, boolean ABS) {
        super(tipoCombustible, marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, transmisionAutomatica, precioVenta, precioAlquiler, precioCompra);
        this.númeroDePasajeros = númeroDePasajeros;
        this.númeroDePuertas = númeroDePuertas;
        this.númeroDeBolsasAire = númeroDeBolsasAire;
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
        return "Van: " + 
               "\nMarca: " + getMarca() + 
               "\nModelo: " + getModelo() + 
               "\nNúmero de Pasajeros: " + númeroDePasajeros + 
               "\nNúmero de Puertas: " + númeroDePuertas + 
               "\nNúmero de Bolsas de Aire: " + númeroDeBolsasAire + 
               "\nCapacidad del Maletero: " + capacidadDelMaletero + " litros" + 
               "\nAire Acondicionado: " + (aireAcondicionado ? "Sí" : "No") + 
               "\nCámara Reversa: " + (cámaraReversa ? "Sí" : "No") + 
               "\nABS: " + (ABS ? "Sí" : "No") + 
               "\nPrecio de Venta: $" + getPrecioVenta();
    }
    
}
