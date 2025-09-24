package bibliotecaDigital;

// Clase Revista: representa una publicación de tipo revista.
// Hereda de Publicacion, por lo que reutiliza título, autor y año, y añade el número de edición.
public class Revista extends Publicacion {
	
	// Constructor de Revista:
	// title: título de la revista
	// author: autor/a o responsable
	// publishYear: año de publicación
	// editionNumber: número de edición (específico de revista)
	public Revista(String title, String author, int publishYear, int editionNumber) {
		
		super(title, author, publishYear); // Inicializa los campos comunes definidos en Publicacion
		this.editionNumber = editionNumber; // Inicializa el campo específico de Revista
	}

	// Atributo específico de la revista: número de edición
	int editionNumber;

	// Muestra un resumen por consola:
	// - Primero invoca el resumen de la clase base (título, autor y año)
	// - Después imprime el número de edición propio de Revista
	public void resumen() {
		super.resumen(); // Imprime Título, Autor y Año (definido en Publicacion)
		System.out.printf("\nNumero de edicion: %d", this.editionNumber);
	}
	
	// Getter del número de edición
	public int getEditionNumber() {
		return editionNumber;
	}

	// Setter del número de edición
	public void setEditionNumber(int editionNumber) {
		this.editionNumber = editionNumber;
	}

}
