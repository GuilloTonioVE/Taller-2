package modelo;

import java.io.File;

public class Ingrediente {
	private String nombre;
	private Double costoAdicional;
	private Map<String, Ingrediente> ingredientes;
	public final static String archivoIngredientes = "."+File.separator+"data"+File.separator+"ingredientes.txt";
	
	public Ingrediente(String nombre, Double costoAdicional){
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
		//ingredientes = new Map<nombre, costoAdicional>();
	}
	

	public String getNombre() {
		return nombre;
	}
	public Double getcostoAdicional() {
		return costoAdicional;
	}
}
