package registroEmpleados; // Paquete donde se agrupa la clase Empleado

public class Empleado {
	
	// Constructor: inicializa un Empleado con nombre, salario y departamento
	public Empleado(String name, double salary, String department) {
		
		this.name = name;           // Asigna el nombre recibido al campo de instancia
		this.salary = salary;       // Asigna el salario recibido al campo de instancia
		this.department = department; // Asigna el departamento recibido al campo de instancia
	}
	
	// Campos (atributos) del empleado
	String name;        // Nombre del empleado
	double salary;      // Salario del empleado
	String department;  // Departamento al que pertenece
	
	// Método de instancia que muestra la información formateada del empleado
	public void showInfo() {
		
		System.out.printf("Nombre: %s\nSalario: %.2f\nDepartamento: %s\n", this.name, this.salary, this.department);
	}
	
	// Getter del nombre: devuelve el nombre actual
	public String getName() {
		return name;
	}
	// Setter del nombre: actualiza el nombre
	public void setName(String name) {
		this.name = name;
	}
	// Getter del salario: devuelve el salario actual
	public double getSalary() {
		return salary;
	}
	// Setter del salario: actualiza el salario
	public void setSalary(double salary) {
		this.salary = salary;
	}
	// Getter del departamento: devuelve el departamento actual
	public String getDepartment() {
		return department;
	}
	// Setter del departamento: actualiza el departamento
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
