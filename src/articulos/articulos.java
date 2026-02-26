//Carpeta para articulos
package articulos;

import java.math.BigDecimal;

//Creación de la clase y declaracion de las variables 
public class articulos {
    private String codigoArticulo;
    private String descripcion;
    private BigDecimal precioVenta;
    private BigDecimal gastosEnvio;
    private int tiempoPrepEnvio;


//Estructura constructor 
public articulos (String codigoArticulo, String descripcion, BigDecimal precioVenta, BigDecimal gastosEnvio, int tiempoPrepEnvio) {
this.codigoArticulo = codigoArticulo;
this.descripcion = descripcion;
this.precioVenta = precioVenta;
this. gastosEnvio = gastosEnvio;
this.tiempoPrepEnvio = tiempoPrepEnvio;
}

//Metodo getter codigoArticulo
public String getCodigoArticulo() {return this.codigoArticulo;}

//Metodo setter codigoArticulo
public void setCodigoArticulo (String codigoArticulo) {this.codigoArticulo = codigoArticulo;}

//Metodo getter descripcion
public String getDescripcion() {return this.descripcion;}

//Metodo setter descripcion
public void setDescripcion (String descripcion) {this.descripcion = descripcion;}

//Metodo getter precioVenta
public BigDecimal getPrecioVenta() {return this.precioVenta;}

//Metodo setter precioVenta
public void setPrecioVenta (BigDecimal precioVenta) {this.precioVenta = precioVenta;}

//Metodo getter gastosEnvio
public BigDecimal getGastosEnvio() {return this.gastosEnvio;}

//Metodo setter gastosEnvio
public void setGastosEnvio (BigDecimal gastosEnvio) {this.gastosEnvio = gastosEnvio;}

//Metodo getter tiempoPrepEnvio
public int getTiempoPrepEnvio() {return this.tiempoPrepEnvio;}

//Metodo setter tiempoPrepEnvio
public void setTiempoPrepEnvio (int tiempoPrepEnvio) {this.tiempoPrepEnvio = tiempoPrepEnvio;}


//Metodo toString()
public String toString() {return "Codigo Articulo: " + codigoArticulo + "\n Descripcion: " + descripcion + "\n Precio de Venta: " + precioVenta + "\n Gastos de envio: " + gastosEnvio + "\n Tiempo de preparacion del envio: " + tiempoPrepEnvio;}
}