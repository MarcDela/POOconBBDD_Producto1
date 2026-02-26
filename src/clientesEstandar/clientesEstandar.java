//Carpeta clientesEstandar
package clientesEstandar;

import clientes.clientes;

//Creacion clase 
public class clientesEstandar extends clientes {

    public clientesEstandar (String pnombre, String pdomicilio, String pNIF, String pemail){
    super (pnombre, pdomicilio, pNIF, pemail);}

    //Metodo toString()
public String toString() {return "Nombre cliente:  " + getNombre() + "\n Domicilio: " + getDomicilio() + "\n NIF " + getNIF() + "\n Email " + getEmail();}
}

