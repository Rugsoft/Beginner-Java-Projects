package registroEmpleados; // Paquete donde se agrupa la clase Gerente

// Gerente hereda de Empleado, por lo que tiene nombre, salario y departamento
public class Gerente extends Empleado {

    // Campo que almacena el equipo a cargo del gerente (arreglo de Empleado)
    Empleado[] team;

    // Constructor de Gerente:
    // name: nombre del gerente
    // salary: salario del gerente
    // department: departamento al que pertenece
    // team: listado de empleados a su cargo
    public Gerente(String name, double salary, String department, Empleado[] team) {
        // Llama al constructor de la clase base (Empleado) para inicializar los campos comunes
        super(name, salary, department);
        // Asigna el equipo recibido al campo de instancia
        this.team = team;
    }

    // Muestra por consola la información del gerente y de su equipo
    public void showInfo() {
        // Reutiliza la lógica de la clase base para imprimir nombre, salario y departamento
        super.showInfo();
        System.out.println("Equipo: ");
        // Recorre el arreglo de empleados e imprime el nombre de cada miembro del equipo
        for (Empleado emp : team) {
            System.out.println("- " + emp.getName());
        }
    }

    // Getter del equipo: devuelve el arreglo completo de empleados
    public Empleado[] getTeam() {
        return team;
    }

    // Setter del equipo: permite actualizar el arreglo de empleados a cargo
    public void setTeam(Empleado[] team) {
        this.team = team;
    }

}

