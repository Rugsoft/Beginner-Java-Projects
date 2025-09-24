package robotMilitar;

public class InteligenciaA {

	private double version;
	private String modelo;
	private double precio;
	
	public InteligenciaA(double version, String modelo, double precio) {
		
		this.version = version;
		this.modelo = modelo;
		this.precio = precio;
	}

	
	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
