package com.mycompany.ejerciciocapicua;

import java.util.Scanner;

/*
hacer un programa que capture un numero y me diga si es capicua o no
ejemplo:
    12321
    121
 */
public class Ejerciciocapicua {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.println("Introduzca el numero: ");
        int num1 = numero.nextInt();

        int longitud = String.valueOf(num1).length();

        int prueba = num1, cifra, inverso = 0;

        for (int i = 0; i < longitud; i++) {
            cifra = prueba % 10;
            inverso = inverso * 10 + cifra;
            prueba = prueba / 10;
        }

        if (num1 == inverso) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
}
