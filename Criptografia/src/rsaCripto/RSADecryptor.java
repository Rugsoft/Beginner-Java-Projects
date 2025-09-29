package rsaCripto;

import java.util.Base64;

import javax.crypto.Cipher;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RSADecryptor {

	public static void main(String[] args) throws Exception { 
		
		// Leer la clave privada desde el archivo
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("private.key"));
		java.security.PrivateKey privateKey = (java.security.PrivateKey) ois.readObject();
		ois.close();
		
		// Leer el mensaje cifrado desde el archivo
		String mensajeCifrado = new String(Files.readAllBytes(Paths.get("mensajeCifrado.txt")));
		
		Cipher cipher = Cipher.getInstance("RSA"); // Crea un objeto Cipher para usar RSA 
		cipher.init(Cipher.DECRYPT_MODE, privateKey); // Inicializa en modo descifrado con la clave privada 
		byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(mensajeCifrado)); // Descifra el mensaje 
		String mensajeOriginal = new String(decryptedBytes); // Convierte los bytes descifrados en texto 
		System.out.println("Mensaje descifrado: " + mensajeOriginal); // Esta línea muestra el mensaje por consola 
		}
}