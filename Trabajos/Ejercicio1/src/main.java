/*
Programa que permita capturar dos numeros y me diga si son pares o 
impares al igual que me diga cual es el mayor
*/

import java.util.Scanner;


public class main {
        
    public static void main(String[] args) {
        final String SALUDO = "Hola";
        Scanner dato = new Scanner(System.in);
        String num1;
        int n1 , n2;
        
	System.out.println("Digite dos numeros");
        System.out.println("Primer numero: ");
	num1 = dato.nextLine();
        n1 = Integer.parseInt(num1);
        System.out.println("Segundo numero: ");
        n2 = dato.nextInt();
        
        if (n1 >n2) {
            System.out.println("El numero " + n1 + " Es el mayor \n");
        }else if (n2>n1){
            System.out.println("El numero " + n2 + " Es el mayor \n");
        }else if (n2 == n1){
            System.out.println("Los numeros son iguales \n");
        }
        
        
        //numero par o impar necesito el residuo % mod
        int residuo = 0;
        residuo = n1 % 2;
        
        if (residuo == 0){
            System.out.println("El numero " + n1 + " es par \n");
        }else {
            System.out.println("El numero " + n1 + " es Impar \n");
        }
        
        residuo = n2 % 2;
        
        if (residuo == 0){
            System.out.println("El numero " + n2 + " es par");
        }else {
            System.out.println("El numero " + n2 + " es Impar");
        }
    }
}

