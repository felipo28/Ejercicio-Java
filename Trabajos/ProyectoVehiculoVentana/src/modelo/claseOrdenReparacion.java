package modelo;

public class claseOrdenReparacion {
    private int consecutivo;
    private String placa;
    private String fechaIngreso;
    private String fechaSalida;
    private String horaIngreso;
    private String horaSalida;
    private int idMecanico;

    public claseOrdenReparacion() {
    }

    public claseOrdenReparacion(int consecutivo, String placa, String fechaIngreso, String fechaSalida, String horaIngreso, String horaSalida, int idMecanico) {
        this.consecutivo = consecutivo;
        this.placa = placa;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.idMecanico = idMecanico;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(int idMecanico) {
        this.idMecanico = idMecanico;
    }

    
}
