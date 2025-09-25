package servicioHora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClienteHora {
	 public static void main(String[] args) {
		 try {
			 Socket socket = new Socket("localhost", 6000);
			 BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 String hora = entrada.readLine();
			 System.out.println("Hora recibida del servidor: " + hora);
			 socket.close();
		 } catch (IOException e) {
			 System.out.println("Error en el cliente: " + e.getMessage());
		 }
	 }
}
