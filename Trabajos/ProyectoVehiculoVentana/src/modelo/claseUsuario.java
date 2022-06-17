
package modelo;

public class claseUsuario {
    private String id;
    private String nombre;
    private String nombreUsuario;
    private String contrasenia;

    public claseUsuario() {
    }

    public claseUsuario(String id, String nombre, String nombreUsuario, String contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "claseUsuario{" + "id=" + id + ", nombre=" + nombre + ", nombreUsuario=" + nombreUsuario + ", contrasenia=" + contrasenia + '}';
    }

    public boolean getValidar(String usu, String clave) {
        if (this.nombreUsuario.equals(usu) && this.contrasenia.equals(clave)) {
            return true;
        } else {
            return false;
        }
    }
}
