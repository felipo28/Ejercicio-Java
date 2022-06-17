package ejerciciocompra;

public class claseCompras {
    private int numCompra;
    private String nombreCliente;
    private String fechaCompra;
    private String nombreProducto;
    private int cantidad;
    private int valorUnitario;

    public claseCompras() {
    }

    public claseCompras(int numCompra, String nombreCliente, String fechaCompra, String nombreProducto, int cantidad, int valorUnitario) {
        this.numCompra = numCompra;
        this.nombreCliente = nombreCliente;
        this.fechaCompra = fechaCompra;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
    }

    public int getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(int numCompra) {
        this.numCompra = numCompra;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "claseCompras{" + "numCompra=" + numCompra + ", nombreCliente=" + nombreCliente + ", fechaCompra=" + fechaCompra + ", nombreProducto=" + nombreProducto + ", cantidad=" + cantidad + ", valorUnitario=" + valorUnitario + '}';
    }

    public void getTotal(){
        System.out.println("Nombre cliente: " + getNombreCliente() + " "  + "\nFecha de la compra: " + getFechaCompra() 
                + "\nnombre del producto: " + getNombreProducto() + "\ncantidad: " + getCantidad()
                + "\nValor unitario: " + getValorUnitario() + " \nTotal de compra: " + (getValorUnitario() * getCantidad()) );
    }

}
