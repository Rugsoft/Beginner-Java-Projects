package agendaRara;

public class Cliente {
	
	private String nombre;
	private String dni;
	private String poblacion;
	private boolean vip;
	private boolean terminos;
	
	public Cliente(String nombre, String dni, String poblacion, boolean vip, boolean terminos) {
		this.nombre = nombre;
		this.dni = dni;
		this.poblacion = poblacion;
		this.vip = vip;
		this.terminos = terminos;
	}
	
	public String show() {
		
		String cadena = this.getNombre() + " " + this.getDni() + " " + this.getPoblacion() + " " + this.isVip() + " " + this.isTerminos() + "\n";
		return cadena;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public boolean isTerminos() {
		return terminos;
	}

	public void setTerminos(boolean terminos) {
		this.terminos = terminos;
	}
	
	
	
	
	
}
