package veterinariaventanas.clases;

public class claseMascota {

    private String nombre;
    private String nombre_propietario;
    private String raza;
    private String especie;
    private String genero;
    private String color;
    private double peso;
    private int edad;

    public claseMascota() {
    }

    public claseMascota(String nombre, String nombre_propietario, String raza, String especie, String genero, String color, double peso, int edad) {
        this.nombre = nombre;
        this.nombre_propietario = nombre_propietario;
        this.raza = raza;
        this.especie = especie;
        this.genero = genero;
        this.color = color;
        this.peso = peso;
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_propietario() {
        return nombre_propietario;
    }

    public void setNombre_propietario(String nombre_propietario) {
        this.nombre_propietario = nombre_propietario;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "claseMascota{" + "nombre=" + nombre + ", nombre_propietario=" + nombre_propietario + ", raza=" + raza + ", especie=" + especie + ", genero=" + genero + ", color=" + color + ", peso=" + peso + ", edad=" + edad + '}';
    }

    
    

}
