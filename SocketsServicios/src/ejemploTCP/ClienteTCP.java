package ejemploTCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteTCP { 
    public static void main(String[] args) { 
        try { 
            // Conectarse al servidor en localhost y puerto 7000 
            Socket socket = new Socket("localhost", 7000); 
            System.out.println("Conectado al servidor TCP."); 
 
            // Crear canales de entrada y salida 
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true); 
 
            // Enviar mensaje al servidor 
            salida.println("Hola servidor TCP, soy el cliente."); 
 
            // Leer respuesta del servidor 
            String respuesta = entrada.readLine();
            System.out.println("Respuesta del servidor: " + respuesta); 
            
            // Cerrar conexión 
            socket.close(); 
            
        } catch (IOException e) { 
            System.out.println("Error en el cliente: " + e.getMessage()); 
        } 
    } 
} 