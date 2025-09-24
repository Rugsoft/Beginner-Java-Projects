package creacionTanque;

import javax.swing.JOptionPane;

/**
 * Representa un Tanque compuesto por un Piloto y un Chasis.
 * Además, incluye datos de identificación como número de serie y fecha de fabricación.
 * Ofrece un método para mostrar la información del tanque en una ventana de diálogo.
 */
public class Tanque {
	
	/** Piloto asignado al tanque */
	private Piloto piloto;
	/** Chasis que compone el tanque */
	private Chasis chasis;
	/** Número de serie del tanque (identificador) */
	private int serialNumber;
	/** Fecha de fabricación del tanque en formato de texto (p. ej., "dd/MM/yy") */
	private String madeDate;
	
	/*
	 * Crea un nuevo Tanque.
	 */
	public Tanque(Piloto piloto, Chasis chasis, int serialNumber, String madeDate) {
		super();
		this.piloto = piloto;
		this.chasis = chasis;
		this.serialNumber = serialNumber;
		this.madeDate = madeDate;
	}

	/**
	 * Muestra la información del tanque en una ventana de diálogo (JOptionPane).
	 * Calcula el coste total sumando el precio del chasis y el salario del piloto.
	 * Nota: el "total" aquí mezcla conceptos (precio del chasis + salario mensual). 
	 * Dependiendo del dominio, podría requerir un tratamiento contable más preciso.
	 */
	public void mostrar() {
		// Cálculo simple del coste total
		double total = chasis.getPrice() + piloto.getSalary();

		// Construcción del mensaje con saltos de línea para legibilidad
		JOptionPane.showMessageDialog(
				null,
				"Nombre piloto: " + piloto.getName() +
				"\nRango: " + piloto.getRank() +
				"\nSueldo: " + piloto.getSalary() + " €" +
				"\nPuntos de estructura: " + chasis.getStructurePoints() +
				"\nMaterial: " + chasis.getMaterial() +
				"\nPrecio: " + chasis.getPrice() + " €" +
				"\nNumero de serie: " + this.getSerialNumber() +
				"\nFecha de creación: " + this.getMadeDate() +
				"\nTotal gasto del tanque: " + total + " €", 
				"Información",
				JOptionPane.INFORMATION_MESSAGE
		);
	}
	
	/** Obtiene el piloto asignado. */
	public Piloto getPiloto() {
		return piloto;
	}

	/** Asigna un piloto al tanque. */
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	/** Obtiene el chasis del tanque. */
	public Chasis getChasis() {
		return chasis;
	}

	/** Asigna el chasis del tanque. */
	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}

	/** Obtiene el número de serie. */
	public int getSerialNumber() {
		return serialNumber;
	}

	/** Establece el número de serie. */
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	/** Obtiene la fecha de fabricación. */
	public String getMadeDate() {
		return madeDate;
	}

	/** Establece la fecha de fabricación. */
	public void setMadeDate(String madeDate) {
		this.madeDate = madeDate;
	}
	
}
