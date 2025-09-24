package numerosFicheros;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EscribirFichero {

	public EscribirFichero() {}
	
	public void pasarAFichero(int numero) {
		
		String rutaFichero = "C:\\Users\\Usuario\\Desktop\\resultado.txt";
		
        // Modo 'crear o sobrescribir'
        try (FileWriter escritor = new FileWriter(rutaFichero)) {
            	escritor.write("El resultado de la suma es: " + numero);
            	
            	JOptionPane.showMessageDialog(
         				null,
         				"Datos guardados en fichero correctamente", 
         				"Información",
         				JOptionPane.INFORMATION_MESSAGE
         		);
            	
            }catch (IOException e) {
                System.out.println("Error al escribir el fichero: " + e.getMessage());
            }
       
        }
	
	}

	
