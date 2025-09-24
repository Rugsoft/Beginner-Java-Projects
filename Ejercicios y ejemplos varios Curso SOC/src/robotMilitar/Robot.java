package robotMilitar;

public class Robot {
	
	private String modelo;
	private String fabricante;
	private String pais;
	
	public Robot(String modelo, String fabricante, String pais) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.pais = pais;
	}

	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
	
}
