package criaturasFantasticas;

public class CriaturaEspecial extends Criatura {

	private String habilidad;
	private String rareza;
	
	public CriaturaEspecial(String nombre, String especie, int nivelEnergia, String habilidad, String rareza) {
		
		super(nombre, especie, nivelEnergia);
		this.habilidad = habilidad;
		this.rareza = rareza;
	}

	
	
	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public String getRareza() {
		return rareza;
	}

	public void setRareza(String rareza) {
		this.rareza = rareza;
	}
	
	
}
