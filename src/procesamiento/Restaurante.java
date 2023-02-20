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
			Ingrediente nombreProducto = partes[0];
			Ingrediente precio = partes[1];
			
			ingredientes.put(nombreProducto, precio);

			// Si el país no existe, lo agrega a la lista de paises
			Pais elPais = paises.get(nombrePais);
			if (elPais == null)
			{
				elPais = new Pais(nombrePais);
				paises.put(nombrePais, elPais);
			}

			// Si no se había encontrado antes a ese atleta, se agrega como un nuevo atleta.
			// Acá suponemos que no hay atletas con el mismo nombre
			Atleta elAtleta = atletas.get(nombreAtleta);
			if (elAtleta == null)
			{
				elAtleta = new Atleta(nombreAtleta, genero, elPais);
				elPais.agregarAtleta(elAtleta);
				atletas.put(nombreAtleta, elAtleta);
			}

			// Si no se había encontrado antes este evento, se agrega como uno nuevo.
			// Los eventos se identifican por su nombre y el año.
			Evento elEvento = buscarEvento(eventos, nombreEvento, anio);
			if (elEvento == null)
			{
				elEvento = new Evento(nombreEvento, anio);
				eventos.add(elEvento);
			}

			// Registra la participación del atleta en el evento, incluyendo el resultado
			// alcanzado (medalla de oro, plata, bronce o ninguna - na).
			Participacion laParticipacion = new Participacion(elAtleta, edad, elEvento, laMedalla);
			elAtleta.agregarParticipacion(laParticipacion);
			elEvento.agregarParticipacion(laParticipacion);

			linea = br.readLine(); // Leer la siguiente línea
		}
	}
	
	public static cargarMenu cargarArchivo(String archivoMenu, String archivoIngredientes, String archivoCombo) throws FileNotFoundException, IOException
	{
		List<ProductoMenu> menuBase = new ArrayList<>();
		Map<String, Ingrediente> ingredientes = new HashMap<>();
		Map<String, Combo> combos = new HashMap<>();
		

		// Abrir el archivo y leerlo línea por línea usando un BufferedReader
		BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
		String linea = br.readLine(); // La primera línea del archivo se ignora porque únicamente tiene los títulos de
										// las columnas
		
		

		br.close();
}
}
