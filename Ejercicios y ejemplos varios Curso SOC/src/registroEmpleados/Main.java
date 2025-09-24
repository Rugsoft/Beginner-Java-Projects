package registroEmpleados; // Paquete donde reside la aplicación

public class Main { // Clase principal que contiene el punto de entrada

    public static void main(String[] args) { // Método main: punto de entrada de la aplicación

        // Creación de tres empleados con su nombre, salario y área/departamento
        Empleado Cesar = new Empleado("César", 2500, "Soporte");
        Empleado Gerson = new Empleado("Gerson", 1500, "Ciberseguridad");
        Empleado Oliver = new Empleado("Oliver", 2150, "Dragon ball");

        // Se agrupan los empleados en un arreglo para representar el equipo del gerente
        Empleado[] listaEquipo = {Cesar, Gerson, Oliver};

        // Creación de un gerente con nombre, salario, cargo/área y el equipo a su cargo
        Gerente Albert = new Gerente("Albert", 3500, "Profesor", listaEquipo);

        // Impresión formateada de la información de los empleados
        System.out.println("Informacion de empleados:");
        System.out.println("-------------------------");
        Cesar.showInfo();   // Muestra la información del empleado César
        System.out.println("-------------------------");
        Gerson.showInfo();  // Muestra la información del empleado Gerson
        System.out.println("-------------------------");
        Oliver.showInfo();  // Muestra la información del empleado Oliver
        System.out.println("-------------------------");

        // Impresión de la información del gerente, que probablemente incluya su equipo
        System.out.println("Informacion de Gerente:");
        System.out.println("----------------------");
        Albert.showInfo();  // Muestra la información del gerente Albert, incluyendo su equipo

    }

}

