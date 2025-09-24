package robotMilitar;

public class Armamento {

	private String tipo;
	private boolean sguiado;
	private double precio;
	
	public Armamento(String tipo, boolean sguiado, double precio) {
		this.tipo = tipo;
		this.sguiado = sguiado;
		this.precio = precio;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
