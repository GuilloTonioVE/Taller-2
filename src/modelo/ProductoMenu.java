package modelo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ProductoMenu {
	
	private String nombre;
	private Integer precioBase;
	public final static String archivoMenu = "."+File.separator+"data"+File.separator+"menu.txt";
	
	public ProductoMenu(String nombre, int precioBase){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public Integer getPrecio() {
		return precioBase;
	}
	public void generarTextoFactura(String linea) throws IOException {
	PrintWriter escritor = new PrintWriter(archivoMenu);
	escritor.println(linea);
	escritor.close();
	}

}
