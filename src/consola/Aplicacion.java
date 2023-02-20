package consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

import procesamiento.LoaderMenu;


public class Aplicacion {

	
	private LoaderMenu calculadora;
	
	public void ejecutarAplicacion()
	{
		System.out.println("Bienvenido\n");
	}
	
	/**
	 * Muestra al usuario el men� con las opciones para que escoja la siguiente
	 * acci�n que quiere ejecutar.
	 */
	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicaci�n\n");
		System.out.println("1. Cargar informaci�n del restaurantr");
		System.out.println("2. Iniciar pedido");
		System.out.println("3. Cerrar y guardad pedido");
		System.out.println("4. Get Pedido en curso");
		System.out.println("5. Consultar el pa�s con m�s medallistas");
		System.out.println("6. Consultar todos los medallistas de un evento dado");
		System.out.println("7. Consultar los atletas con un m�nimo de medallas");
		System.out.println("8. Consultar el atleta estrella de todos los tiempos");
		System.out.println("9. Consultar mejor pa�s en un evento");
		System.out.println("10. Consultar el atleta todoterreno");
		System.out.println("11. Consultar los medallistas por pa�s y g�nero");
		System.out.println("12. Consultar el porcentaje de atletas que son medallistas");
		System.out.println("13. Consultar el pais que representa un atleta");
		System.out.println("14. Salir de la aplicaci�n\n");
	}
	
	private void ejecutarPorcentajeMedallistas()
	{
		
	}
	
	private void ejecutarOpcion()
	{
		System.out.println("\n" + "Cargar los archivos del restaurante" + "\n");

		String archivo = input("Por favor ingrese el nombre del archivo txt con la informacion");
		try
		{
			calculadora = LoaderMenu.cargarArchivo(archivo);
			System.out.println("Se carg� el archivo " + archivo + " con informaci�n de los Juegos Ol�mpicos.");
			Collection<String> eventos = calculadora.darNombresDeportes();
			System.out.println("Los deportes para los que se tiene informaci�n son:");
			for (String dep : eventos)
			{
				System.out.println(" - " + dep);
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontr�.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}

	}

	
	private void ejecutarCargarAtletas()
	{
		System.out.println("\n" + "Cargar un archivo de atletas" + "\n");

		String archivo = input("Por favor ingrese el nombre del archivo CSV con los atletas");
		try
		{
			calculadora = LoaderMenu.cargarArchivo(archivo);
			System.out.println("Se carg� el archivo " + archivo + " con informaci�n de los Juegos Ol�mpicos.");
			Collection<String> eventos = calculadora.darNombresDeportes();
			System.out.println("Los deportes para los que se tiene informaci�n son:");
			for (String dep : eventos)
			{
				System.out.println(" - " + dep);
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontr�.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}

	}
	
	/**
	 * Este m�todo sirve para imprimir un mensaje en la consola pidi�ndole
	 * informaci�n al usuario y luego leer lo que escriba el usuario.
	 * 
	 * @param mensaje El mensaje que se le mostrar� al usuario
	 * @return La cadena de caracteres que el usuario escriba como respuesta.
	 */
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Este es el m�todo principal de la aplicaci�n, con el que inicia la ejecuci�n
	 * de la aplicaci�n
	 * 
	 * @param args Par�metros introducidos en la l�nea de comandos al invocar la
	 *             aplicaci�n
	 */
	public static void main(String[] args)
	{
		Aplicacion consola = new Aplicacion();
		consola.ejecutarAplicacion();
	}

}
	
}
