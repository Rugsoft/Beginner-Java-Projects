package sumaNumerosServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteMiServicio {
    public static void main(String[] args) {
        try {
            
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Conectado al servidor de suma.");

            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            salida.println("15");
            salida.println("20");

            String respuesta = entrada.readLine();
            System.out.println("Respuesta del servidor: " + respuesta);
          
            socket.close();
        } catch (IOException e) {
            System.out.println("Error en el cliente: " + e.getMessage());
        }
    }
}
