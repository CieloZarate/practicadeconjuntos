#PRACTICA DE TOKEN
#Autor - Cielo Raymundo Zarate
#Autor - cielitorayzarti@gmail.com
import java.util.LinkedList;
import java.util.Queue;

public class TokenQueueExample {
    public static void main(String[] args) {
        Queue<String> tokenQueue = new LinkedList<>();
        
        // Agregar tokens a la cola
        tokenQueue.add("Token 1");
        tokenQueue.add("Token 2");
        tokenQueue.add("Token 3");
        
        // Mostrar el tamaño de la cola
        System.out.println("Tamaño de la cola: " + tokenQueue.size());
        
        // Mostrar el primer token en la cola sin eliminarlo
        System.out.println("Primer token en la cola: " + tokenQueue.peek());
        
        // Eliminar y mostrar el primer token en la cola
        String firstToken = tokenQueue.poll();
        System.out.println("Primer token eliminado de la cola: " + firstToken);
        
        // Mostrar el tamaño de la cola después de eliminar el primer token
        System.out.println("Tamaño de la cola después de eliminar un token: " + tokenQueue.size());
    }
}