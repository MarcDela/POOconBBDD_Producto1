import java.util.ArrayList;

public class Empresa {
    
    private String nif;
    private String nombre;
    private Almacen almacen;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Pedido> listaPedidos;


    //Constructor
    public Empresa (String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
        this.almacen = new Almacen();
        this.listaClientes = new ArrayList<>();
        this.listaPedidos = new ArrayList<>();
    }


    //Getters y setters
    public String getNif() {return nif;}
    public void setNif(String nif) {this.nif = nif;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    
    public Almacen getAlmacen() {return almacen;}
    public void setAlmacen(Almacen almacen) {this.almacen = almacen;}

    public ArrayList<Cliente> getListaClientes() {return listaClientes;}
    public void setListaClientes(ArrayList<Cliente> listaClientes) {this.listaClientes = listaClientes;}

    public ArrayList<Pedido> getListaPedidos() {return listaPedidos;}
    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {this.listaPedidos = listaPedidos;}



    //toString
    public String toString() {
        return "Empresa: " + nombre + " (NIF: " + nif + ")" +
                "\n Clientes registrados: " + listaClientes.size() +
                "\n Pedidos totales: " + listaPedidos.size();
    }
}
