package semaforos;

import java.util.concurrent.Semaphore; 

public class EjemploSemaforo { 
	// Crear un semáforo con un solo permiso (binario)
	static Semaphore semaforo = new Semaphore(1); // Semáforo binario 
	
	public static void main(String[] args) { 
		Runnable tarea = () -> { 
			try { 
				System.out.println(Thread.currentThread().getName() + " quiere acceder."); 
				semaforo.acquire(); // Solicita acceso 
				System.out.println(Thread.currentThread().getName() + " está accediendo..."); 
				Thread.sleep(2000); // Simula uso del recurso 
				System.out.println(Thread.currentThread().getName() + " ha terminado."); 
				semaforo.release(); // Libera el recurso 
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
			} 
		}; 
		// Crear dos hilos que compiten por el mismo recurso 
		new Thread(tarea, "Proceso A").start(); 
		new Thread(tarea, "Proceso B").start();
		new Thread(tarea, "Proceso C").start(); 
	} 
}
