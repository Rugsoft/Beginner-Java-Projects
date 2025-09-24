package vehiculosConcesionario;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vehiculo> coches = new ArrayList<Vehiculo>();
        EscribirFichero eF = new EscribirFichero();

        JOptionPane.showMessageDialog(
                null,
                "Bienvenido al creador de vehiculos 2000!",
                "Información",
                JOptionPane.INFORMATION_MESSAGE
        );
        String cuantos = JOptionPane.showInputDialog("Cuantos vehiculos quiere crear?: ");
        int cuantosInt = Integer.parseInt(cuantos);

        for (int i = 0; i < cuantosInt; i++) {
            
            String marca = JOptionPane.showInputDialog("Introduce la marca del coche: ");
            String modelo = JOptionPane.showInputDialog("Introduce el modelo del coche: ");
            String tipoMotor = JOptionPane.showInputDialog("Introduce el tipo de motor del coche: ");
            int cilindrada = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cilindrada del motor: "));
            String color = JOptionPane.showInputDialog("Introduce el color del chasis: ");
            String material = JOptionPane.showInputDialog("Introduce el material del chasis: ");

            Motor motor = new Motor(tipoMotor, cilindrada);
            Chasis chasis = new Chasis(color, material);
            Vehiculo vehiculo = new Vehiculo(marca, modelo, motor, chasis);

            coches.add(vehiculo);
            eF.pasarAFichero(vehiculo.toString());

            JOptionPane.showMessageDialog(
                    null,
                    "Vehiculo " + (i + 1) + " creado!",
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        

    }

}
