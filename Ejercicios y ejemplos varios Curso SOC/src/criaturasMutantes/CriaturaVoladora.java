package criaturasMutantes;

// Subclase de Criatura que añade la capacidad de volar (con velocidad)
public class CriaturaVoladora extends Criatura {
	
	// Constructor: recibe datos de la criatura base y la velocidad de vuelo
	public CriaturaVoladora(String name, String aDNType, int mutationLevel, int flySpeed) {
		
		super(name, aDNType, mutationLevel); // inicializa la parte de la clase base
		this.flySpeed = flySpeed;            // inicializa el nuevo atributo
	}

	// Atributo propio: velocidad de vuelo en km/h
	int flySpeed;

	// Sobrescribe showStats para mostrar además la velocidad de vuelo
	public void showStats() {
		
		super.showStats(); // imprime los datos básicos de la criatura
		System.out.printf("Velocidad de vuelo: %d km/h\n", this.flySpeed);
	}
	
	// Getter y setter para la velocidad de vuelo
	public int getFlySpeed() {
		return flySpeed;
	}

	public void setFlySpeed(int flySpeed) {
		this.flySpeed = flySpeed;
	}
}
