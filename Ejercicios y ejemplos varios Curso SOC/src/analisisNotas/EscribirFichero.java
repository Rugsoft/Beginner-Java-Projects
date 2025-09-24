package analisisNotas;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscribirFichero {

	public EscribirFichero() {}
	
	public void pasarAFichero(List<String> cadena) {
		
		//String rutaFichero = "C:\\Users\\Usuario\\Desktop\\promedios.txt";
        String rutaFicheroCasa = "/home/rugsoft/Escritorio/promedios.txt";

        try (FileWriter escritor = new FileWriter(rutaFicheroCasa)) {
        	
        	for (String parte : cadena) {
        		
        		escritor.write(parte + "\n");
        	}
            JOptionPane.showMessageDialog(
                    null,
                    "Fichero creado correctamente",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE
            );
            
            }catch (IOException e) {
                System.out.println("Error al escribir el fichero: " + e.getMessage());
            }
       
        }
	
	}

	
