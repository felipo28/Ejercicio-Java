package com.mycompany.proyectobiblioteca.modelo;

import java.util.ArrayList;


public class claseEstante {
    private int id;
    private  String nombre;
    private String descripcion;
    public ArrayList <claseLibro> libros = new ArrayList();

    public claseEstante() {
    }

    public claseEstante(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    //metodo para agregar libros
    public void agregarLibroEstante(claseLibro libroNuevo){
        libros.add(libroNuevo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<claseLibro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<claseLibro> libros) {
        this.libros = libros;
    }
    
}
