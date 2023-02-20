package modelo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Combo {
	
	private Double descuento;
	private String nombreCombo;
	public final static String archivoCombo = "."+File.separator+"data"+File.separator+"combos.txt";
	
	public Combo(String nombre, double descuento){
		
	}
	
	public void agregarItemACombo(Producto itemCombo) {
		
	}
	
	public Double getPrecio() {
		return descuento;
	}
	
	public String getNombre() {
		return nombreCombo;
	}
	
	public void generarTextoFactura(String linea) throws IOException {
		PrintWriter escritor = new PrintWriter(archivoCombo);
		escritor.println(linea);
		escritor.close();
		}

}
