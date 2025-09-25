package servicioHora;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class ServidorHora {
	 public static void main(String[] args) {
		 try {
			 ServerSocket servidor = new ServerSocket(6000);
			 System.out.println("Servidor de hora activo en el puerto 6000...");
			 
			 while (true) {
				 Socket cliente = servidor.accept();
				 PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);
				 String hora = LocalTime.now().toString();
				 salida.println("Hora actual: " + hora);
				 cliente.close();
			 }
		 } catch (IOException e) {
			 System.out.println("Error en el servidor: " + e.getMessage());
		 	}
	 }
}
