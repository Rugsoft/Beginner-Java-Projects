package sobrecarga;

public class CalculadoraMagica {
	
	int num1;
	int num2;
	int num3;
	
	public CalculadoraMagica() {}
	
	public CalculadoraMagica(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

public void sumar(int a, int b) {
		
		int total = a + b;
		System.out.println("Total = "+total);
	}
	
	public void sumar(int a, int b, int c) {
		
		int total = a + b + c;
		System.out.println("Total = "+total);
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
}
