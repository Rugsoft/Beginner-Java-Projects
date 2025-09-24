package composicion;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("53636253T", "César", "Casas Insa");
		Vehiculo vehiculo1 = new Vehiculo("4565CPH", "Lambo", "Diabolo", "Negro", 450, true);
		
		VehiculoAlquilado alquiler1 = new VehiculoAlquilado(cliente1, vehiculo1, "17/09/25", 900, 2);
		
		alquiler1.mostrar();

	}

}
