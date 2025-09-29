package rsaCripto;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

import javax.crypto.Cipher;

public class RSAEncryptor { 
	
	    public static void main(String[] args) throws Exception { 
	    	
	        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA"); // Crea un generador de claves RSA 
	        keyGen.initialize(2048); // Establece el tamaño de la clave (2048 bits es seguro) 
	        KeyPair pair = keyGen.generateKeyPair(); // Genera el par de claves (pública y privada) 
	        PublicKey publicKey = pair.getPublic(); // Extrae la clave pública 
	        PrivateKey privateKey = pair.getPrivate(); // Extrae la clave privada 
	        String mensaje = "Este es un mensaje secreto"; // Define el mensaje que se va a cifrar 
	        Cipher cipher = Cipher.getInstance("RSA"); // Crea un objeto Cipher para usar el algoritmo RSA 
	        cipher.init(Cipher.ENCRYPT_MODE, publicKey); // Inicializa el cifrador en modo cifrado con la clave pública 
	        byte[] encryptedBytes = cipher.doFinal(mensaje.getBytes()); // Cifra el mensaje y obtiene los bytes cifrados 
	        String mensajeCifrado = Base64.getEncoder().encodeToString(encryptedBytes); // Codifica los bytes cifrados en Base64 
	        System.out.println("Mensaje cifrado: " + mensajeCifrado); // Muestra el mensaje cifrado por consola 
	        RSAKeyStore.publicKey = publicKey; // Guarda la clave pública en la clase auxiliar 
	        RSAKeyStore.privateKey = privateKey; // Guarda la clave privada en la clase auxiliar 
	        RSAKeyStore.mensajeCifrado = mensajeCifrado; // Guarda el mensaje cifrado en la clase auxiliar 

	        // Guardar la clave pública
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("public.key"))) {
	            oos.writeObject(publicKey);
	        }
	        // Guardar la clave privada
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("private.key"))) {
	            oos.writeObject(privateKey);
	        }
	        // Guardar el mensaje cifrado
	        try (FileOutputStream fos = new FileOutputStream("mensajeCifrado.txt")) {
	            fos.write(mensajeCifrado.getBytes());
	        }
	    } 
	}