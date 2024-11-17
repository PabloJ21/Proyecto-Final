import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private List<Vehiculo> vehiculos; 
    private List<Cliente> clientes;  
    private List<Transaccion> transacciones; 

    public Empleado(String id, String nombre, String apellido, String correo, String contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.vehiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.transacciones = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado por " + nombre + ": " + vehiculo.obtenerInformacion());
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado por " + nombre + ": " + cliente.getNombre());
    }

    public void alquilarVehiculo(Cliente cliente, Vehiculo vehiculo, int dias) {
        if (vehiculos.contains(vehiculo)) {
            double precioAlquiler = vehiculo.getPrecioAlquiler();
            double monto = precioAlquiler * dias; 
            transacciones.add(new Transaccion("Alquiler", vehiculo, cliente, this, LocalDate.now(), monto));
            System.out.println("El vehículo " + vehiculo.obtenerInformacion() + " fue alquilado a " + cliente.getNombre() + " por " + dias + " días. Total a pagar: $" + monto);
        } else {
            System.out.println("El vehículo no está disponible para alquiler.");
        }
    }

        public void venderVehiculo(Cliente cliente, Vehiculo vehiculo) {
            if (vehiculos.contains(vehiculo)) {
                double precio = vehiculo.getPrecioVenta();
                transacciones.add(new Transaccion("Venta", vehiculo, cliente, this, LocalDate.now(), precio));
                vehiculos.remove(vehiculo);
                System.out.println("El vehículo " + vehiculo.obtenerInformacion() + " fue vendido a " + cliente.getNombre() + " por $" + precio);
            } else {
                System.out.println("El vehículo no está disponible para la venta.");
            }
        }

        public void comprarVehiculo(Cliente cliente, Vehiculo vehiculo) {
            if (vehiculo.pasarRevisionTecnica()) {
                double precioCompra = vehiculo.getPrecioCompra();
                vehiculos.add(vehiculo);
                transacciones.add(new Transaccion("Compra", vehiculo, cliente, this, LocalDate.now(), precioCompra));
                System.out.println("El vehículo " + vehiculo.obtenerInformacion() + " fue comprado de " + cliente.getNombre() + " por $" + precioCompra);
            } else {
                System.out.println("El vehículo no pasó la revisión técnica.");
            }
        }

    public void mostrarTransacciones() {
        System.out.println("Transacciones realizadas por " + nombre + ":");
        for (Transaccion t : transacciones) {
            System.out.println(t.obtenerDetalle());
        }
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrasenia=" + contrasenia + ", vehiculos=" + vehiculos + ", clientes=" + clientes + ", transacciones=" + transacciones + "]";
    }

}
