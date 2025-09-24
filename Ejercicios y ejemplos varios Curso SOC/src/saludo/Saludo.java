package saludo;

public class Saludo {
	
	public Saludo(String saludo, String nombre) {
		this.saludo = saludo;
		this.nombre = nombre;
	}
	
	String saludo;
	String nombre;
	
	public void saludar() {
		
		System.out.println(saludo+" "+nombre);
	}
	
}
