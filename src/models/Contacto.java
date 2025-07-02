package models;

public class Contacto {
    String nombre;
    String apellido;
    String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getnombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Telefono: " + telefono;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
