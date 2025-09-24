package FigurasGeometricas;

public class Rectangulo {
	
	double base;
	double altura;
	double area;
	double perimetro;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		this.area = 0;
		this.perimetro = 0;
	}
	
	public void calcularArea() {
		
		area = base * altura;
		System.out.println("EL area del rectangulo es: "+area);
	}
	
	public void calcularPerimetro() {
		
		perimetro = 2 * (base + altura);
		System.out.println("EL perimetro del rectangulo es: "+perimetro);
	}

}
