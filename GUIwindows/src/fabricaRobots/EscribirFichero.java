package fabricaRobots;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	public EscribirFichero() {}
	
	public void pasarAFichero(String cadena) {
		
		//String rutaFichero = "C:\\Users\\Usuario\\Desktop\\Robotos.txt";
        String rutaFicheroCasa = "/home/rugsoft/Escritorio/Robotos.txt";
		
        try (FileWriter escritor = new FileWriter(rutaFicheroCasa, true)) {
        	
            	escritor.write(cadena + "\n");
            
            }catch (IOException e) {
                System.out.println("Error al escribir el fichero: " + e.getMessage());
            }
       
        }
	
	}

	
