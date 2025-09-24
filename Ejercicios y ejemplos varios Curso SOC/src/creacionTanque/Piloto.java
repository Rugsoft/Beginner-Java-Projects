package creacionTanque;

/**
 * Representa al piloto de un tanque.
 * Contiene su nombre, rango y salario.
 */
public class Piloto {
	
	/** Nombre del piloto */
	private String name;
	/** Rango militar del piloto (p. ej., Soldado, Sargento, General) */
	private String rank;
	/** Salario mensual del piloto en euros */
	private double salary;

	 // Crea un nuevo piloto con sus atributos principales.
	public Piloto(String name, String rank, double salary) {
		super();
		this.name = name;
		this.rank = rank;
		this.salary = salary;
	}

	/**
	 * Obtiene el nombre del piloto.
	 * @return nombre del piloto
	 */
	public String getName() {
		return name;
	}

	/**
	 * Establece el nombre del piloto.
	 * @param name nombre a asignar
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Obtiene el rango del piloto.
	 * @return rango del piloto
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * Establece el rango del piloto.
	 * @param rank rango a asignar
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}

	/**
	 * Obtiene el salario del piloto.
	 * @return salario del piloto
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Establece el salario del piloto.
	 * Considera validar que no sea negativo si aplica a la lógica del dominio.
	 * @param salary salario a asignar
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
