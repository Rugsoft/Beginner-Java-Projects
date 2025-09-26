package criaturasFantasticas;

public class Criatura {

	private String nombre;
	private String especie;
	private int nivelEnergia;
	
	public Criatura(String nombre, String especie, int nivelEnergia) {
		
		this.nombre = nombre;
		this.especie = especie;
		this.nivelEnergia = nivelEnergia;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getNivelEnergia() {
		return nivelEnergia;
	}

	public void setNivelEnergia(int nivelEnergia) {
		this.nivelEnergia = nivelEnergia;
	}
	
	
}
