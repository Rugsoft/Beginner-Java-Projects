package composicion;

import javax.swing.JOptionPane;

public class Cliente {  
 
	public Cliente(String nif, String nombre, String apellidos) { 
		this.nif = nif; 
		this.nombre = nombre; 
		this.apellidos = apellidos; 
	}
	
	private String nif; 
	private String nombre; 
	private String apellidos;
	
	public void mostrar() {
		JOptionPane.showMessageDialog(null, 
				"NIF: " + this.getNif() +
				" Nombre: " + this.getNombre() +
				" Apellidos: " + this.getApellidos(), 
				"Información", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
} 