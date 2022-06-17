package ejerciciocompra;

import java.util.Scanner;

public class EjercicioCompra {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        String dato = null, nomcli = null;
        
        ClasePersona persona = new ClasePersona();
        claseCliente cliente = new claseCliente();
        claseCompras compra = new claseCompras();
        System.out.println("Ingrese su nombre: ");
        dato = texto.nextLine();
        nomcli = dato;
        cliente.setNombre(dato);
        System.out.println("Ingrese su apellido: ");
        dato = texto.nextLine();
        nomcli = nomcli + " " + dato;
        cliente.setApellido(dato);
        System.out.println("Ingrese su fecha de nacimiento: ");
        dato = texto.nextLine();
        cliente.setFechaNacimiento(dato);
        
        System.out.println(cliente.toString());
        
        int id=0;
        
        System.out.println("Ingrese su id: ");
        id = Integer.parseInt(texto.nextLine());
        cliente.setIdentificacion(id);
        System.out.println("Ingrese su direccion de correspondencia: ");
        dato = texto.nextLine();
        cliente.setDireccion(dato);
        System.out.println("Ingrese su numero de contacto: ");
        dato = texto.nextLine();
        cliente.setContacto(dato);
        
        cliente.getProductoPreferido();
        
        System.out.println("ingrese el producto: ");
        String [] array  = {"papas picantes", "papas de pollo", "gaseosa cuatro", "gaseosa Coca-Cola"};
        
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "." + array[i]);
        }
        int opcion = 0;
        int cantidad = 0, num = 1;
        opcion = texto.nextInt();
        switch (opcion) {
            case 1:
                compra.setNumCompra(num);
                compra.setNombreCliente(nomcli);
                System.out.println("Fecha de compra: ");
                dato = texto.nextLine();
                dato = texto.nextLine();
                compra.setFechaCompra(dato);
                compra.setNombreProducto(array[0]);
                System.out.println("Cantidad: ");
                cantidad = Integer.parseInt(texto.nextLine());
                compra.setCantidad(cantidad);
                compra.setValorUnitario(5000);
                
                compra.getTotal();
                
            break;
            case 2:
                compra.setNumCompra(num);
                compra.setNombreCliente(nomcli);
                System.out.println("Fecha de compra: ");
                dato = texto.nextLine();
                dato = texto.nextLine();
                compra.setFechaCompra(dato);
                compra.setNombreProducto(array[0]);
                System.out.println("Cantidad: ");
                cantidad = texto.nextInt();
                compra.setCantidad(cantidad);
                compra.setValorUnitario(4700);
                
                compra.getTotal();
                
            break;
            case 3:
                compra.setNumCompra(num);
                compra.setNombreCliente(nomcli);
                System.out.println("Fecha de compra: ");
                dato = texto.nextLine();
                dato = texto.nextLine();
                compra.setFechaCompra(dato);
                compra.setNombreProducto(array[0]);
                System.out.println("Cantidad: ");
                cantidad = texto.nextInt();
                compra.setCantidad(cantidad);
                compra.setValorUnitario(2300);
                
                compra.getTotal();
                
            break;
            case 4:
                compra.setNumCompra(num);
                compra.setNombreCliente(nomcli);
                System.out.println("Fecha de compra: ");
                dato = texto.nextLine();
                dato = texto.nextLine();
                compra.setFechaCompra(dato);
                compra.setNombreProducto(array[0]);
                System.out.println("Cantidad: ");
                cantidad = texto.nextInt();
                compra.setCantidad(cantidad);
                compra.setValorUnitario(3000);
                
                compra.getTotal();
                
            break;
            default:
                System.out.println("No se pudo realizar la compra");
        }
        
     }
    
}
