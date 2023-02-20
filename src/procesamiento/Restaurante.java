package procesamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelo.Combo;
import modelo.Ingrediente;
import modelo.Pedido;
import modelo.Producto;
import modelo.ProductoMenu;

public class Restaurante {
	
	public final static String archivoMenu = "."+File.separator+"data"+File.separator+"menu.txt";
	public final static String archivoIngredientes = "."+File.separator+"data"+File.separator+"ingredientes.txt";
	public final static String archivoCombo = "."+File.separator+"data"+File.separator+"combos.txt";
	
	
	private Restaurante() {
		
	}
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) {
		
	}
	
	public void cerrarYGuardarPedido() {
		
	}
	
	public Pedido getPedidoEnCurso() {
		return null;
		
	}
	
	public ArrayList<Producto> getMenuBase(){
		return null;
		
	}
	
	public ArrayList<Ingrediente> getIngredientes(){
		return null;
		
	}
	
	public void cargarInformacionRestaurante(File archivoMenu, File archivoIngredientes, File archivosCombos) {
		
	}
	
	public void cargarIngredientes(File archivoIngredientes) throws FileNotFoundException, IOException {
		Map<String, Ingrediente> ingredientes = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader(archivoIngredientes));
		
		String linea = br.readLine();
		
		while (linea != null) // Cuando se llegue al final del archivo, linea tendrá el valor null
		{
			// Separar los valores que estaban en una línea
			String[] partes = linea.split(",");
			String nombreProducto = partes[0];
			double precio = Double.parseDouble(partes[1]);
			
			Ingrediente elIngrediente = ingredientes.get(nombreProducto);
			if (elIngrediente == null)
			{
				elIngrediente = new Ingrediente(nombreProducto, precio);
				ingredientes.put(nombreProducto,elIngrediente);
			}

			linea = br.readLine(); // Leer la siguiente línea
		}
		br.close();
	}		
}
