
package ejercicioclasescomplejo;

import java.util.Scanner;

public class claseAsiento {

    private String compartimiento;
    private boolean estado;
    private int numero_asiento;

    public claseAsiento() {
    }

    public claseAsiento(String compartimiento, boolean estado, int numero_asiento, String fecha_regreso, String fecha_salida, String hora_llegada, String hora_salida, String lugar_destino, String lugar_origen, int numero_vuelo, String piloto, String tipo_vuelo, String aerolinea, String codigo_avion, String compartimientos, int numero_asientos) {
        this.compartimiento = compartimiento;
        this.estado = estado;
        this.numero_asiento = numero_asiento;
    }

    public String getCompartimiento() {
        return compartimiento;
    }

    public void setCompartimiento(String compartimiento) {
        this.compartimiento = compartimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNumero_asiento() {
        return numero_asiento;
    }

    public void setNumero_asiento(int numero_asiento) {
        this.numero_asiento = numero_asiento;
    }

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

    String[] arrayCompartimiento = new String[5];
    boolean[] arrayEstado = new boolean[5];
    int[] arrayNumero_asiento = new int[5];
    int[] arrayopcion = new int[5];

    int valor;

    public void datos() {
        arrayCompartimiento[0] = "vacio";
        arrayEstado[0] = false;
        arrayNumero_asiento[0] = 1;
    }

    public void crear_asiento() {

        Scanner texto = new Scanner(System.in);
        String dato = null;

        datos();

        System.out.println("asientos actuales:");

        int opcion = 0;
        do {
            boolean prueba = true;
            int i = 0;
            do {
                if (arrayCompartimiento[i] == null) {
                    prueba = false;
                } else {
                    i++;
                }
            } while (prueba != false);

            for (int j = 0; j < i; j++) {
                System.out.println("compartimiento: " + arrayCompartimiento[j] + ", Estado: " + arrayEstado[j] + ", Numero del asiento: " + arrayNumero_asiento[j]);
            }

            System.out.println("Desea agregar otro asiento?");
            System.out.println("1. Si");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(texto.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Ingresar compartimiento: ");
                    setCompartimiento(texto.nextLine());
                    arrayCompartimiento[i] = getCompartimiento();

                    System.out.println(" ");
                    System.out.println("Estado asientos: ");
                    System.out.println("1. libre ");
                    System.out.println("2. ocupado ");
                    opcion = Integer.parseInt(texto.nextLine());

                    switch (opcion) {
                        case 1:
                            //false es que esta libre
                            setEstado(false);
                            arrayEstado[i] = isEstado();
                            break;
                        case 2:
                            //true es que esta ocupado
                            setEstado(true);
                            arrayEstado[i] = isEstado();
                            break;
                    }

                    boolean pepe;
                    do {
                        System.out.println(" ");
                        System.out.println("Ingresar numero de asiento");
                        dato = texto.nextLine();
                        pepe = contieneSoloNumeros(dato);
                        if (pepe == true) {
                            setNumero_asiento(Integer.parseInt(dato));
                            arrayNumero_asiento[i] = getNumero_asiento();
                        } else {
                            System.out.println("Inserte solo numeros");
                        }
                    } while (pepe != true);

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

        int valor = 0;
    }

    @Override
    public String toString() {
        datos();
        boolean prueba = true;
        int i = 0;
        do {
            if (arrayCompartimiento[i] == null) {
                prueba = false;
            } else {
                i++;
            }
        } while (prueba != false);

        String obtener = "";

        for (int j = 0; j < i; j++) {
            setCompartimiento(arrayCompartimiento[j]);
            setEstado(arrayEstado[j]);
            setNumero_asiento(arrayNumero_asiento[j]);

            obtener = obtener + getCompartimiento() + " " + isEstado() + " " + getNumero_asiento() + "\n" + "        ";
        }
        return "Datos: {" + obtener + '}';
    }

    public void reservar() {
        Scanner texto = new Scanner(System.in);
        datos();
        boolean prueba = true, disponibles = true;
        int i = 0;
        do {
            if (arrayCompartimiento[i] == null) {
                prueba = false;
            } else {
                i++;
            }
        } while (prueba != false);

        String obtener = "";

        System.out.println("Asientos libres: ");
        int p = 0;
        for (int j = 0; j < i; j++) {
            setEstado(arrayEstado[j]);
            setNumero_asiento(arrayNumero_asiento[j]);
            if (isEstado() == false) {
                p = p + 1;
                obtener = obtener + p + ". " + getNumero_asiento() + "  " + isEstado() + " " + "\n";
                arrayopcion[j] = j;
                System.out.println("pepe " + arrayopcion[j]);
            }
        }
        System.out.println(obtener);
        System.out.println("0. salir ");
        int opcion = 0;

        do {
            System.out.println("Seleccione cual quiere reservar: ");
            opcion = Integer.parseInt(texto.nextLine());
            int pepe;
            switch (opcion) {
                case 1:
                    opcion = opcion - 1;
                    pepe = arrayopcion[opcion];
                    arrayEstado[pepe] = true;
                    System.out.println("Se reservo exitosamente :D");
                    valor = i;
                    break;
                case 2:
                    opcion = opcion - 1;
                    pepe = arrayopcion[opcion];
                    arrayEstado[pepe] = true;
                    System.out.println("Se reservo exitosamente :D");
                    valor = i;
                    break;
                case 3:
                    opcion = opcion - 1;
                    pepe = arrayopcion[opcion];
                    arrayEstado[pepe] = true;
                    System.out.println("Se reservo exitosamente :D");
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
    
    
    
    
    public void desbloquear() {
        Scanner texto = new Scanner(System.in);
        datos();
        boolean prueba = true, disponibles = true;
        int i = 0;
        do {
            if (arrayCompartimiento[i] == null) {
                prueba = false;
            } else {
                i++;
            }
        } while (prueba != false);

        String obtener = "";

        System.out.println("Todos los asientos quedaron libres");
        int p = 0;
        for (int j = 0; j < i; j++) {
            setEstado(arrayEstado[j]);
            arrayEstado[j] = false;
        }
    }
}
