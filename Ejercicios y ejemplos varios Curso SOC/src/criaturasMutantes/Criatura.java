package criaturasMutantes;

// Clase base que representa una criatura genérica con nombre, tipo de ADN y nivel de mutación
public class Criatura {
	
	// Constructor: inicializa los campos obligatorios al crear una criatura
	public Criatura(String name, String aDNType, int mutationLevel) {

		this.name = name;             // nombre de la criatura
		this.aDNType = aDNType;       // tipo de ADN (raza/especie)
		this.mutationLevel = mutationLevel; // nivel de mutación (entero)
	}
	
	// Campos (atributos) de la clase
	String name;
	String aDNType;
	int mutationLevel;
	
	// Muestra por consola los datos básicos de la criatura
	public void showStats() {
		
		System.out.printf("\nNombre: %s\nADN: %s\nNivel de mutación: %d\n", this.name, this.aDNType, this.mutationLevel);
	}
	
	// Getters y setters para acceder/modificar los atributos de forma controlada
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getaDNType() {
		return aDNType;
	}
	public void setaDNType(String aDNType) {
		this.aDNType = aDNType;
	}
	public int getMutationLevel() {
		return mutationLevel;
	}
	public void setMutationLevel(int mutationLevel) {
		this.mutationLevel = mutationLevel;
	}
	
}
