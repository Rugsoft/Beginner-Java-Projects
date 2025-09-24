package conceptosBasicos;

public class Vehiculo {
	
	public Vehiculo(String matricula, String marca, String color, double tarifa) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
		this.tarifa = tarifa;
	}
	String matricula;
	String marca;
	String color;
	double tarifa;
	
	public void mostrar() {
		
		System.out.println("Matricula: "+matricula+" Marca: "+marca+" Color: "+color+" Tarifa: "+tarifa);
	}
}