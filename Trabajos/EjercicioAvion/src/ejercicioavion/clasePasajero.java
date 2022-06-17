package ejercicioavion;

import static ejercicioavion.clasePiloto.contieneSoloNumeros;
import java.util.Scanner;

public class clasePasajero {

    private String apellidos;
    private int cedula;
    private int edad;
    private String nombre;
    private String sexo;

    public clasePasajero() {
    }

    public clasePasajero(String apellidos, int cedula, int edad, String nombre, String sexo) {
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    String[] array_nombre = new String[2];
    String[] array_apellido = new String[2];
    int[] array_cedula = new int[2];
    int[] array_edad = new int[2];
    String[] array_sexo = new String[2];
    int valor;

    public static boolean contieneSoloNumerosRegex(String cadena) {
        return cadena.matches("[0-9]+");
    }

    public static boolean contieneSoloNumeros(String cadena) {
        // Si la cadena está vacía, debemos devolver false
        if (cadena.length() == 0) {
            return false;
        }
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            // Si no está entre 0 y 9
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    public void agregar_usuario() {
        Scanner texto = new Scanner(System.in);
        String dato = null;

        System.out.println("Ingrese su nombre");
        dato = texto.nextLine();
        setNombre(dato);
        System.out.println("Ingrese su apellido");
        dato = texto.nextLine();
        setApellidos(dato);
        boolean pepe;
        do {
            System.out.println("Ingrese su cedula");
            dato = texto.nextLine();
            pepe = contieneSoloNumeros(dato);
            if (pepe == true) {
                setCedula(Integer.parseInt(dato));
            } else {
                System.out.println("Inserte solo numeros");
            }
        } while (pepe != true);

        do {
            System.out.println("Ingrese su edad");
            dato = texto.nextLine();
            pepe = contieneSoloNumeros(dato);
            if (pepe == true) {
                setEdad(Integer.parseInt(dato));
            } else {
                System.out.println("Inserte solo numeros");
            }
        } while (pepe != true);

        System.out.println("Ingrese su sexo");
        dato = texto.nextLine();
        setSexo(dato);

        
        boolean prueba = true;
        int i = 0;
        do {
            if (array_nombre[i] == null) {
                prueba = false;
            } else {
                i++;
            }
        } while (prueba != false);
        
        array_nombre[i] = getNombre();
        array_apellido[i] = getApellidos();
        array_cedula[i] = getCedula();
        array_edad[i] = getEdad();
        array_sexo[i] = getSexo();

    }

    public void modificar_pasajero() {
        Scanner texto = new Scanner(System.in);
        String dato = null;
        int opcion = 0;
        valor = 1;
        do {
            System.out.println("Pilotos: ");
            int i = 0;
            for (i = 0; i < valor; i++) {
                System.out.println(i + ". " + array_nombre[i] + "  " + array_apellido[i] + "  " + array_cedula[i] + "  " + array_edad[i] + "  " + array_sexo[i]);
            }
            System.out.println((valor - 1) + ". Salir");
            System.out.println("Cual pasajero desea modificar");

            opcion = Integer.parseInt(texto.nextLine());
            switch (opcion) {
                case 1:
                    if (array_apellido[0] == null) {
                        System.out.println("no existe ningun pasajero");
                    } else {
                        System.out.println("Ingrese su nombre");
                        dato = texto.nextLine();
                        setNombre(dato);
                        System.out.println("Ingrese su apellido");
                        dato = texto.nextLine();
                        setApellidos(dato);
                        boolean pepe;
                        do {
                            System.out.println("Ingrese su cedula");
                            dato = texto.nextLine();
                            pepe = contieneSoloNumeros(dato);
                            if (pepe == true) {
                                setCedula(Integer.parseInt(dato));
                            } else {
                                System.out.println("Inserte solo numeros");
                            }
                        } while (pepe != true);

                        do {
                            System.out.println("Ingrese su edad");
                            dato = texto.nextLine();
                            pepe = contieneSoloNumeros(dato);
                            if (pepe == true) {
                                setEdad(Integer.parseInt(dato));
                            } else {
                                System.out.println("Inserte solo numeros");
                            }
                        } while (pepe != true);
                        System.out.println("Ingrese su sexo");
                        dato = texto.nextLine();
                        setSexo(dato);

                        array_nombre[(valor)] = getNombre();
                        array_apellido[(valor)] = getApellidos();
                        array_cedula[(valor)] = getCedula();
                        array_edad[(valor)] = getEdad();
                        array_sexo[(valor)] = getSexo();
                    }
                    break;
                case 0:
                    System.out.println("Adios piloto :D");
                    break;
                default:
                    System.out.println("Error, dato incorrecto");
            }
        } while (opcion != 0);
    }
    
    
    @Override
    public String toString() {

        boolean prueba = true;
        int i = 0;
        do {
            if (array_apellido[i] == null ) {
                prueba = false;
                System.out.println(i);
            } else {
                i++;
            }
        } while (prueba != false);

        String obtener = "Datos pasajeros: ";
        
        if (i == 0) {
            obtener = "Error. No existen datos";
        } else {
        }
        for (int j = 0; j < i; j++) {
            obtener = obtener + array_nombre[j] + " " + array_apellido[j] + " " + array_cedula[j] + " " + array_edad[j] + " " + array_sexo[j] + "\n";
        }
        return obtener;
    }
    

}
