package ejercicioavion;

import java.util.Scanner;

public class EjercicioAvion {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        String dato = null;
        
        claseCiudad ciudad = new claseCiudad();
        clasePasajero pasajero = new clasePasajero();
        clasePiloto piloto = new clasePiloto();
        claseAsiento asiento = new claseAsiento();
        claseVuelo vuelo = new claseVuelo();
        claseAvion avion = new claseAvion();
 
        int opcion = 0;
        boolean prueba = false;
        do {
            System.out.println("M E N U");

            System.out.println("1. pasajero");
            System.out.println("2. piloto");
            System.out.println("3. ciudad.");
            System.out.println("4. asiento.");
            System.out.println("5. avion");
            System.out.println("6. vuelo");
            System.out.println("7. asiento");
            System.out.println("0. salir");

            opcion = Integer.parseInt(texto.nextLine());

            switch (opcion) {
                case 1:
                    EjercicioAvion.pasajeros();
                    break;
                case 2:
                    EjercicioAvion.piloto();
                    break;
                case 3:
                    EjercicioAvion.ciudad();
                    break;
                case 4:
                    EjercicioAvion.asiento();
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 0:
                    System.out.println("Adios :D");
                    break;
                default:
                    System.out.println("Error, dato incorrecto");
            }
        } while (opcion != 0);
    }

    public static void pasajeros() {
        Scanner texto = new Scanner(System.in);
        String dato = null;

        clasePasajero pasajeros = new clasePasajero();

        int opcion = 0;
        boolean prueba = false;
        do {
            System.out.println("M E N U");
            System.out.println("Clase pasajeros");

            System.out.println("1. Registro pasajero");
            System.out.println("2. modificar pasajero");
            System.out.println("3. buscar pasajero");
            System.out.println("4. ");
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
                case 4:
                    if (prueba == true) {

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

    public static void piloto() {
        Scanner texto = new Scanner(System.in);
        String dato = null;

        clasePiloto piloto = new clasePiloto();

        int opcion = 0;
        boolean prueba = false;
        do {
            System.out.println("M E N U");
            System.out.println("Clase piloto");

            System.out.println("1. Registro piloto");
            System.out.println("2. modificar piloto");
            System.out.println("3. buscar piloto");
            System.out.println("4. ");
            System.out.println("5. ");
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
                    if (prueba == true) {
                        System.out.println(piloto.toString());
                    } else {
                        System.out.println("Primero se debe registrar");
                    }
                    break;
                case 4:
                    if (prueba == true) {

                    } else {
                        System.out.println("Primero se debe registrar");
                    }
                    break;
                case 5:
                    if (prueba == true) {

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

    public static void ciudad() {
        Scanner texto = new Scanner(System.in);
        String dato = null;

        claseCiudad ciudad = new claseCiudad();

        int opcion = 0;
        boolean prueba = false;
        do {
            System.out.println("M E N U");
            System.out.println("Clase ciudad");

            System.out.println("1. agregar ciudad");
            System.out.println("2. mostrar ciudades");
            System.out.println("0. salir");

            opcion = Integer.parseInt(texto.nextLine());

            switch (opcion) {
                case 1:
                    ciudad.setInsertarCiudad();
                    prueba = true;
                    break;
                case 2:
                    System.out.println(ciudad.toString());
                    break;
                case 0:
                    System.out.println("Adios :D");
                    break;
                default:
                    System.out.println("Error, dato incorrecto");
            }
        } while (opcion != 0);
    }
    
    
    public static void asiento() {
        Scanner texto = new Scanner(System.in);
        String dato = null;

        claseAsiento asiento = new claseAsiento();

        int opcion = 0;
        boolean prueba = false;
        do {
            System.out.println("M E N U");
            System.out.println("Clase asiento");

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
    }
    
    
    public static void vuelo() {
        Scanner texto = new Scanner(System.in);
        String dato = null;

        claseVuelo vuelo = new claseVuelo();

        int opcion = 0;
        boolean prueba = false;
        do {
            System.out.println("M E N U");
            System.out.println("Clase vuelo");

            System.out.println("1. agregar vuelo");
            System.out.println("2. modificar vuelo");
            System.out.println("3. eliminar vuelo");
            System.out.println("4. ");
            System.out.println("0. salir");

            opcion = Integer.parseInt(texto.nextLine());

            switch (opcion) {
                case 1:
                    vuelo.agregar_vuelo();
                    prueba = true;
                    break;
                case 2:
                    if (prueba == true) {
                        
                    } else {
                        System.out.println("Primero se debe agregar un vuelo");
                    }
                    break;
                case 3:
                    if (prueba == true) {

                    } else {
                        System.out.println("Primero se debe agregar un vuelo");
                    }
                    break;
                case 4:
                    if (prueba == true) {

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
    }
}
