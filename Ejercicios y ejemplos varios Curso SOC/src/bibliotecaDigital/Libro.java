package bibliotecaDigital; // Paquete donde se agrupa la clase

// Libro hereda de Publicacion, por lo que reutiliza título, autor y año, y añade el número de páginas
public class Libro extends Publicacion {

	// Constructor del libro:
	// title: título del libro
	// author: autor del libro
	// publishYear: año de publicación
	// pageNumber: número de páginas del libro
	public Libro(String title, String author, int publishYear, int pageNumber) {
		
		super(title, author, publishYear); // Llama al constructor de la clase base (Publicacion) para inicializar los datos comunes
		this.pageNumber = pageNumber;      // Inicializa el campo específico de Libro: número de páginas
	}

	// Atributo específico de Libro
	int pageNumber;

	// Muestra un resumen de la publicación:
	// - Primero llama al resumen de la clase base (título, autor, año)
	// - Luego añade el número de páginas propio de Libro
	public void resumen() {
		super.resumen(); // Imprime Título, Autor y Año
		System.out.printf("\nNumero de paginas: %d", this.pageNumber); // Imprime el número de páginas
	}
	
	// Getter del número de páginas
	public int getPageNumber() {
		return pageNumber;
	}

	// Setter del número de páginas
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
}
