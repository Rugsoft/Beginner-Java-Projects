package robotMilitar;

import javax.swing.JOptionPane;

public class RobotMarino extends Robot {

	private int profundidad;
	private Exoesqueleto exoesqueleto;
	private Armamento armamento;
	private InteligenciaA iA;
	
	public RobotMarino(String modelo, String fabricante, String pais, int profundidad, Exoesqueleto exoesqueleto,
			Armamento armamento, InteligenciaA iA) {
		
		super(modelo, fabricante, pais);
		this.profundidad = profundidad;
		this.exoesqueleto = exoesqueleto;
		this.armamento = armamento;
		this.iA = iA;
	}
	
	public void mostrar() {

		JOptionPane.showMessageDialog(
				null,
				"Modelo: " + super.getModelo() +
				"\nFabricante: " + super.getFabricante() +
				"\nPais: " + super.getPais() +
				"\nProfundidad: " + this.getProfundidad() + " m" +
				"\nMaterial Exoesqueleto: " + exoesqueleto.getMaterial() +
				"\nPeso Exoesqueleto: " + exoesqueleto.getPeso() + " Kg" +
				"\nPrecio Exoesqueleto: " + exoesqueleto.getPrecio() + " €" +
				"\nTipo de armamento: " + armamento.getTipo() +
				"\nSistema de guiado: " + armamento.isSguiado() + 
				"\nPrecio armamento: " + armamento.getPrecio() +
				"\nVersion IA: " + iA.getVersion() +
				"\nModelo IA: " + iA.getModelo() +
				"\nPrecio IA: "+ iA.getPrecio(), 
				"Información",
				JOptionPane.INFORMATION_MESSAGE
		);
	}
	
	public double calculo() {
		
		double total = exoesqueleto.getPrecio() + armamento.getPrecio() + iA.getPrecio();
		return total;
	}
	
	public int getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}

	public Exoesqueleto getExoesqueleto() {
		return exoesqueleto;
	}

	public void setExoesqueleto(Exoesqueleto exoesqueleto) {
		this.exoesqueleto = exoesqueleto;
	}

	public Armamento getArmamento() {
		return armamento;
	}

	public void setArmamento(Armamento armamento) {
		this.armamento = armamento;
	}

	public InteligenciaA getiA() {
		return iA;
	}

	public void setiA(InteligenciaA iA) {
		this.iA = iA;
	}

	
}
