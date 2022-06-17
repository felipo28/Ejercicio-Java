
package veterinariaventanas.clases;

public class clasePatologia {
    private int codigo;
    private String nombre;
    private String sintomas;
    private String medicamentos;

    public clasePatologia() {
    }

    public clasePatologia(int codigo, String nombre, String sintomas, String medicamentos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.medicamentos = medicamentos;
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

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public String toString() {
        return "clasePatologia{" + "codigo=" + codigo + ", nombre=" + nombre + ", sintomas=" + sintomas + ", medicamentos=" + medicamentos + '}';
    }

}
