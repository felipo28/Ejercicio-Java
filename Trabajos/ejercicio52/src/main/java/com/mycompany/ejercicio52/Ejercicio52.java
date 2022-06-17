package com.mycompany.ejercicio52;

import java.util.Scanner;

/*
Programa que lee 10 numeros enteros sobre un arreglo y obtiene e imprime 
cuales son el mayor y el menor numero almacenados y cuantas veces se repite
*/

public class Ejercicio52 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int [] numeros = new int [10];
        int menor = 0, mayor = 0, cmenor = 0, cmayor=0;
        
        //entrada de valores
        System.out.println("Digite 10 numeros");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite el " + (i+1) + " numero: ");
            numeros[i]=dato.nextInt();
            
        }
        
        //procedimiento
        menor = mayor = numeros[0];
        for (int i = 0; i < 10; i++) {
            if (menor > numeros[i]) {
                menor = numeros[i];
            }
            if (mayor > numeros[i]) {
                mayor = numeros[i];
            }
        }
        
        for (int i = 0; i < 10; i++) {
            if (menor == numeros[i]) {
                cmenor++;
            }
            if (mayor == numeros[i]) {
                cmayor++;
            }
        }
        
        //salida de valores
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i] + " numero: ");
        }
        System.out.println("\nel menor es: " + menor + " y se repite " + cmenor+" veces");
        System.out.println("el mayor es: " + mayor + " y se repite " + cmayor+" veces");
    }
}
