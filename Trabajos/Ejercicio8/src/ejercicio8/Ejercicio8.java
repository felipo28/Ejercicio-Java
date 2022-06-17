package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    /*
    iniciar un control 
    do {
        instrucciones
    .
    .
    variar el control
    }while(condicion);
     */
    public static void main(String[] args) {
        //programa que valide
        //rango numeros 1 y 10
        final int MAX = 10;
        int num = 0;
        boolean seguir = true;
        Scanner txt = new Scanner(System.in);
        String dato = null;
        do {            
            System.out.println("digite un numero entre 1 y 10 ");
            dato= txt.nextLine();
            num = Integer.parseInt(dato);
            if (!(num <= 10 && num >= 1)) {
                System.out.println("Error. el rango es de 1 a 10. vualva a intentarlo.");
                seguir = true;
            }else{
                seguir = false;
            }
        } while (seguir);
        System.out.println("Fin del programa");
        
        //////////////////////////////////////////////////////////////////////////////////////////////
        
        //validacion de sexo masculino femenino e indefinido
        seguir = true;
        do {            
            System.out.println("Escriba masculino femenino e indefinido: ");
            dato = txt.nextLine();
            dato = dato.trim(); //quita espacios al inicio y final de una cadena
            dato = dato.toLowerCase(); //pasa todo a minusculas
            dato = dato.toUpperCase(); //pasa todo a mayusculas
            
            if (dato.equals("masculino") || dato.equals("femenino") || dato.equals("indefinido")) {
                System.out.println("correcto");
                seguir = false;
            } else {
                System.out.println("Error. debe escribir masculino femenino e indefinido");
                seguir = true;
            }
        } while (seguir);
        
        //llenar un arreglo
        
        int [] numeros = new int [MAX];
        int p = 0;
        System.out.println("digite 10 numero:");
        do {            
            System.out.println("Digite un numero: ");
            dato = txt.nextLine();
            numeros[p] = Integer.parseInt(dato);
            p++;
        } while (p<10);
        
        p = 0;
        System.out.println("Listado de numeros");
        do {            
            System.out.println(numeros[p] + " ");
            p++;
        } while (p<10);
        System.out.println("Fin del programa.");
        
        
    }
    
}
