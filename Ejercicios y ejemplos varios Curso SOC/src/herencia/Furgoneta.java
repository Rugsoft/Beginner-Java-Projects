package herencia;

public class Furgoneta extends Vehiculo {
	
	public Furgoneta(String matricula, 
			String marca, 
			String modelo, 
			String color, 
			double tarifa, 
			boolean disponible,
			int carga, 
			int volumen) {
		super(matricula, marca, modelo, color, tarifa, disponible);
		this.carga = carga;
		this.volumen = volumen;
	}
	
	private int carga; 
	private int volumen; 
	
	public int getCarga() { 
		return this.carga; 
	} 
		 
	public int getVolumen() { 
		return this.volumen; 
	} 
		 
	public String getAtributos() { 
		return super.getAtributos() + " Carga (kg): " + this.carga + " Volumen (m3): " + this.volumen; 
	}

}
