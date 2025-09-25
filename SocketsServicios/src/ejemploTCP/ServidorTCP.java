package ejemploTCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP { 
    public static void main(String[] args) { 
        try { 
            // Crear el socket del servidor en el puerto 7000 
            ServerSocket servidor = new ServerSocket(7000); 
            System.out.println("Servidor TCP escuchando en el puerto 7000..."); 
 
            // Esperar la conexión de un cliente 
            Socket cliente = servidor.accept(); 
            System.out.println("Cliente conectado desde " + cliente.getInetAddress()); 
 
            // Crear canales de entrada y salida 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream())); 
            PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true); 
 
            // Leer el mensaje del cliente 
            String mensaje = entrada.readLine(); 
            System.out.println("Mensaje recibido: " + mensaje); 
 
            // Enviar respuesta al cliente 
            salida.println("Hola cliente TCP, mensaje recibido correctamente."); 
 
            // Cerrar conexiones 
            cliente.close(); 
            servidor.close(); 
            
        } catch (IOException e) { 
            System.out.println("Error en el servidor: " + e.getMessage()); 
        } 
    } 
}
