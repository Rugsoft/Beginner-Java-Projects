package vehiculosConcesionario;

public class Vehiculo {

	private String marca;
	private String modelo;
	private Motor motor;
	private Chasis chasis;
	
	public Vehiculo(String marca, String modelo, Motor motor, Chasis chasis) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.chasis = chasis;
	}
	
	public String toString() {
		
		String outputData = "Marca: " +this.getMarca()+ " Modelo: " +this.getModelo()+ 
				" Tipo Motor: " +motor.getTipoMotor() + " Cilindrada: " +motor.getCilindrada()+ 
				" Color Chasis: " +chasis.getColor()+ " Material Chasis: " +chasis.getMaterial();
		return outputData;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Chasis getChasis() {
		return chasis;
	}

	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}
	
	
}
