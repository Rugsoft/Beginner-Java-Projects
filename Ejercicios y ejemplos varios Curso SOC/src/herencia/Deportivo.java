package herencia;

public class Deportivo extends Vehiculo {

	public Deportivo(String matricula, 
			String marca, 
			String modelo, 
			String color, 
			double tarifa, 
			boolean disponible,
			int cilindrada) {
		super(matricula, marca, modelo, color, tarifa, disponible);
		this.cilindrada = cilindrada;
	}

	private int cilindrada;
	
	public int getCilindrada() { 
		return this. cilindrada; 
	} 
		 
	public String getAtributos() { 
		return super.getAtributos() + " Cilindrada (cm3): " + this.cilindrada; 
	}
}
