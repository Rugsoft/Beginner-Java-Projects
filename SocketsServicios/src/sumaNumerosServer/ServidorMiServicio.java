package sumaNumerosServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorMiServicio {
    public static void main(String[] args) {
        try {
            
            ServerSocket servidor = new ServerSocket(5000);
            System.out.println("Servidor de suma escuchando en el puerto 5000...");

            while (true) {
               
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado desde: " + cliente.getInetAddress());

                BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);

                String num1Str = entrada.readLine();
                String num2Str = entrada.readLine();
       
                try {
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);
                    int resultado = num1 + num2;
                    salida.println("La suma es: " + resultado);
                } catch (NumberFormatException e) {
                    salida.println("Error: Formato de número incorrecto.");
                }
            
                cliente.close();
            }
        } catch (IOException e) {
            System.out.println("Error en el servidor: " + e.getMessage());
        }
    }
}