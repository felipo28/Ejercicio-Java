package modelo;

public class claseLibro {
    private  String Estanteria;
    private  String isbn;
    private String nombre;
    private  String autor;
    private int paginas;
    private  boolean prestado;

    public claseLibro() {
    }

    public claseLibro(String Estanteria, String isbn, String nombre, String autor, int paginas, boolean prestado) {
        this.Estanteria = Estanteria;
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
        this.prestado = prestado;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getEstanteria() {
        return Estanteria;
    }

    public void setEstanteria(String Estanteria) {
        this.Estanteria = Estanteria;
    }
    
}
