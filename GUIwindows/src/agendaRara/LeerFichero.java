package agendaRara;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class LeerFichero {

	public LeerFichero() {}
	
	public List<String> lecturaFichero() {
		
		String rutaFichero = "C:\\Users\\Usuario\\Desktop\\clientes.txt";
		
		List <String> datos = new ArrayList<String>();
		
		try (BufferedReader lector = new BufferedReader(new FileReader(rutaFichero))) {
			
			String linea;
			// Bucle de lectura: readLine() devuelve null al llegar al final del fichero.
			while ((linea = lector.readLine()) != null) {
				String cliente = linea.trim(); // trim() para evitar espacios y saltos residuales
				datos.add(cliente);
			}
			
			JOptionPane.showMessageDialog(
					null,
					"Datos leídos del fichero correctamente", 
					"Información",
					JOptionPane.INFORMATION_MESSAGE
			);
			
		} catch (IOException e) {
			System.out.println("Error al leer el fichero: " + e.getMessage());
		}
		
		return datos;
	}
	
}
