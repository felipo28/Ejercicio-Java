package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    /* 
    generar 30 numeros entre el 1 y el 99 y dar como resultados de:
    a) numero mas alto
    b) numero mas bajo
    c) media aritmetica
    d) moda
    e) mediana
    f) cantidad de 1,2... 10 y sus porcentajes
    */
    
    public static void main(String[] args) {
        int i = 0;
        Scanner dato = new Scanner(System.in);
        
        //genera y guarda 30 valores aleatorios
        
        double array [] = new double [30];
        
        while (i<30) {
            array [i] =(int) (Math.random() * 99 + 1);
            System.out.println((i+1) + " :  " + array [i]);
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array.length; k++) {
                if (array[j] < array[k]) {
                    double prueba = array[j];
                    array[j] = array[k];
                    array[k] = prueba;
                }
            }
        }
        // a) numero mas alto
        // b) numero mas bajo
        double numMayor = array[0], numMenor = array[0];
        
        for (int j = 0; j < array.length; j++) {
            if (array[j] > numMayor) {
                numMayor = array[j];
            }
            if (array[j] < numMenor) {
                numMenor = array[j];
            }
        }
        System.out.println("El numero mayor es: " + numMayor);
        System.out.println("El numero menor es: " + numMenor);
        
        // c) media aritmetica
        
        System.out.println("____________________________________");
        double media = 0, resMedia;
        for (int j = 0; j < array.length; j++) {
            media = media + array[j];
        }
        resMedia = media / array.length;
        System.out.println("suma: " + media);
        System.out.println("Media aritmetica: " + resMedia);
        
        //d) moda
        double max = 0, moda = 0 ;
        System.out.println("____________________________________");
        for (int m = 0; m < array.length; m++) {
            int repite = 0;
            max = 0;
            for (int n = 0; n < array.length; n++) {
                if (array[m] == array[n]) {
                    repite++;
                }
                if (repite > max) {
                    moda = array[m];
                    max = repite;
                }
            }
            System.out.println("La moda es " + array[m] +" y se repite " + max + " veces.");
        }
        
        //e) mediana
                
        System.out.println("____________________________________");
        
        /*
        for (int j = 0; j < array.length; j++) {
            System.out.println("La ordenar:  " + array[j]);
        }
        */
        
        int mitad = array.length/2;
        System.out.println("La mediana es:  " + array[mitad]);
        
        
        //f) cantidad de 1,2... 10 y sus porcentajes
        
        
    }
    
}
