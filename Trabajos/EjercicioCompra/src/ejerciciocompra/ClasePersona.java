package ejerciciocompra;

public class ClasePersona {
    
    private  String nombre;
    private  String apellido;
    private  String fechaNacimiento;

    public ClasePersona() {
    }

    public ClasePersona(String nombre, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Datos del usuario{ " + "nombre = " + nombre + ", apellido = " + apellido + ", fechaNacimiento = " + fechaNacimiento + '}';
    }
    
    
}
