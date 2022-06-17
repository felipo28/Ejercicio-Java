package ejercicioclasescarro;

public class claseVehiculo {
    private String color;
    private String placa;
    private String modelo;
    private String marca;

    public claseVehiculo() {
    }

    public claseVehiculo(String color, String placa, String modelo, String marca) {
        this.color = color;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "claseVehiculo{" + "color=" + color + ", placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + '}';
    }
    
    
    
}
