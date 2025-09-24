package conceptosBasicos;

public class Main {

	public static void main(String[] args) {
		Vehiculo vehiculo1 = new Vehiculo("1234BCN","Renault","Azul",12000.25);
		Vehiculo vehiculo2 = new Vehiculo("5678POE","Kia","Amarillo", 4500.5);
		
		vehiculo1.mostrar();
		vehiculo2.mostrar();
	}

}
