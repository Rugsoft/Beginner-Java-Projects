package numerosFicheros;

import java.util.ArrayList;
import java.util.List;

// Punto de entrada de la aplicación que:
// 1) Lee una colección de números desde un fichero (vía LeerFichero)
// 2) Calcula la suma de esos números
// 3) Escribe el resultado en otro fichero (vía EscribirFichero)
public class Main {

	public static void main(String[] args) {
		// Instancias de las clases utilitarias para lectura/escritura de ficheros.
		// Se asume que encapsulan la lógica de acceso a disco y manejo de formatos.
		LeerFichero leer = new LeerFichero();
		EscribirFichero escribir = new EscribirFichero();
		
		// Lectura del fichero y carga de los números en memoria.
		// Se crea un ArrayList independiente a partir del resultado por si la
		// implementación de lectura devolviese una lista inmutable o de solo lectura.
		List<Integer> numeros = new ArrayList<Integer>(leer.lecturaFichero());
		
		// Acumulador para la suma total
		int suma = 0;

		// Recorrido de la lista y suma de cada número.
		for (int numero : numeros) {
			suma += numero;
		}
		
		// Persistencia del resultado en un fichero de salida.
		// Se asume que 'pasarAFichero' gestiona la creación/apertura del archivo
		// y posibles errores de E/S internamente (o bien propaga excepciones).
		escribir.pasarAFichero(suma);
	}
}
