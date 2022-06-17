
package ejercicioclasescomplejo;

public class claseCiudad {
    //atributos
    private int codigo_ciudad;
    private String nombre;
    
    //contructor
    public claseCiudad(){
	}

    public claseCiudad(int codigo_ciudad, String nombre) {
        this.codigo_ciudad = codigo_ciudad;
        this.nombre = nombre;
    }
    
    // metodo finalizar
    public void finalize() throws Throwable {
        //codigo para finalizar el objeto creado
        super.finalize();
    }

    //set y get
    public int getCodigo_ciudad() {
        return codigo_ciudad;
    }

    public void setCodigo_ciudad(int codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Código: " + codigo_ciudad + ", Nombre: " + nombre;
    }

}
