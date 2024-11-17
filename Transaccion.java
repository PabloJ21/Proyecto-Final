import java.time.LocalDate;

public class Transaccion {
    private String tipo; 
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Empleado empleado;
    private LocalDate fecha;
    private double monto;

    public Transaccion(String tipo, Vehiculo vehiculo, Cliente cliente, Empleado empleado, LocalDate fecha, double monto) {
        this.tipo = tipo;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.empleado = empleado;
        this.fecha = fecha;
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String obtenerDetalle() {
        return "Tipo: " + tipo +
               ", Vehículo: " + (vehiculo != null ? vehiculo.obtenerInformacion() : "N/A") +
               ", Cliente: " + (cliente != null ? cliente.getNombre() : "N/A") +
               ", Empleado: " + (empleado != null ? empleado.getNombre() : "N/A") +
               ", Fecha: " + fecha +
               ", Monto: $" + monto;
    }

    @Override
    public String toString() {
        return "Transaccion [tipo=" + tipo + ", vehiculo=" + vehiculo + ", cliente=" + cliente + ", empleado="
                + empleado + ", fecha=" + fecha + ", monto=" + monto + "]";
    }

}

