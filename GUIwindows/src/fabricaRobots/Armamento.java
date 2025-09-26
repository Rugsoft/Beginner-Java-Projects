package fabricaRobots;

public class Armamento {

	private String tipo;
	private boolean sguiado;
	private int municion;
	
	public Armamento(String tipo, boolean sguiado, int municion) {
		this.tipo = tipo;
		this.sguiado = sguiado;
		this.municion = municion;
	}

	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isSguiado() {
		return sguiado;
	}

	public void setSguiado(boolean sguiado) {
		this.sguiado = sguiado;
	}

	public int getMunicion() {
		return municion;
	}

	public void setMunicion(int municion) {
		this.municion = municion;
	}
	
	
}
