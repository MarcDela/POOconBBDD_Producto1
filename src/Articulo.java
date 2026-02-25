public class Articulo {
    
    private int codigoProducto;
    private String descripcion;
    private double precio;
    private double gastosEnvio;
    private int tiempoPrep;

    // Constructor
    public Articulo (int codigoProducto, String descripcion, double precio, double gastosEnvio, int tiempoPrep){
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.gastosEnvio = gastosEnvio;
        this.tiempoPrep = tiempoPrep;
    }


    //Getters y Setters
    public int getCodigoProducto() {return codigoProducto;}
    public void setCodigoProducto(int codigoProducto) {this.codigoProducto = codigoProducto;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    
    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}

    public double getGastosEnvio() {return gastosEnvio;}
    public void setGastosEnvio(double gastosEnvio) {this.gastosEnvio = gastosEnvio;}

    public int getTiempoPrep() {return tiempoPrep;}
    public void setTiempoPrep(int tiempoPrep) {this.tiempoPrep = tiempoPrep;}


    //ToString
    public String toString(){
        return "Articulo: {" + 
                "Codigo: " + codigoProducto +
                ", Descripcion: " + descripcion + 
                ", Precio: " + precio + " euros" +
                ", Gastos Envio: " + gastosEnvio + " euros" +
                ", Tiempo de preparación: " + tiempoPrep + 
                " minutos }";
    
    }

}
