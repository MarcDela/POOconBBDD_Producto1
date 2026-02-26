//Carpeta clientes
package clientes;


//Creacion clase clientes
public class clientes {
    private String nombre;
    private String domicilio;
    private String NIF;
    private String email;

//Estructura constructor 
public clientes (String pnombre, String pdomicilio, String pNIF, String pemail) {
this.nombre = pnombre;
this.domicilio = pdomicilio;
this.NIF = pNIF;
this.email = pemail;
}

//Metodo getter nombre del cliente
public String getNombre() {return this.nombre;}

//Metodo setter nombre del cliente
public void setNombre (String nombre) {this.nombre = nombre;}

//Metodo getter domicilio
public String getDomicilio() {return this.domicilio;}

//Metodo setter domicilio
public void setDomicilio (String domicilio) {this.domicilio = domicilio;}

//Metodo getter NIF
public String getNIF() {return this.NIF;}

//Metodo setter NIF
public void setNIF (String NIF) {this.NIF = NIF;}

//Metodo getter email
public String getEmail() {return this.email;}

//Metodo setter email
public void setEmail (String email) {this.email = email;}

//Metodo toString()
public String toString() {return "Nombre cliente:  " + nombre + "\n Domicilio: " + domicilio + "\n NIF " + NIF + "\n Email " + email;}
}
