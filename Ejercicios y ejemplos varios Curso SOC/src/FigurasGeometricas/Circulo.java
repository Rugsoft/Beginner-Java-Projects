package FigurasGeometricas;

public class Circulo {
	double radio;
	double area;
	double perimetro;

	public Circulo(double radio) {
		this.radio = radio;
		this.area = 0;
		this.perimetro = 0;
	}
	public static final double PI = 3.14159;
	
	public void calcularArea() {
		
		area = PI * (Math.pow(radio, 2));
		System.out.println("El area del circulo es: "+area);
	}
	
	public void calcularPerimetro() {
		
		perimetro = 2 * PI * radio;
		System.out.println("El perimetro del circulo es: "+perimetro);
	}

}
