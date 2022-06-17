package ejercicioclasescarro;

public class claseMarca {
    //atributos - propiedades
    private int codigo;
    private String nombre;
    //contructor

    public claseMarca() {
    }

    public claseMarca(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "claseMarca{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }


    
}
