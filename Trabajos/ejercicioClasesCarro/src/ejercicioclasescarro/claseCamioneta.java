package ejercicioclasescarro;

public class claseCamioneta extends claseVehiculo{
    private String platon;
    private String repuesto;
    private boolean cabina;

    //constructor

    public claseCamioneta() {
    }
    

    public claseCamioneta(String platon, String repuesto, boolean cabina, String color, String placa, String modelo, String marca) {
        super(color, placa, modelo, marca);
        this.platon = platon;
        this.repuesto = repuesto;
        this.cabina = cabina;
    }
    
    // metoos get set

    public String getPlaton() {
        return platon;
    }

    public String getRepuesto() {
        return repuesto;
    }

    public boolean isCabina() {
        return cabina;
    }

    public void setPlaton(String platon) {
        this.platon = platon;
    }

    public void setRepuesto(String repuesto) {
        this.repuesto = repuesto;
    }

    public void setCabina(boolean cabina) {
        this.cabina = cabina;
    }
    
    //metodo personal
    
    public void getMostrarTodo(){
        System.out.println("La camioneta tiene platon: " + platon + 
                ", La placa es: " + getPlaca()+ ", Color:" + getColor());
    }
    
}
