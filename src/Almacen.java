import java.util.ArrayList;
import java.util.HashMap;

public class Almacen {

    private ArrayList<Articulo> listaArticulos;
    private HashMap<Integer, Integer> stockMap;  /* PENDIENTE DE MAPEAR CON METODOS*/
    

    //Constructor
    public Almacen(){
        this.listaArticulos = new ArrayList<>();
        this.stockMap = new HashMap<>();
    }


    //Getters y setters
    public ArrayList<Articulo> getListaArticulos() {return listaArticulos;}


    //toString
    @Override
    public String toString() {
        return "Almacen {" +
                "Artículos registrados: " + listaArticulos.size() +
                ", Mapa de Stock: " + stockMap +
                '}';
    }
    
}
