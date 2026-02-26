package clientesPremium;

import clientes.clientes;

//Creacion clase 
public class clientesPremium extends clientes {
    private int cuotaAnual;

    public clientesPremium (String pnombre, String pdomicilio, String pNIF, String pemail, int cuotaAnual){
    super (pnombre, pdomicilio, pNIF, pemail);
    this.cuotaAnual = cuotaAnual;}

    //Metodo toString()
public String toString() {return "Nombre cliente:  " + getNombre() + "\n Domicilio: " + getDomicilio() + "\n NIF " + getNIF() + "\n Email " + getEmail() + "\n Cuota anual: " + cuotaAnual;}
}
