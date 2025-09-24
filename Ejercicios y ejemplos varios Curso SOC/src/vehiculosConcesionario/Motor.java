package vehiculosConcesionario;

public class Motor {

	private String tipoMotor;
	private int cilindrada;
	
	public Motor(String tipoMotor, int cilindrada) {
		this.tipoMotor = tipoMotor;
		this.cilindrada = cilindrada;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
}
