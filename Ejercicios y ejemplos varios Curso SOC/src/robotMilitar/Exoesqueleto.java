package robotMilitar;

public class Exoesqueleto {

	private String material;
	private double peso;
	private double precio;
	
	public Exoesqueleto(String material, double peso, double precio) {

		this.material = material;
		this.peso = peso;
		this.precio = precio;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
