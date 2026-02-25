import java.time.LocalDate;

public class Pedido {

    private int numeroPedido;
    private int cantidad;
    private LocalDate fecha;
    private Cliente cliente;
    private Articulo articulo;


    //Constructor
    public Pedido(int numeroPedido, int cantidad, Cliente cliente, Articulo articulo){
        this.numeroPedido = numeroPedido;
        this.cantidad = cantidad;
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.articulo = articulo;
    }


    //Getters y setters
    public int getNumeroPedido() {return numeroPedido;}
    public void setNumeroPedido(int numeroPedido) {this.numeroPedido = numeroPedido;}

    public int getCantidad() {return cantidad;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public LocalDate getFecha() {return fecha;}
    public void setFecha(LocalDate fecha) {this.fecha = fecha;}

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public Articulo getArticulo() {return articulo;}
    public void setArticulo(Articulo articulo) {this.articulo = articulo;}



    //toString
    public String toString() {
        return "Pedido: {" +
                "Num: " + numeroPedido +
                ", Fecha: " + fecha +
                ", Cliente: " + cliente.getNombre() +
                ", Cantidad: " + cantidad +
                ", || Articulo: " + articulo.getDescripcion() + 
                ", Codigo de Producto: " + articulo.getCodigoProducto() +
                " || }";
    }
}
