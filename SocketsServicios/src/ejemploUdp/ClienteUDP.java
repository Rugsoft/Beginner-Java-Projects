package ejemploUdp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteUDP {

	public static void main(String[] args) throws IOException {
		
        DatagramSocket socket = new DatagramSocket(); 
        String mensaje = "Hola servidor UDP"; 
        byte[] buffer = mensaje.getBytes(); 
 
        InetAddress destino = InetAddress.getByName("localhost"); 
        DatagramPacket paquete = new DatagramPacket(buffer, buffer.length, destino, 7000); 
        socket.send(paquete); 
        socket.close(); 

	}
}
