package veterinariaventanas;
import veterinariaventanas.vistas.vistaMascota;

public class VeterinariaVentanas {

    public static void main(String[] args) {
        vistaMascota tabla = new vistaMascota();
        tabla.setTitle("ventana Veterinaria");
        tabla.setLocationRelativeTo(null); //centra la ventana
        tabla.setVisible(true);
    }

}
