package com.mycompany.ejemploordenarnumeros;

import java.util.Scanner;

/*
 Capturar 5 numeros y ordenarlos
 definir variables arreglo
*/
public class Ejemploordenarnumeros {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int [] numeros = new int[5];
        int aux = 0;

        //entrada de valores
        System.out.println("Digite 5 numeros ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite el " + (i + 1) + " numero: ");
            numeros[i] = dato.nextInt();
        }
        //procedimiento
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (numeros[i] > numeros[j]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        //Salida de valores
        for (int p = 0; p < 5; p++) {
            System.out.println(numeros[p] + " ");
        }
    }
}
