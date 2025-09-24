package criaturasMutantes;

// Subclase de Criatura que añade una característica subterránea (profundidad máxima)
public class CriaturaSubterranea extends Criatura {
	
	// Constructor: recibe datos base y la profundidad máxima alcanzable
	public CriaturaSubterranea(String name, String aDNType, int mutationLevel, int maxDeep) {
		
		super(name, aDNType, mutationLevel); // inicializa la parte heredada
		this.maxDeep = maxDeep;              // asigna el nuevo atributo
	}

	// Atributo propio: profundidad máxima en metros
	int maxDeep;

	// Sobrescribe showStats para incluir la profundidad máxima
	public void showStats() {
		
		super.showStats(); // imprime los datos de la clase base
		System.out.printf("Profundidad Máxima: %d m\n", this.maxDeep);
	}
	
	// Getter y setter para la profundidad máxima
	public int getMaxDeep() {
		return maxDeep;
	}

	public void setMaxDeep(int maxDeep) {
		this.maxDeep = maxDeep;
	}
}
