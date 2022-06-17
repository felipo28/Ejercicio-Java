/*
Una empresa de aviacion te solicita elabora un programa que permita la venta de 
tiquetes o pasajes a los diferentes vuelos de la aerolinea. Se te solicita que 
el programa tenga un menu y sea totalmente validado.
 */
package ejercicioclasescomplejo;

import java.util.Scanner;

public class EjercicioClasesComplejo {

    //contantes
    public static final int MAXIMO = 15;
    //variables gobales
    public static int contarCiudades = 0;
    public static int contarPilotos = 0;
    //Instanciar objetos
    public static claseAsiento[] asientos = new claseAsiento[MAXIMO];
    public static claseAvion avion = new claseAvion();
    public static claseCiudad[] ciudades = new claseCiudad[5];
    public static clasePiloto[] piloto = new clasePiloto[5];
    public static claseVuelo vuelo = new claseVuelo();
    public static clasePasajero[] pasajeros = new clasePasajero[MAXIMO];
    
    
    public static String[] array_nombre = new String[3];
    public static String[] array_apellido = new String[3];
    public static String[] array_codigo_licencia = new String[3];
    public static int[] array_num_licencia = new int[3];

    public static void main(String[] args) {
        //crear variables y constantes
        int opc = 0;
        //menu
        do {
            crearMenu();
            opc = capturarOpcion();
            switch (opc) {
                case 1:
                    gestionarCiudades();
                    break;
                case 2:
                    gestionarAvion();
                    break;
                case 3:
                    gestionarPiloto();
                    break;
                case 4:
                    gestionarVuelo();
                    break;
                case 5:
                    gestionarPasajeros();
                    break;
                case 0:
                    System.out.println("\n\n\tSaliendo del sistema\n");
                    break;
                default:
                    System.out.println("\n\n\tOpcion Errada. Vuelva a intentarlo\n");
            }
        } while (opc != 0);

    }

    public static void crearMenu() {
        System.out.println("\n\n\t * * * M E N U * * *\n");
        System.out.println("1. Gestionar Ciudades");
        System.out.println("2. Gestionar Avion");
        System.out.println("3. Gestionar Piloto");
        System.out.println("4. Gestionar Vuelo");
        System.out.println("5. Gestionar Pasajero");
        System.out.println("0. Salir");
    }

    public static int capturarOpcion() {
        Scanner captura = new Scanner(System.in);
        boolean validar = true;
        int opc = 0;
        do {
            validar = true;
            System.out.print("Digite su opcion: ");
            try {
                opc = Integer.parseInt(captura.nextLine());
                validar = false;
            } catch (Exception e) {
                System.out.println("Error. Las opciones son numericas. " + e.getMessage());
                validar = true;
            }
        } while (validar);
        return opc;
    }

    public static void gestionarCiudades() {
        Scanner captura = new Scanner(System.in);
        int opc;
        String dato = null, nombre = null;
        int numero = 0;
        boolean validar = true;
        do {
            System.out.println("\n\n\t");
            System.out.println("* Menu Ciudades * \n");
            System.out.println("1. Agregar");
            System.out.println("2. Consultar");
            System.out.println("0. Cerrar");
            opc = capturarOpcion();
            switch (opc) {
                case 1:
                    //opcion agregar
                    if (contarCiudades < 5) {
                        do {
                            System.out.print("Código de la ciudad: ");
                            dato = captura.nextLine();
                            try {
                                numero = Integer.parseInt(dato);
                                validar = false;
                            } catch (Exception e) {
                                System.out.println("Error, el codigo debe ser numerico. " + e.getMessage());
                                validar = true;
                            }
                        } while (validar);
                        System.out.print("Nombre de la ciudad: ");
                        nombre = captura.nextLine();
                        ciudades[contarCiudades] = new claseCiudad(numero, nombre);
                        contarCiudades++;
                    } else {
                        System.out.println("No se pueden agregar mas ciudades.");
                    }
                    break;
                case 2:
                    //opcion consultar
                    System.out.println("\nListado de ciudades");
                    for (int i = 0; i < contarCiudades; i++) {
                        System.out.println(ciudades[i].toString());
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.println("\n\n\tOpcion Errada. Vuelva a intentarlo\n");
            }
        } while (opc != 0);
    }

    public static void gestionarAvion() {
        Scanner captura = new Scanner(System.in);
        int opc;
        String dato = null, compartimientos = null, aerolinea, cod = null;
        int numero = 0;
        boolean validar = true;
        do {
            System.out.println("\n\n\t");
            System.out.println("* Menu Avion *\n");
            System.out.println("1. Agregar");
            System.out.println("2. Consultar");
            System.out.println("3. Iniciar avion (Crear asientos)");
            System.out.println("4. Cancelar Avion");
            System.out.println("0. Cerrar");
            opc = capturarOpcion();
            switch (opc) {
                case 1:
                    //opcion agregar
                    System.out.print("Código del avion: ");
                    cod = captura.nextLine();
                    do {
                        System.out.print("Numero de asientos: ");
                        dato = captura.nextLine();
                        try {
                            numero = Integer.parseInt(dato);
                            if (numero < 2 || numero > MAXIMO) {
                                System.out.println("Error. El numero de asientos va entre 2 y 15");
                                validar = true;
                            } else {
                                validar = false;
                            }
                        } catch (Exception e) {
                            System.out.println("Error, el codigo debe ser numerico. " + e.getMessage());
                            validar = true;
                        }
                    } while (validar);
                    System.out.print("Compartimientos: ");
                    compartimientos = captura.nextLine();
                    System.out.print("Aerolinea: ");
                    aerolinea = captura.nextLine();
                    avion.setCodigo_avion(cod);
                    avion.setNumero_asientos(numero);
                    avion.setCompartimientos(compartimientos);
                    avion.setAerolinea(aerolinea);
                    System.out.println("--- Registro de informacion agregado ---");
                    break;
                case 2:
                    //opcion consultar
                    System.out.println(avion.toString());
                    System.out.println("");
                    break;
                case 3:
                    Scanner texto = new Scanner(System.in);
                    dato = null;

                    claseAsiento asiento = new claseAsiento();

                    int opcion = 0;
                    boolean prueba = false;
                    do {
                        System.out.println("\n\n\t");
                        System.out.println("* Menu asiento *\n");

                        System.out.println("1. agregar asiento");
                        System.out.println("2. reserva");
                        System.out.println("3. mostrar disponibles");
                        System.out.println("4. desbloquear");
                        System.out.println("0. salir");

                        opcion = Integer.parseInt(texto.nextLine());

                        switch (opcion) {
                            case 1:
                                asiento.crear_asiento();
                                prueba = true;
                                break;
                            case 2:
                                asiento.reservar();
                                break;
                            case 3:
                                if (prueba == true) {
                                    System.out.println(asiento.toString());
                                } else {
                                    System.out.println("Primero se debe agregar un vuelo");
                                }
                                break;
                            case 4:
                                if (prueba == true) {
                                    asiento.desbloquear();
                                } else {
                                    System.out.println("Primero se debe agregar un vuelo");
                                }
                                break;
                            case 0:
                                System.out.println("Adios :D");
                                break;
                            default:
                                System.out.println("Error, dato incorrecto");
                        }
                    } while (opcion != 0);
                    break;
                case 4:
                    avion = null;
                    for (int p = MAXIMO - 1; p >= 0; p--) {
                        asientos[p] = null;
                    }
                    break;
                default:
                    System.out.println("\n\n\tOpcion Errada. Vuelva a intentarlo\n");
            }
        } while (opc != 0);
    }

    public static void gestionarPiloto() {
        Scanner texto = new Scanner(System.in);
        String dato = null;

        clasePiloto piloto = new clasePiloto();

        int opcion = 0;
        boolean prueba = false;
        do {        
            System.out.println("\n\n\t");
            System.out.println("* Menu piloto *\n");

            System.out.println("1. Registro piloto");
            System.out.println("2. modificar piloto");
            System.out.println("3. buscar piloto");
            System.out.println("0. salir");

            opcion = Integer.parseInt(texto.nextLine());

            switch (opcion) {
                case 1:
                    piloto.agregar_piloto();
                    prueba = true;
                    break;
                case 2:
                    if (prueba == true) {
                        piloto.modificar_piloto();
                    } else {
                        System.out.println("Primero se debe registrar");
                    }
                    break;
                case 3:
                    System.out.println(piloto.toString());
                    break;
                case 0:
                    System.out.println("Adios :D");
                    break;
                default:
                    System.out.println("Error, dato incorrecto");
            }
        } while (opcion != 0);
    }

    public static void gestionarVuelo() {
        Scanner texto = new Scanner(System.in);
        String dato = null;

        claseVuelo vuelo = new claseVuelo();

        int opcion = 0;
        boolean prueba = false;
        do {
            System.out.println("\n\n\t");
            System.out.println("* Menu vuelo *\n");
            System.out.println("1. Registro vuelo");
            System.out.println("2. Listar vuelo");
            System.out.println("0. salir"); 

            opcion = Integer.parseInt(texto.nextLine());

            switch (opcion) {
                case 1:
                    vuelo.crear_vuelo();
                    prueba = true;
                    break;
                case 2:
                    if (prueba == true) {
                        System.out.println(vuelo.toString());
                    } else {
                        System.out.println("Primero se debe registrar");
                    }
                    break;
                case 0:
                    System.out.println("Adios :D");
                    break;
                default:
                    System.out.println("Error, dato incorrecto");
            }
        } while (opcion != 0);
    }

    public static void gestionarPasajeros() {
        Scanner texto = new Scanner(System.in);
        String dato = null;

        clasePasajero pasajeros = new clasePasajero();

        int opcion = 0;
        boolean prueba = false;
        do {
            System.out.println("\n\n\t");
            System.out.println("* Menu pasajeros *\n");
            System.out.println("1. Registro pasajero");
            System.out.println("2. modificar pasajero");
            System.out.println("3. buscar pasajero");
            System.out.println("0. salir");

            opcion = Integer.parseInt(texto.nextLine());

            switch (opcion) {
                case 1:
                    pasajeros.agregar_usuario();
                    prueba = true;
                    break;
                case 2:
                    if (prueba == true) {
                        pasajeros.modificar_pasajero();
                    } else {
                        System.out.println("Primero se debe registrar");
                    }
                    break;
                case 3:
                    if (prueba == true) {
                        System.out.println(pasajeros.toString());
                    } else {
                        System.out.println("Primero se debe registrar");
                    }
                    break;
                case 0:
                    System.out.println("Adios :D");
                    break;
                default:
                    System.out.println("Error, dato incorrecto");
            }
        } while (opcion != 0);
    }
}
