package modelo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Pedido {
	private Integer numeroPedidos;
	private Integer idPedido;
	private String nombreCliente;
	private String direccionCliente;
	
	public Pedido(String nombreCliente, String direccionCliente) {
		
	}
	
	public Integer getIdPedido() {
		return idPedido;	
	}
	public void agregarProducto(Producto nuevoItem) {
		
	}
	
	public Integer getPrecioNetoPedido() {
		return idPedido;
	}
	public Integer getPrecioTotalPedido() {
		return idPedido;
	}
	public Integer getPrecioIVAPedido() {
		return idPedido;
	}
	
	public String generarTextoFactura(String archivo) throws IOException {
		PrintWriter escritor = new PrintWriter(archivo);
		escritor.println(archivo);
		escritor.close();
		return archivo;
		}
	
	public void guardarFactura(File archivo) {
		
	}
}
