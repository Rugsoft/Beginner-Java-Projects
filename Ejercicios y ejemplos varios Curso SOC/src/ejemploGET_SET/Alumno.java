package ejemploGET_SET;

public class Alumno {
	
	public Alumno(String nombre, double nota, String telefono) {
		this.nombre = nombre;
		this.nota = nota;
		this.telefono = telefono;
	}
	
	String nombre;
	double nota;
	String telefono;

	public void mostrar() {
		
		System.out.printf("El alumno es: %s, tiene una nota de: %.2f y un telefono de contacto: %s\n", this.nombre, this.nota, this.telefono);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
