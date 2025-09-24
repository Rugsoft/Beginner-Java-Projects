package ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EscribirFichero {
	public static void main(String[] args) {

		String rutaFichero = "C:\\\\Users\\\\Usuario\\\\Desktop\\\\datos.txt";
		List<String> datos = new ArrayList<String>(List.of("Ana", "Luis", "Carlos", "María"));
		
        // Modo 'crear o sobrescribir'
        try (FileWriter escritor = new FileWriter(rutaFichero)) {
            for(int i=0;i<datos.size();i++) {
            		escritor.write(datos.get(i)+"\n");
            }
            System.out.println("Texto escrito correctamente (modo crear/sobrescribir).");
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero: " + e.getMessage());
        }
		
        //Modo 'añadir'
        String textoAdicional = "\nEste texto se añade al final del fichero.";
        
        try (FileWriter escritor = new FileWriter(rutaFichero, true)) {
            escritor.write(textoAdicional);
            System.out.println("Texto añadido correctamente (modo añadir).");
        } catch (IOException e) {
            System.out.println("Error al añadir al fichero: " + e.getMessage());
        }
	}
}
