package modelo;

import java.util.ArrayList;

public class claseMecanico {
    private int identificacion;
    private String nombre;
    private String apellido;
    private String especialidad;
    
    public ArrayList<claseOrdenReparacion> OrdenReparacion = new ArrayList();

    public claseMecanico() {
    }

    public claseMecanico(int identificacion, String nombre, String apellido, String especialidad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<claseOrdenReparacion> getOrdenReparacion() {
        return OrdenReparacion;
    }

    public void setOrdenReparacion(ArrayList<claseOrdenReparacion> OrdenReparacion) {
        this.OrdenReparacion = OrdenReparacion;
    }

}
