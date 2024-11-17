public class Cliente {
    private String nombre;
    private String identificacion;
    private String telefono;
    private String email;

    public Cliente(String nombre, String identificacion, String telefono, String email) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", identificacion=" + identificacion + ", telefono=" + telefono
                + ", email=" + email + "]";
    }

}

        return "Cliente [nombre=" + nombre + ", identificacion=" + identificacion + ", telefono=" + telefono
                + ", email=" + email + "]";
    }

}
