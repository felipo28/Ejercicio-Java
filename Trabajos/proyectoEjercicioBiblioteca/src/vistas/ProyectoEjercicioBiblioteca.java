package vistas;

public class ProyectoEjercicioBiblioteca {

    public static void main(String[] args) {
        //vistaPrincipal tabla = new vistaPrincipal();
        vistaLogin tabla = new vistaLogin();
        tabla.setTitle("Proyecto Biblioteca");
        tabla.setLocationRelativeTo(null); //centra la ventana
        tabla.setVisible(true);
    }
}