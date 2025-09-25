package ejemploUdp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.io.IOException;
 
public class ServidorUDP {
    public static void main(String[] args) throws IOException {
        // Crea el socket en el puerto 7000
        DatagramSocket socket = new DatagramSocket(7000);
        System.out.println("Servidor UDP escuchando en el puerto 7000...");
 
        // Prepara el buffer para recibir datos
        byte[] buffer = new byte[1024];
 
        // Espera la llegada de un paquete
        DatagramPacket paquete = new DatagramPacket(buffer, buffer.length);
        socket.receive(paquete);
 
        // Extrae el mensaje recibido
        String mensaje = new String(paquete.getData(), 0, paquete.getLength());
        System.out.println("Mensaje recibido: " + mensaje);
 
        // Cierra el socket
        socket.close();
        System.out.println("Servidor cerrado.");
    }
}