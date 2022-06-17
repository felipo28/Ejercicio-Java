package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Tabla de multiplicar
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de numeros que se "
                + "utilizaran en la multiplicacion");
        int num1 = numero.nextInt();
        int[] numeros = new int[num1];
        int respuesta;
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Introduzca número %d: ", i + 1);
            numeros[i] = numero.nextInt();
        }

        System.out.println("Escoja rango de inicio");
        int rangoInicio = numero.nextInt();
        System.out.println("Escoja rango del Final");
        int rangoFinal = numero.nextInt();
        
        
        if (rangoInicio < rangoFinal) {
            System.out.println("Error");
        } else {
       
            for (int i = 0; i <= numeros.length; i++) {
                System.out.println("________________________________________\n");
                System.out.println(" Tabla: " + numeros[i]);
                for (int j = rangoInicio; j <= rangoFinal; j++) {
                    respuesta = numeros[i] * j;
                    System.out.println(numeros[i] + " * " + j + " = " + respuesta);
                }
            }

        }
       
        
        
    }
}
