public class Cliente {
    
    private String nombre;
    private String domicilio;
    private String nif;
    private String email;


    //Constructor
    public Cliente(String nombre, String domicilio, String nif, String email) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.nif = nif;
        this.email = email;
    }


    //Getters y setters
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDomicilio() {return domicilio;}
    public void setDomicilio(String domicilio) {this.domicilio = domicilio;}

    public String getNif() {return nif;}
    public void setNif(String nif) {this.nif = nif;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}


    //ToString
    public String toString(){
        return "Cliente: {" +
                "Tipo Cliente: " + tipoCliente() +
                "|| Nombre: " + nombre +
                ", Domicilio: " + domicilio +
                ", NIF: " + nif +
                ", Email: " + email + 
                " }";
    }


    //Metodo para identificar el tipo de cliente -- usado en el toString -- Si la orden viene de la clase Premium, lo sustituye por "Premium"
    public String tipoCliente(){
        return "Estandar";
    }
}
