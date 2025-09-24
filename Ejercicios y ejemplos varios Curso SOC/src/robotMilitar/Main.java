package robotMilitar;

import javax.swing.JOptionPane;

// Clase principal que contiene el método `main`.
public class Main {

	public static void main(String[] args) {
		
		// Define el presupuesto máximo para el robot.
		double limitePresupuesto = 15000000;
		
		// Se crean instancias de los componentes (Exoesqueleto, Armamento, InteligenciaA).
		// Estos objetos se usarán para construir los robots.
		Exoesqueleto exo = new Exoesqueleto("Vibranium", 1250, 1500000);
		Armamento arma = new Armamento("Gatling", true, 250000);
		InteligenciaA IA = new InteligenciaA(4.5, "Grapler", 2500000);
		
		// Muestra un mensaje de bienvenida al usuario.
		JOptionPane.showMessageDialog(
				null,
				"Bienvenido al creador de Robots", 
				"Información",
				JOptionPane.INFORMATION_MESSAGE
		);
		
		// Pide al usuario que elija el tipo de robot.
		String tipoRobot = JOptionPane.showInputDialog("Eliga que robot quiere crear, pulse 1 para Marino o 2 para Asalto: ");
		
		// Condición para manejar la elección del usuario.
		if (tipoRobot.equals("1")) {
			
			// Si eligen "1", se crea un Robot Marino.
			
			// Se pide la profundidad y se convierte a entero.
			String stringProfundidad = JOptionPane.showInputDialog("Eliga la profundidad de su robot marino:");
			int profundidad = Integer.parseInt(stringProfundidad);
			
			// Se crea una nueva instancia de `RobotMarino` con los datos proporcionados.
			RobotMarino AquaRobot = new RobotMarino("Aquarius", "TexasInstruments", "Ejpaña", profundidad, exo, arma, IA);
			
			// Se verifica si el costo total del robot no excede el límite de presupuesto.
			if(AquaRobot.calculo() <= limitePresupuesto ) {
				
				// Si está dentro del presupuesto, se muestra la información del robot.
				AquaRobot.mostrar();
			} else {
				
				// Si excede el presupuesto, se muestra un mensaje de error.
				JOptionPane.showMessageDialog(
						null,
						"El presupuesto exede los límites", 
						"ERROR",
						JOptionPane.ERROR_MESSAGE
				);
			}
			
		} else {
		
			// Si eligen "2", se crea un Robot de Asalto.
			
			// Se pide la durabilidad.
			String durabilidad = JOptionPane.showInputDialog("Eliga la durabilidad de su robot de asalto:");
			
			// Se crea una nueva instancia de `RobotAsalto`.
			RobotAsalto Durandal = new RobotAsalto("Prismatico", "Pioneer Tecnologies", "Japon", durabilidad, exo, arma, IA);
			
			// Se verifica si el costo total del robot no excede el límite de presupuesto.
			if(Durandal.calculo() <= limitePresupuesto ) {
				
				// Si está dentro del presupuesto, se muestra la información del robot.
				Durandal.mostrar();
			} else {
				
				// Si excede el presupuesto, se muestra un mensaje de error.
				JOptionPane.showMessageDialog(
						null,
						"El presupuesto exede los límites", 
						"ERROR",
						JOptionPane.ERROR_MESSAGE
				);
			}
		}
			
		
		
	}
}
