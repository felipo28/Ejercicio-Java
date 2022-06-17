package ejercicioavion;

import java.util.Scanner;

public class claseCiudad {

    private int codigo_ciudad;
    private String nombre;

    public claseCiudad() {
    }

    public claseCiudad(int codigo_ciudad, String nombre) {
        this.codigo_ciudad = codigo_ciudad;
        this.nombre = nombre;
    }

    public int getCodigo_ciudad() {
        return codigo_ciudad;
    }

    public void setCodigo_ciudad(int codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String[] array = new String[10];

    int valor;

    public void datos() {
        array[0] = "Bogota";
        array[1] = "Medellin";
        array[2] = "Barranquilla";
        array[3] = "Manizales";
        array[4] = "Villavicencio";
    }

    public void setInsertarCiudad() {
        Scanner texto = new Scanner(System.in);
        String dato = null;

        datos();

        System.out.println("Ciudades actuales:");

        int opcion = 0;
        do {
            boolean prueba = true;
            int i = 0;
            do {
                if (array[i] == null) {
                    prueba = false;
                } else {
                    i++;
                }
            } while (prueba != false);

            for (int j = 0; j < i; j++) {
                System.out.println("Codigo: " + (j + 1) + ", ciudad: " + array[j]);
            }

            System.out.println("Desea agregar otra ciudad?");
            System.out.println("1. Si");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(texto.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la nueva ciudad: ");
                    setNombre(texto.nextLine());
                    array[i] = getNombre();
                    System.out.println("Se inserto exitosamente :D");
                    valor = i;
                    break;
                case 0:
                    System.out.println("Adios :D");
                    valor = i - 1;
                    break;
                default:
                    System.out.println("Error, dato incorrecto");
            }
        } while (opcion != 0);
    }

    @Override
    public String toString() {
        datos();
        boolean prueba = true;
        int i = 0;
        do {
            if (array[i] == null) {
                prueba = false;
            } else {
                i++;
            }
        } while (prueba != false);

        String obtener = "";

        for (int j = 0; j < i; j++) {
            setNombre(array[j]);
            setCodigo_ciudad((j + 1));
            obtener = obtener + getCodigo_ciudad() + "  " + getNombre() + "\n";
        }
        return "Datos: {" + obtener + '}';
    }
}
