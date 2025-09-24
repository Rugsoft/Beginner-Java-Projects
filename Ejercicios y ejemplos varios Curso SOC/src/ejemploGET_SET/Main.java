package ejemploGET_SET;

public class Main {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("César", 9.5, "615916625");
		Evaluar evaluar = new Evaluar(alumno1, "15/09/2025");
		
		evaluar.mostrarAlumno();
		evaluar.evaluar();
	}

}
