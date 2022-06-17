package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    /*
    5 medidas de metros pasarlos a pies
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        System.out.println("ingrese 5 medidas: ");
        int array [] = new int [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Dato  " + (i+1) + ": ");
            array [i] = dato.nextInt();
        }
        
        double pies;
        int j = 0;
        
        while (j < 5) {        
            pies = array [j];
            pies = pies * 3.28;
            System.out.println("Metro: " + array [j] + ", Pies : " + pies );
            j++;
        }
    }
}
