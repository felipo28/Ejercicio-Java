package ejercicio3;

import java.util.Scanner;

/*
  Hacer un programa que me capture un numero y me diga que mes es y en que 
  estacion estamos
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int dia = 0;
        System.out.println("Seleccione un numero del 1 al 12: ");
        dia = numero.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Enero");
                System.out.println("Estacion Invierno");
            break;
            case 2:
                System.out.println("Febrero");
                System.out.println("Estacion Invierno");
            break;
            case 3:
                System.out.println("Marzo");
                System.out.println("Estacion Invierno");
            break;
            case 4:
                System.out.println("Abril");
                System.out.println("Estacion Primavera");
            break;
            case 5:
                System.out.println("Mayo");
                System.out.println("Estacion Primavera");
            break;
            case 6:
                System.out.println("Junio");
                System.out.println("Estacion Primavera");
            break;
            case 7:
                System.out.println("julio");
                System.out.println("Estacion Verano");
            break;
            case 8:
                System.out.println("Agosto");
                System.out.println("Estacion Verano");
            break;
            case 9:
                System.out.println("Septiembre");
                System.out.println("Estacion Otoño");
            break;
            case 10:
                System.out.println("Octubre");
                System.out.println("Estacion Otoño");
            break;
            case 11:
                System.out.println("Noviembre");
                System.out.println("Estacion Otoño");
            break;
            case 12:
                System.out.println("Diciembre");
                System.out.println("Estacion Invierno");
            break;
            default:
                System.out.println("Opcion errada, Digite otro numero");
        }
        
        
            if (dia == 12 || dia == 1 || dia == 2 || dia == 3) {
                System.out.println("Estacion Invierno");
            } else if (dia == 4 || dia == 5 || dia == 6) {
                System.out.println("Estacion Primavera");
            } else if (dia == 7 || dia == 8) {
                System.out.println("Estacion Verano");
            } else if ( dia == 9 || dia == 10 || dia == 11 ) {
                System.out.println("Estacion Otoño");
            } else if ( 12 < dia ){
                System.out.println("Selecciona un numero dentro del rango.");
            }
        

    }
    
}
