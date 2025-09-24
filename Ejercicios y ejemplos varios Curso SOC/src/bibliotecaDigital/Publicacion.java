package bibliotecaDigital; // Paquete al que pertenece la clase

public class Publicacion { // Clase base que representa una publicación genérica (título, autor y año)

// Constructor que inicializa los campos de la publicación
// title: título de la obra
// author: autor/a de la obra
// publishYear: año de publicación
	public Publicacion(String title, String author, int publishYear) {
	
		this.title = title;           // Asigna el título recibido al campo de instancia
		this.author = author;         // Asigna el autor recibido al campo de instancia
		this.publishYear = publishYear; // Asigna el año de publicación al campo de instancia
	}
	
	// Campos que describen una publicación
	String title;        // Título de la publicación
	String author;       // Autor/a de la publicación
	int publishYear;     // Año en que se publicó
	
	// Muestra un resumen por consola con los datos de la publicación
	public void resumen() {
		
		// Imprime en formato legible: Título, Autor y Año de publicación
		// %s para cadenas y %d para enteros. Incluye saltos de línea para formateo.
		System.out.printf("\nTitulo: %s\nAutor: %s\nAño de publicación: %d", this.title, this.author, this.publishYear);
	}
	
	// Getter y Setter del título
	public String getTitle() {
		return title; // Devuelve el título actual
	}
	public void setTitle(String title) {
		this.title = title; // Actualiza el título
	}
	
	// Getter y Setter del autor
	public String getAuthor() {
		return author; // Devuelve el autor actual
	}
	public void setAuthor(String author) {
		this.author = author; // Actualiza el autor
	}
	
	// Getter y Setter del año de publicación
	public int getPublishYear() {
		return publishYear; // Devuelve el año de publicación actual
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear; // Actualiza el año de publicación
	}
	
}
