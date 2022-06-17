package ejercicioavion;

public class claseAvion {
    private String aerolinea;
    private String codigo_avion;
    private String compartimientos;
    private int numero_asientos;

    public claseAvion() {
    }

    public claseAvion(String aerolinea, String codigo_avion, String compartimientos, int numero_asientos) {
        this.aerolinea = aerolinea;
        this.codigo_avion = codigo_avion;
        this.compartimientos = compartimientos;
        this.numero_asientos = numero_asientos;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getCodigo_avion() {
        return codigo_avion;
    }

    public void setCodigo_avion(String codigo_avion) {
        this.codigo_avion = codigo_avion;
    }

    public String getCompartimientos() {
        return compartimientos;
    }

    public void setCompartimientos(String compartimientos) {
        this.compartimientos = compartimientos;
    }

    public int getNumero_asientos() {
        return numero_asientos;
    }

    public void setNumero_asientos(int numero_asientos) {
        this.numero_asientos = numero_asientos;
    }

    public void asignar_vuelo() {
        
    }
    
    
}
