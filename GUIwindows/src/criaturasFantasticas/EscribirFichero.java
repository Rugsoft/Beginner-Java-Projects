package criaturasFantasticas;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	public EscribirFichero() {}
	
	public void pasarAFichero(String cadena) {
		
		String rutaFichero = "C:\\Users\\Usuario\\Desktop\\criaturas.txt";
		
        try (FileWriter escritor = new FileWriter(rutaFichero, true)) {
        	
            	escritor.write(cadena);
            
            }catch (IOException e) {
                System.out.println("Error al escribir el fichero: " + e.getMessage());
            }
       
        }
	
	}

	
