package analisisNotas;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		LeerFichero leer = new LeerFichero();
		EscribirFichero escribir = new EscribirFichero();
		
		List<String> datos = new ArrayList<String>(leer.lecturaFichero());
        List<String> promedioAlumnos = new ArrayList<String>();

		
		for (String datosAlumnos : datos) {
			
			String[] partes = datosAlumnos.split(",");
			String nombreAlumno = partes[0];
			
			List<Double> notas = new ArrayList<Double>();
			
			for (int i = 1; i < partes.length; i++) {
                
				double nota = Double.parseDouble(partes[i]);
                notas.add(nota);
            }
			
			double suma = 0.0;
			for (double nota : notas) {
                suma += nota;
            }
            double promedio = suma / notas.size();
            
            String cadenaAlumno = "El alumno " +nombreAlumno+ " tiene un promedio de: " +promedio;
            promedioAlumnos.add(cadenaAlumno);
			
		}
		escribir.pasarAFichero(promedioAlumnos);
        System.out.println("Fichero escrito correctamente!");

	}

}
