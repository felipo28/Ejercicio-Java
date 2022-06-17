package ejerciciocompra;

public class claseCliente extends ClasePersona{
    private  int identificacion;
    private  String Direccion;
    private  String contacto;

    public claseCliente() {
    }

    public claseCliente(int identificacion, String Direccion, String contacto, String nombre, String apellido, String fechaNacimiento) {
        super(nombre, apellido, fechaNacimiento);
        this.identificacion = identificacion;
        this.Direccion = Direccion;
        this.contacto = contacto;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

     public void getProductoPreferido(){
        System.out.println("El usuario : " + getNombre()+ ", tiene preferencia con las papas picantes ");
    }
     
}
