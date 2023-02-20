package modelo;

public interface Producto {
	
	public default Integer getPrecio(){
		return null;
	}
	public default String getNombre() {
		return null;
	}
	public default String generarTextoFactura() {
		return null;		
	}
	
}
