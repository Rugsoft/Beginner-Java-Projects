package numerosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Clase de utilidad para leer números enteros desde un fichero de texto.
 * Cada línea del fichero debe contener un único número entero.
 * 
 * Notas:
 * - La ruta del fichero está actualmente "hardcodeada" (valor fijo en el código).
 *   Considera externalizarla a configuración, argumento de método o variable de entorno.
 * - El método muestra un diálogo Swing para informar del éxito; en aplicaciones de consola/servidor
 *   podría ser preferible usar logging en lugar de UI.
 */
public class LeerFichero {

	public LeerFichero() {}
	
	/**
	 * Lee un fichero de texto línea a línea y convierte cada línea a Integer.
	 * 
	 * Lista de enteros leídos. Si ocurre un error de E/S, se devuelve la lista acumulada (posiblemente vacía).
	 * 
	 * Consideraciones:
	 * - Se usa try-with-resources para cerrar automáticamente el lector.
	 * - Si una línea no es un entero válido, Integer.parseInt lanzará NumberFormatException
	 *   que actualmente no se captura; podría interesar capturarla para omitir líneas inválidas
	 *   o reportar el problema sin abortar toda la lectura.
	 */
	public List<Integer> lecturaFichero() {
		
		// Ruta absoluta al fichero a leer.
		// TODO: Evitar rutas absolutas dependientes del usuario/equipo. Usar rutas relativas, configuración, o JFileChooser.
		String rutaFichero = "C:\\Users\\Usuario\\Desktop\\datos.txt";
		
		// Estructura de datos para acumular los enteros leídos en orden.
		List <Integer> datos = new ArrayList<Integer>();
		
		// try-with-resources garantiza el cierre de BufferedReader aunque haya excepciones.
		try (BufferedReader lector = new BufferedReader(new FileReader(rutaFichero))) {
			
			String linea;
			// Bucle de lectura: readLine() devuelve null al llegar al final del fichero.
			while ((linea = lector.readLine()) != null) {
				// Convierte la línea a entero. Lanza NumberFormatException si la línea no es un número válido.
				int numero = Integer.parseInt(linea.trim()); // trim() para evitar espacios y saltos residuales
				datos.add(numero);
			}
			
			// Notificación visual de éxito (UI Swing). En contextos no interactivos, preferir logging.
			JOptionPane.showMessageDialog(
					null,
					"Datos leídos del fichero correctamente", 
					"Información",
					JOptionPane.INFORMATION_MESSAGE
			);
			
		} catch (IOException e) {
			// Manejo de errores de entrada/salida: fichero no encontrado, permisos, etc.
			System.out.println("Error al leer el fichero: " + e.getMessage());
			// Opcional: e.printStackTrace(); o uso de un logger para mayor detalle.
		}
		
		// Se devuelve la lista
		return datos;
	}
	
}
