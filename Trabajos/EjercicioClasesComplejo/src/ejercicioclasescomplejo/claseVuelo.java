package ejercicioclasescomplejo;

import static ejercicioclasescomplejo.EjercicioClasesComplejo.ciudades;
import static ejercicioclasescomplejo.EjercicioClasesComplejo.contarCiudades;
import static ejercicioclasescomplejo.claseAsiento.contieneSoloNumeros;
import java.util.Scanner;

public class claseVuelo {

    //atributos
    private String fecha_regreso;
    private String fecha_salida;
    private String hora_llegada;
    private String hora_salida;
    private String lugar_destino;
    private String lugar_origen;
    private int numero_vuelo;
    private String piloto;
    private String tipo_vuelo;

    //contructor
    public claseVuelo() {
    }

    public claseVuelo(String fecha_regreso, String fecha_salida, String hora_llegada, String hora_salida, String lugar_destino, String lugar_origen, int numero_vuelo, String piloto, String tipo_vuelo) {
        this.fecha_regreso = fecha_regreso;
        this.fecha_salida = fecha_salida;
        this.hora_llegada = hora_llegada;
        this.hora_salida = hora_salida;
        this.lugar_destino = lugar_destino;
        this.lugar_origen = lugar_origen;
        this.numero_vuelo = numero_vuelo;
        this.piloto = piloto;
        this.tipo_vuelo = tipo_vuelo;
    }

    //metodo finalizar
    public void finalize() throws Throwable {
        //codigo para finalizar el objeto creado
        super.finalize();
    }

    //get y set
    public String getFecha_regreso() {
        return fecha_regreso;
    }

    public void setFecha_regreso(String fecha_regreso) {
        this.fecha_regreso = fecha_regreso;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getLugar_destino() {
        return lugar_destino;
    }

    public void setLugar_destino(String lugar_destino) {
        this.lugar_destino = lugar_destino;
    }

    public String getLugar_origen() {
        return lugar_origen;
    }

    public void setLugar_origen(String lugar_origen) {
        this.lugar_origen = lugar_origen;
    }

    public int getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(int numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getTipo_vuelo() {
        return tipo_vuelo;
    }

    public void setTipo_vuelo(String tipo_vuelo) {
        this.tipo_vuelo = tipo_vuelo;
    }

    public void crear_vuelo() {
        EjercicioClasesComplejo piloto = new EjercicioClasesComplejo();
        Scanner texto = new Scanner(System.in);
        String dato = null;

        System.out.println("Ingresar fecha de salida: ");
        setFecha_salida(texto.nextLine());
        System.out.println("Ingresar fecha de regreso: ");
        setFecha_regreso(texto.nextLine());
        System.out.println("Ingresar hora de salida: ");
        setHora_salida(texto.nextLine());
        System.out.println("Ingresar hora de llegada: ");
        setHora_llegada(texto.nextLine());

        //opcion consultar
        System.out.println("\nListado de ciudades");
        int i;
        for (i = 0; i < contarCiudades; i++) {
            System.out.println(ciudades[i].toString());
        }
        String cadena;
        boolean condi = false;
        do {
            System.out.println("Ingresar lugar de origen: ");
            int opcion = texto.nextInt();
            switch (opcion) {
                case 1:
                    cadena = String.valueOf(ciudades[opcion - 1].toString());
                    setLugar_origen(cadena);
                    condi = true;
                    break;
                case 2:
                    cadena = String.valueOf(ciudades[opcion - 1].toString());
                    setLugar_origen(cadena);
                    condi = true;
                    break;
                case 3:
                    cadena = String.valueOf(ciudades[opcion - 1].toString());
                    setLugar_origen(cadena);
                    condi = true;
                    break;
                case 4:
                    cadena = String.valueOf(ciudades[opcion - 1].toString());
                    setLugar_origen(cadena);
                    condi = true;
                    break;
                default:
                    System.out.println("Error. Dato errado ");
            }
        } while (condi != true);

        System.out.println("\nListado de ciudades");
        for (i = 0; i < contarCiudades; i++) {
            System.out.println(ciudades[i].toString());
        }
        condi = false;
        do {
            System.out.println("Ingresar lugar destino: ");
            int opcion = texto.nextInt();
            switch (opcion) {
                case 1:
                    cadena = String.valueOf(ciudades[opcion - 1].toString());
                    setLugar_destino(cadena);
                    condi = true;
                    break;
                case 2:
                    cadena = String.valueOf(ciudades[opcion - 1].toString());
                    setLugar_destino(cadena);
                    System.out.println(cadena);
                    condi = true;
                    break;
                case 3:
                    cadena = String.valueOf(ciudades[opcion - 1].toString());
                    setLugar_destino(cadena);
                    condi = true;
                    break;
                case 4:
                    cadena = String.valueOf(ciudades[opcion - 1].toString());
                    setLugar_destino(cadena);
                    condi = true;
                    break;
                default:
                    System.out.println("Error. Dato errado ");
            }
        } while (condi != true);

        System.out.println("\nIngresar numero de vuelo: ");
        int val = 0;
        val = texto.nextInt();

        setNumero_vuelo(val);

        boolean prueba = true;
        i = 0;
        do {
            if (piloto.array_nombre[i] == null) {
                prueba = false;
            } else {
                i++;
            }
        } while (prueba != false);

        String obtener = "Datos piloto: ";

        if (i == 0) {
            obtener = "Error. No existen datos";
        }
        for (int j = 0; j < i; j++) {
            System.out.println((j + 1) + ". " + piloto.array_nombre[j] + " " + piloto.array_apellido[j]);
        }
        condi = false;
        do {
            System.out.println("\nEscoga el piloto: ");
            int opcion = texto.nextInt();
            switch (opcion) {
                case 1:
                    int va  = 0;
                    String tex = piloto.array_nombre[va] + " " + piloto.array_apellido[va];
                    setPiloto(tex);
                    condi = true;
                    break;
                case 2:
                    va  = 1;
                    tex = piloto.array_nombre[va] + " " + piloto.array_apellido[va];
                    setPiloto(tex);
                    condi = true;
                    break;
                case 3:
                    va  = 2;
                    tex = piloto.array_nombre[va] + " " + piloto.array_apellido[va];
                    setPiloto(tex);
                    condi = true;
                    break;
                case 4:
                    va  = 3;
                    tex = piloto.array_nombre[va] + " " + piloto.array_apellido[va];
                    setPiloto(tex);
                    condi = true;
                    break;
                default:
                    System.out.println("Error. Dato errado ");
            }
        } while (condi != true);

        System.out.println("\nIngresar tipo de vuelo: ");
        setTipo_vuelo(texto.nextLine());
        setTipo_vuelo(texto.nextLine());
    }

    @Override
    public String toString() {
        return "claseVuelo{" + "fecha_regreso=" + fecha_regreso + ", fecha_salida=" + fecha_salida + ", hora_llegada=" + hora_llegada + ", hora_salida=" + hora_salida + ", lugar_destino=" + lugar_destino + ", lugar_origen=" + lugar_origen + ", numero_vuelo=" + numero_vuelo + ", piloto=" + piloto + ", tipo_vuelo=" + tipo_vuelo + '}';
    }

    public void eliminar() {

    }

    public void modificar() {

    }

}
