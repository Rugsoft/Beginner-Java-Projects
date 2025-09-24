package herencia;

public class Main {

	public static void main(String[] args) {
		
		Turismo turismo1 = new Turismo("13458KMM", "Ford", "Focus", "Azul", 300, true, 5, true);
		
		Deportivo deportivo1 = new Deportivo("4587NNM", "Ferrari", "Testarosa", "Rojo", 2500, false, 650);
		
		Furgoneta furgoneta1 = new Furgoneta("58794CPH", "Fiat", "Doblo", "Blanca", 550, true, 1000, 4500);
		
		System.out.println("Turismo: "+turismo1.getAtributos());
		System.out.println("Deportivo: "+deportivo1.getAtributos());
		System.out.println("Flagoneta: "+furgoneta1.getAtributos());
		

	}

}
