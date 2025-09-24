package composicion;

import javax.swing.JOptionPane;

public class VehiculoAlquilado {
	
	public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, String fechaAlquiler, double precio,
			int diasAlquiler) {
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.fechaAlquiler = fechaAlquiler;
		this.precio = precio;
		this.diasAlquiler = diasAlquiler;
	}
	
	private Cliente cliente;
	private Vehiculo vehiculo;
	private String fechaAlquiler;
	private double precio;
	private int diasAlquiler;
	
	public void mostrar() {
		JOptionPane.showMessageDialog(null,
				"NIF: " + cliente.getNif() +
				" Nombre: " + cliente.getNombre() +
				" Apellidos: " + cliente.getApellidos() +
				" Matricula: " + vehiculo.getMatricula() +
				" Marca: " + vehiculo.getMarca() +
				" Modelo: " + vehiculo.getModelo() +
				" Color: " + vehiculo.getColor() +
				" Tarifa: " + vehiculo.getTarifa() +
				" Disponibilidad: " + vehiculo.isDisponible() +
				" Fecha Alquiler: " + this.getFechaAlquiler() +
				" Precio: " + this.getPrecio() +
				" Dias: " + this.getDiasAlquiler(), 
				"Información", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public String getFechaAlquiler() {
		return fechaAlquiler;
	}
	public void setFechaAlquiler(String fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDiasAlquiler() {
		return diasAlquiler;
	}
	public void setDiasAlquiler(int diasAlquiler) {
		this.diasAlquiler = diasAlquiler;
	}
	
	
	
}
