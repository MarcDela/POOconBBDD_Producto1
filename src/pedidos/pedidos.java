//Carpeta para pedidos
package pedidos;

import java.time.LocalDateTime;
//Creación de la clase y declaracion de las variables 
public class pedidos {
    private int numPedido;
    private String idCliente;
    private String codigoArticulo;
    private int unidades;
    private LocalDateTime fechaHoraPedido; 

//Estructura constructor 
public pedidos (int numPedido, String idCliente, String codigoArticulo, int unidades, LocalDateTime fechaHoraPedido) {
this.numPedido = numPedido;
this.idCliente = idCliente;
this.codigoArticulo = codigoArticulo;
this.unidades = unidades;
this.fechaHoraPedido = fechaHoraPedido;
}

//Metodo getter numPedido
public int getNumPedido() {return this.numPedido;}

//Metodo setter numPedido
public void setNumPedido (int numPedido) {this.numPedido = numPedido;}

//Metodo getter idCliente
public String getidCliente() {return this.idCliente;}

//Metodo setter idCliente
public void setidCliente (String idCliente) {this.idCliente = idCliente;}

//Metodo getter codigoArticulo
public String getCodigoArticulo() {return this.codigoArticulo;}

//Metodo setter codigoArticulo
public void setCodigoArticulo (String codigoArticulo) {this.codigoArticulo = codigoArticulo;}

//Metodo getter unidades
public int getUnidades() {return this.unidades;}

//Metodo setter unidades
public void setUnidades (int unidades) {this.unidades = unidades;}

//Metodo getter para registrar la fecha y la hora en la que se hace el pedido
public LocalDateTime getFechaHoraPedido() {return this.fechaHoraPedido;}

//Metodo setter registrar la fecha y la hora en la que se hace el pedido
public void setFechaHoraPedido (LocalDateTime fechaHoraPedido) {this.fechaHoraPedido = fechaHoraPedido;}

//Metodo toString()
public String toString() {return "Numero de pedido: " + numPedido + "\n Id Cliente: " + idCliente + "\n Codigo articulo: " + codigoArticulo + "\n Unidades: " + unidades + "\n Registro fecha y hora del pedido: " + fechaHoraPedido;}
}

