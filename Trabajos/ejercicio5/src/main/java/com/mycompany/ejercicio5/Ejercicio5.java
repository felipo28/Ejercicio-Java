
package com.mycompany.ejercicio5;

import java.util.Scanner;

/*
Programa que lee 10 numeros enteros sobre un arreglo y obtiene e imprime 
cuales son el mayor y el menor numero almacenados
*/

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        System.out.println("ingrese 10 valores: ");
        int array [] = new int [10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el dato " + (i+1) + ": ");
            array [i] = dato.nextInt();
        }
        
        int mayor, menor;
        mayor = menor = array[0];
        
        for (int i = 0; i < 10; i++) {
            if(array[i] > mayor){
                mayor = array[i];
            }else if (array[i] < menor) {
                menor = array[i];
            }
        }
        System.out.println("El valor mayor es " + mayor);
        System.out.println("El valor menor es " + menor);
    }
}
