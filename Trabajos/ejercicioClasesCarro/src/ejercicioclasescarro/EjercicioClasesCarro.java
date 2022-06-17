package ejercicioclasescarro;

import java.util.Scanner;
import javax.imageio.ImageIO;

public class EjercicioClasesCarro {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        String dato = null;
        
        //instanciar un objeto de tipo marca
        claseMarca fabricante = new claseMarca();
        claseMarca productor = new claseMarca();
        claseMarca elOtro = new claseMarca(538, "pepe");
        
        fabricante.setCodigo(101);
        fabricante.setNombre("Mazda");
        System.out.println("codigo: " + fabricante.getCodigo() +
                 " Nombre: " + fabricante.getNombre());
        
        System.out.println("Escriba el codigo del producto:");
        dato = texto.nextLine();
        productor.setCodigo(Integer.parseInt(dato));
        System.out.println("Escriba el nombre del producto: ");
        dato = texto.nextLine();
        productor.setNombre(dato);
        System.out.println(fabricante.toString());
        
        System.out.println(elOtro.toString());
        
        
        
        
        
        String clase_Vehiculo = null;
        
        //instanciar un objeto de tipo marca
        claseVehiculo vehiculo = new claseVehiculo();

        vehiculo.setColor("Negro");
        vehiculo.setMarca("ford");
        vehiculo.setModelo("discovery");
        vehiculo.setPlaca("bcj898");
        System.out.println("Color: " + vehiculo.getColor() +
                " Marca: " + vehiculo.getMarca() + 
                " Modelo: " + vehiculo.getModelo() + 
                " Placa: " + vehiculo.getPlaca());
        
        
        System.out.println("Escriba el color del carro:");
        clase_Vehiculo = texto.nextLine();
        vehiculo.setColor(clase_Vehiculo);
        
        System.out.println("Escriba el Marca del carro:");
        clase_Vehiculo = texto.nextLine();
        vehiculo.setMarca(clase_Vehiculo);
        
        System.out.println("Escriba el Modelo del carro:");
        clase_Vehiculo = texto.nextLine();
        vehiculo.setModelo(clase_Vehiculo);
        
        System.out.println("Escriba el Placa del carro:");
        clase_Vehiculo = texto.nextLine();
        vehiculo.setPlaca(clase_Vehiculo);
        
        System.out.println(vehiculo.toString());
        
        
        
        claseCamioneta linda = new claseCamioneta();
        linda.setPlaca("aaa999");
        linda.setModelo("2023");
        linda.setMarca("5");
        linda.setCabina(true);
        linda.setPlaton("grande");
        linda.setRepuesto("afuera");
        linda.setColor("Azul");
        linda.getMostrarTodo();
        
    }
}
