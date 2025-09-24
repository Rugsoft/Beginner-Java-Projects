package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerTexto {

	public static void main(String[] args) {
		
		String rutaFichero = "C:\\Users\\Usuario\\Desktop\\datos.txt";
		List <String> datos = new ArrayList<String>();
		
		try (BufferedReader lectora = new BufferedReader(new FileReader(rutaFichero))) {
			
			String linea;
			while ((linea = lectora.readLine()) != null) {
				datos.add(linea);
			}
			
		} catch (IOException e) {
			System.out.println("Error al leer el fichero: " + e.getMessage());
		}
		for (String dato : datos) {
			System.out.println(dato);
		}
	}

}
