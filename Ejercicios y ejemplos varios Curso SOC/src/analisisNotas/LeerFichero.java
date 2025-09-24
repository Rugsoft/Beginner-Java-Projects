package analisisNotas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
public class LeerFichero {

	public LeerFichero() {}
	
	
	public List<String> lecturaFichero() {

		//String rutaFichero = "C:\\Users\\Usuario\\Desktop\\notas_alumnos.txt";
        String rutaFicheroCasa = "/home/rugsoft/Escritorio/notas_alumnos.txt";

		List <String> datos = new ArrayList<String>();

		try (BufferedReader lector = new BufferedReader(new FileReader(rutaFicheroCasa))) {
			
			String linea;
			while ((linea = lector.readLine()) != null) {

				String cadena = linea.trim();
				datos.add(cadena);
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
