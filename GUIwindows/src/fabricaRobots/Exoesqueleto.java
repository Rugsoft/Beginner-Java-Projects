package fabricaRobots;

public class Exoesqueleto {

	private String material;
	private double peso;
	private String movilidad;
	
	public Exoesqueleto(String material, double peso, String movilidad) {

		this.material = material;
		this.peso = peso;
		this.movilidad = movilidad;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getMovilidad() {
		return movilidad;
	}

	public void setMovilidad(String movilidad) {
		this.movilidad = movilidad;
	}
	
	
	
}
