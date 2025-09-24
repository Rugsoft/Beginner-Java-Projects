package bibliotecaDigital;

public class Main {

	public static void main(String[] args) {
		
		Publicacion folleto = new Publicacion("Como programar con Java", "Albert LLauradó", 2023);
		Libro libro1 = new Libro("Dune", "Frank Herbert", 1965, 784);        // añade número de páginas
		Revista revista1 = new Revista("F1UM", "Victor Abad", 2025, 2);      // añade número de edición
		
		// Bloque de impresión para el folleto
		System.out.printf("-------------");     // separador visual
		System.out.printf("\nFolleto\n");       // encabezado de sección
		System.out.printf("-------------");     // separador visual
		folleto.resumen();                       // muestra título, autor y año
		
		// Bloque de impresión para el libro
		System.out.printf("\n-------------");   // separador visual
		System.out.printf("\nLibro\n");         // encabezado de sección
		System.out.printf("-------------");     // separador visual
		libro1.resumen();                        // muestra datos base + número de páginas
		
		// Bloque de impresión para la revista
		System.out.printf("\n-------------");   // separador visual
		System.out.printf("\nRevista\n");       // encabezado de sección
		System.out.printf("-------------");     // separador visual
		revista1.resumen();                      // muestra datos base + número de edición

	}

}
