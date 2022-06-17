
package ejercicioclasescomplejo;

import java.util.Scanner;

public class clasePiloto {
    private String apellidos;
    private String codigo_piloto;
    private String nombre;
    private int numero_licencia;

    public clasePiloto() {
    }

    public clasePiloto(String apellidos, String codigo_piloto, String nombre, int numero_licencia, int valor, String fecha_regreso, String fecha_salida, String hora_llegada, String hora_salida, String lugar_destino, String lugar_origen, int numero_vuelo, String piloto, String tipo_vuelo, String aerolinea, String codigo_avion, String compartimientos, int numero_asientos) {
        
        this.apellidos = apellidos;
        this.codigo_piloto = codigo_piloto;
        this.nombre = nombre;
        this.numero_licencia = numero_licencia;
        this.valor = valor;
    }


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo_piloto() {
        return codigo_piloto;
    }

    public void setCodigo_piloto(String codigo_piloto) {
        this.codigo_piloto = codigo_piloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_licencia() {
        return numero_licencia;
    }

    public void setNumero_licencia(int numero_licencia) {
        this.numero_licencia = numero_licencia;
    }

    EjercicioClasesComplejo inicio = new EjercicioClasesComplejo();
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

    boolean si = false;

    public void agregar_piloto() {
        si = true;
        Scanner texto = new Scanner(System.in);
        String dato = null;

        System.out.println("Ingrese su nombre");
        dato = texto.nextLine();
        setNombre(dato);
        System.out.println("Ingrese su apellido");
        dato = texto.nextLine();
        setApellidos(dato);
        System.out.println("Ingrese su codigo licencia");
        dato = texto.nextLine();
        setCodigo_piloto(dato);

        boolean pepe;
        do {
            System.out.println("Ingrese su numero de licencia");
            dato = texto.nextLine();
            pepe = contieneSoloNumeros(dato);
            if (pepe == true) {
                setNumero_licencia(Integer.parseInt(dato));
            } else {
                System.out.println("Inserte solo numeros");
            }
        } while (pepe != true);
        boolean prueba = true;
        int i = 0;
        do {
            if (inicio.array_nombre[i] == null) {
                prueba = false;
                System.out.println(i);
            } else {
                i++;
            }
        } while (prueba != false);
        inicio.array_nombre[i] = getNombre();
        inicio.array_apellido[i] = getApellidos();
        inicio.array_codigo_licencia[i] = getCodigo_piloto();
        inicio.array_num_licencia[i] = getNumero_licencia();
        valor = i;
    }

    public void modificar_piloto() {
        Scanner texto = new Scanner(System.in);
        String dato = null;

        int opcion = 0;
        valor = valor + 1;
        do {
            System.out.println("Pilotos: ");
            int i = 0;
            for (i = 0; i < valor; i++) {
                System.out.println((i + 1) + ". " + inicio.array_nombre[i] + "  " + inicio.array_apellido[i] + "  " + inicio.array_codigo_licencia[i] + "  " + inicio.array_num_licencia[i]);
            }
            System.out.println("0. Salir");
            System.out.println("Cual piloto desea modificar");
            opcion = Integer.parseInt(texto.nextLine());
            switch (opcion) {
                case 1:
                    if (inicio.array_apellido[0] == null) {
                        System.out.println("no existe ningun piloto");
                    } else {
                        System.out.println("Ingrese su nombre");
                        dato = texto.nextLine();
                        setNombre(dato);
                        System.out.println("Ingrese su apellido");
                        dato = texto.nextLine();
                        setApellidos(dato);
                        System.out.println("Ingrese su codigo licencia");
                        dato = texto.nextLine();
                        setCodigo_piloto(dato);

                        boolean pepe;
                        do {
                            System.out.println("Ingrese su numero de licencia");
                            dato = texto.nextLine();
                            pepe = contieneSoloNumeros(dato);
                            if (pepe == true) {
                                setNumero_licencia(Integer.parseInt(dato));
                            } else {
                                System.out.println("Inserte solo numeros");
                            }
                        } while (pepe != true);
                        inicio.array_nombre[(valor - 1)] = getNombre();
                        inicio.array_apellido[(valor - 1)] = getApellidos();
                        inicio.array_codigo_licencia[(valor - 1)] = getCodigo_piloto();
                        inicio.array_num_licencia[(valor - 1)] = getNumero_licencia();

                    }
                    break;
                case 2:
                    if (inicio.array_apellido[1] == null) {
                        System.out.println("no existe ningun piloto");
                    } else {
                        System.out.println("Ingrese su nombre");
                        dato = texto.nextLine();
                        setNombre(dato);
                        System.out.println("Ingrese su apellido");
                        dato = texto.nextLine();
                        setApellidos(dato);
                        System.out.println("Ingrese su codigo licencia");
                        dato = texto.nextLine();
                        setCodigo_piloto(dato);

                        boolean pepe;
                        do {
                            System.out.println("Ingrese su numero de licencia");
                            dato = texto.nextLine();
                            pepe = contieneSoloNumeros(dato);
                            if (pepe == true) {
                                setNumero_licencia(Integer.parseInt(dato));
                            } else {
                                System.out.println("Inserte solo numeros");
                            }
                        } while (pepe != true);
                        inicio.array_nombre[(valor - 1)] = getNombre();
                        inicio.array_apellido[(valor - 1)] = getApellidos();
                        inicio.array_codigo_licencia[(valor - 1)] = getCodigo_piloto();
                        inicio.array_num_licencia[(valor - 1)] = getNumero_licencia();
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
            System.out.println(i + inicio.array_nombre[i]);
            if (inicio.array_nombre[i] == null ) {
                prueba = false;
                System.out.println(i);
            } else {
                i++;
            }
        } while (prueba != false);

        String obtener = "Datos piloto: ";
        
        if (i == 0) {
            obtener = "Error. No existen datos";
        } else {
        }
        for (int j = 0; j < i; j++) {
            obtener = obtener + inicio.array_nombre[j] + " " + inicio.array_apellido[j] + " " + inicio.array_codigo_licencia[j] + " " + inicio.array_num_licencia[j] + "\n" + "              ";
        }
        return obtener;
    }
}
