package ejemploGET_SET;

public class Evaluar {
		
	public Evaluar(Alumno alumno, String fecha) {
		this.alumno = alumno;
		this.fecha = fecha;
	}
	
	Alumno alumno;
	String fecha;
	
	public void mostrarAlumno() {
		
		alumno.mostrar();
	}
	
	public void evaluar() {
		
		double nota = alumno.getNota();
		if (nota >= 5) {
			System.out.println("Aprovado weon");
		} else {
			System.out.println("No has aprovado huevonasi");
		}
	}
	
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
		
}
