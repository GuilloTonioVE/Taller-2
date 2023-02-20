package modelo;

import java.io.File;

public class Ingrediente {
	private String nombre;
	private Integer costoAdicional;
	public final static String archivoIngredientes = "."+File.separator+"data"+File.separator+"ingredientes.txt";
	
	public Ingrediente(String nombre, int costoAdicional){
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public Integer getcostoAdicional() {
		return costoAdicional;
	}

}
