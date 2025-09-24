package criaturasMutantes;

// Programa de demostración que crea criaturas y muestra/sobrescribe sus atributos
public class Main {

	public static void main(String[] args) {
		
		// Crea una criatura genérica (no voladora ni subterránea)
		Criatura Gnomo = new Criatura("David", "Gnomo", 2);
		
		// Crea una criatura voladora con velocidad de vuelo
		CriaturaVoladora Dragon = new CriaturaVoladora("Veratora", "Dragon", 9, 250);
		
		// Crea una criatura subterránea con profundidad máxima
		CriaturaSubterranea Enano = new CriaturaSubterranea("Gimli", "Enano", 5, 1500);
		
		// Muestra los atributos antes de cambios
		System.out.printf("Antes del cambio\n");
		Gnomo.showStats();
		Dragon.showStats();
		Enano.showStats();
		
		// Modifica algunos atributos usando setters
		Gnomo.setName("Gargamel");
		Dragon.setFlySpeed(325);
		Enano.setName("Gloin");
		Enano.setMaxDeep(2000);
		
		// Muestra los atributos después de las modificaciones
		System.out.printf("\nDespues de algunas modificaciones con SET\n");
		Gnomo.showStats();
		Dragon.showStats();
		Enano.showStats();

	}

}
