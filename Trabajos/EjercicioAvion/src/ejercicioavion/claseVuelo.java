package ejercicioavion;

public class claseVuelo extends claseAvion {

    private String fecha_regreso;
    private String fecha_salida;
    private String hora_llegada;
    private String hora_salida;
    private String lugar_destino;
    private String lugar_origen;
    private int numero_vuelo;
    private String piloto;
    private String tipo_vuelo;

    public claseVuelo() {
    }

    public claseVuelo(String fecha_regreso, String fecha_salida, String hora_llegada, String hora_salida, String lugar_destino, String lugar_origen, int numero_vuelo, String piloto, String tipo_vuelo, String aerolinea, String codigo_avion, String compartimientos, int numero_asientos) {
        super(aerolinea, codigo_avion, compartimientos, numero_asientos);
        this.fecha_regreso = fecha_regreso;
        this.fecha_salida = fecha_salida;
        this.hora_llegada = hora_llegada;
        this.hora_salida = hora_salida;
        this.lugar_destino = lugar_destino;
        this.lugar_origen = lugar_origen;
        this.numero_vuelo = numero_vuelo;
        this.piloto = piloto;
        this.tipo_vuelo = tipo_vuelo;
    }

    public String getFecha_regreso() {
        return fecha_regreso;
    }

    public void setFecha_regreso(String fecha_regreso) {
        this.fecha_regreso = fecha_regreso;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getLugar_destino() {
        return lugar_destino;
    }

    public void setLugar_destino(String lugar_destino) {
        this.lugar_destino = lugar_destino;
    }

    public String getLugar_origen() {
        return lugar_origen;
    }

    public void setLugar_origen(String lugar_origen) {
        this.lugar_origen = lugar_origen;
    }

    public int getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(int numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getTipo_vuelo() {
        return tipo_vuelo;
    }

    public void setTipo_vuelo(String tipo_vuelo) {
        this.tipo_vuelo = tipo_vuelo;
    }

    
    public void agregar_vuelo() {
        
    }

}
