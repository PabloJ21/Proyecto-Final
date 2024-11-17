import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private String nombre;
    private List<Vehiculo> vehiculos; 
    private List<Transaccion> transacciones; 
    private List<Cliente> clientes; 

    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
        this.transacciones = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo agregado al concesionario: " + vehiculo.obtenerInformacion());
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.remove(vehiculo)) {
            System.out.println("Vehículo eliminado del concesionario: " + vehiculo.obtenerInformacion());
        } else {
            System.out.println("El vehículo no está en el concesionario.");
        }
    }

    // Método main para probar el programa
    public static void main(String[] args) {
        Administrador admin = new Administrador("Laura", "Gómez");
        Concesionario concesionario = new Concesionario(admin);

        // Crear empleados y vehículos
        Empleado empleado1 = new Empleado("Carlos", "E001");
        Vehiculo auto = new Auto("Toyota", "Corolla", 2020, 20000, 100);

        // Agregar vehículos
        concesionario.agregarVehiculo(auto);
    }

    

}
