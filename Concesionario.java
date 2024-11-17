import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private String nombre; 
    private String direccion; 
    private List<Vehiculo> vehiculos; 
    private List<Transaccion> transacciones; 

    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.vehiculos = new ArrayList<>();
        this.transacciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo agregado al inventario: " + vehiculo.obtenerInformacion());
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.remove(vehiculo)) {
            System.out.println("Vehículo eliminado del inventario: " + vehiculo.obtenerInformacion());
        } else {
            System.out.println("El vehículo no se encontró en el inventario.");
        }
    }

    public void mostrarInventario() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos en el inventario.");
        } else {
            System.out.println("Inventario del concesionario:");
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo.obtenerInformacion());
            }
        }
    }

    public void registrarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
        System.out.println("Transacción registrada: " + transaccion.toString());
    }

    public void mostrarTransacciones() {
        if (transacciones.isEmpty()) {
            System.out.println("No hay transacciones registradas.");
        } else {
            System.out.println("Historial de transacciones:");
            for (Transaccion transaccion : transacciones) {
                System.out.println(transaccion);
            }
        }
    }

    public static void main(String[] args) {

        Concesionario concesionario = new Concesionario("AutoCentro", "Calle Principal 123");

        Vehiculo auto = new auto("ABC123", "Toyota", "Corolla", 2022, 20000, 50);
        Vehiculo moto = new Moto("XYZ789", "Yamaha", "R3", 2021, 5000, 30, TipoMoto.MANUAL);

        concesionario.agregarVehiculo(auto);
        concesionario.agregarVehiculo(moto);

        concesionario.mostrarInventario();

        Cliente cliente = new Cliente("Juan Pérez", "1090292",  "juan.perez@email.com", "123456789");

        Empleado empleado = new Empleado("E001", "María", "Gómez", "maria.gomez@email.com", "password123");

        empleado.venderVehiculo(cliente, auto);
        concesionario.registrarTransaccion(new Transaccion("Venta", auto, cliente, empleado, LocalDate.now(), auto.getPrecioVenta()));

        empleado.alquilarVehiculo(cliente, moto, 5);
        concesionario.registrarTransaccion(new Transaccion("Alquiler", moto, cliente, empleado, LocalDate.now(), moto.getPrecioAlquiler() * 5));

        concesionario.mostrarTransacciones();

        concesionario.mostrarInventario();
    }
}
