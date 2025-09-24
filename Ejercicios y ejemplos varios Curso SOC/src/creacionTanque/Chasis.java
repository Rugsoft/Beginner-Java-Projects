package creacionTanque;

/**
 * Representa el chasis de un tanque.
 * Contiene puntos de estructura (resistencia), el material del chasis y su precio.
 */
public class Chasis {
	
	// Puntos de estructura: indican la robustez o resistencia del chasis
	private int structurePoints;
	// Material del que está hecho el chasis (por ejemplo, acero, titanio, etc.)
	private String material;
	// Precio del chasis en la moneda definida por el contexto del proyecto
	private double price;

	public Chasis(int structurePoints, String material, double price) {
		this.structurePoints = structurePoints;
		this.material = material;
		this.price = price;
	}

	/**
	 * Obtiene los puntos de estructura del chasis.
	 */
	public int getStructurePoints() {
		return structurePoints;
	}

	/**
	 * Establece los puntos de estructura del chasis.
	 * Considera validar que no sea negativo si la lógica de negocio lo requiere.
	 */
	public void setStructurePoints(int structurePoints) {
		this.structurePoints = structurePoints;
	}

	/**
	 * Obtiene el material del chasis.
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * Establece el material del chasis.
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * Obtiene el precio del chasis.
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Establece el precio del chasis.
	 * Considera validar que no sea negativo si la lógica de negocio lo requiere.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
}
