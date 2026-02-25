public class Premium extends Cliente{
    
    private int descuento = 20;
    private double cuota = 30.00; 

    
    //Constructor
    public Premium(String nombre, String domicilio, String nif, String email){
        super(nombre, domicilio, nif, email);
    }


    //Getters y setters
    public int getDescuento() {return descuento;}
    public void setDescuento(int descuento) {this.descuento = descuento;}

    public double getCuota() {return cuota;}
    public void setCuota(double cuota) {this.cuota = cuota;}


    //ToString
    @Override
    public String toString() {
        // Al llamar a super.toString(), ahora se usará el nuevo tipoCliente() de Premium
        return super.toString() + 
        " [Cuota: " + cuota + 
        "euros, Descuento: " + descuento + 
        "%]";
    }


    //Metodo para identificar el tipo de Cliente
    @Override
    public String tipoCliente() {
        return "Premium";
    }
}
