package modelo;

import java.util.ArrayList;

public class claseCliente {

    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String domicilio;
    private long telefono;
    public static ArrayList<claseVehiculo> vehiculo = new ArrayList();

    public claseCliente() {
    }

    public claseCliente(int id, String nombre, String apellido, String correo, String domicilio, long telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public ArrayList<claseVehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<claseVehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }

}
