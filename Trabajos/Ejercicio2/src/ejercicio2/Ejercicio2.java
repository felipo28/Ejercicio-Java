package ejercicio2;

import java.util.Scanner;

/*
Capturar un numero y me diga el dia de la semana que corresponde
*/
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int dia = 0;
        System.out.println("Seleccione un numero del 1 al 7: ");
        dia = numero.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Domingo");
            break;
            case 2:
                System.out.println("Lunes");
            break;
            case 3:
                System.out.println("Martes");
            break;
            case 4:
                System.out.println("Miercoles");
            break;
            case 5:
                System.out.println("Jueves");
            break;
            case 6:
                System.out.println("Viernes");
            break;
            case 7:
                System.out.println("Sabado");
            break;
            
            default:
                System.out.println("Opcion errada, Digite otro numero");
}
    }
}
