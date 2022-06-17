package ejercicio.menu;

import java.util.Scanner;

public class EjercicioMenu {

    /*
    Crear una aplicacion con un menu que funcione
    
    M E N U
    1. tabla multiplicar
    2. Factorial
    3. promedio
    0. salir
    
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int opcion = 5;
        do {
            int num1 = 0;
            int num2 = 0;
            int res = 0;
            System.out.printf("_______________________________\n\n");
            System.out.println("M E N U\n");
            System.out.println("1. Tabla multiplicar");
            System.out.println("2. Factorial");
            System.out.println("3. Promedio");
            System.out.println("0. Salir");

            opcion = numero.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Tabla de multiplicar\n");
                    System.out.print("Introduce un numero : ");
                    num1 = numero.nextInt();
                    System.out.println("Tabla del " + num1);
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num1 + " * " + i + " = " + (num1 * i));
                    }
                    break;

                case 2:
                    System.out.println("Factorial");
                    System.out.println("Escoge el numero: ");
                    num1 = numero.nextInt();
                    int fact = 1;
                    for (int i = 1; i <= num1; i++) {
                        fact = fact * i;
                    }
                    System.out.println("el factorial de " + num1 + " = " + fact);
                    break;

                case 3:
                    double suma = 0;
                    System.out.println("Promedio\n");
                    System.out.print("ingrese sus notas:\n \n");
                    double array[] = new double[4];
                    int i = 0;

                    while (i < array.length) {
                        System.out.print("Ingrese la nota " + (i + 1) + ":");
                        array[i] = numero.nextDouble();
                        i++;
                    }

                    for (int x = 0; x < array.length; x++) {
                        suma = suma + array[x];
                    }
                    double promedio = suma / array.length;
                    System.out.printf("Su promedio es: " + promedio + "\n \n");
                    
                    break;
                    
                    
                    case 0:
                        System.out.println("Adios :D");
                    break;
                default:
                    System.out.println("Opcion errada, Digite otro numero");
            }
        } while (opcion != 0);
    }
}
