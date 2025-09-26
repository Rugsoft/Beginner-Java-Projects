package fabricaRobots;

public class Robot {
	
	private String modelo;
	private String fabricante;
	private String pais;
	private Exoesqueleto exo;
	private Armamento arma;
	
	public Robot(String modelo, String fabricante, String pais, Exoesqueleto exo, Armamento arma) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.pais = pais;
		this.exo = exo;
		this.arma = arma;
	}

	public String datosRobot() {
		
		String cadena = "Modelo: " + this.getModelo() + 
						" Fabricante: " + this.getFabricante() +
						" Pais: " + this.getPais() + 
						" Tipo armamento: " + arma.getTipo() +
						" Sistema guiado: " + arma.isSguiado() +
						" Municion: " + arma.getMunicion() +
						" Material Exo: " + exo.getMaterial() +
						" Peso Exo: " + exo.getPeso() +
						" Tipo de movilidad: " + exo.getMovilidad();
		return cadena;
	}
	
	public Exoesqueleto getExo() {
		return exo;
	}


	public void setExo(Exoesqueleto exo) {
		this.exo = exo;
	}


	public Armamento getArma() {
		return arma;
	}


	public void setArma(Armamento arma) {
		this.arma = arma;
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
