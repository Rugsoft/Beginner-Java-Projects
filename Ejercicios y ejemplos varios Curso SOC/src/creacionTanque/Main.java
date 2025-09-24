package creacionTanque;

public class Main {

	public static void main(String[] args) {
		// Se crea un Piloto con nombre, rango y salario
		Piloto piloto1 = new Piloto("Albert Llauradó", "General", 2500);

		// Se crea un Chasis con puntos de estructura, material y precio
		Chasis chasis1 = new Chasis(235, "Obsidiana", 35000);

		// Se crea un Tanque compuesto por un Piloto y un Chasis,
		// además de un número de serie y fecha de fabricación
		Tanque panzer = new Tanque(piloto1, chasis1, 69694578, "17/09/25");

		// Se muestran los datos del tanque y el coste total (salario + precio chasis) en un JOptionPane
		panzer.mostrar();
	}

}
