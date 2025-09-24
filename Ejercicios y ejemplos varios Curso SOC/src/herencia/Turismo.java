package herencia;

public class Turismo extends Vehiculo {
	
	public Turismo(String matricula, 
			String marca, 
			String modelo, 
			String color, 
			double tarifa, 
			boolean disponible,
			int puertas,
			boolean marchaAutomatica) {
		super(matricula, marca, modelo, color, tarifa, disponible);
		this.puertas = puertas;
		this.marchaAutomatica = marchaAutomatica;
	}
	
	private int puertas;
	private boolean marchaAutomatica;
	
	public int getPuertas() { 
		return this.puertas; 
	} 
		 
	public boolean getMarchaAutomatica() { 
		return this.marchaAutomatica; 
	} 
		 
	public String getAtributos() { 
		return super.getAtributos() + " Puertas: " + this.puertas + " Marcha automática: " + this.marchaAutomatica; 
	}

}
