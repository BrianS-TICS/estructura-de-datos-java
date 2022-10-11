package Colas;
import java.util.Queue;
import java.util.LinkedList;
// EJEMPLO DE USO DE LA INTERFACE QUEUE
public class ClienteQueue {
    public static void main(String[] args) {
        // Creo una cola generica
        Queue micola = new LinkedList();
        // Agrega tres elementos a la cola en ese orden
        micola.add("Elemento 0");
        micola.add("Elemento 1");
        micola.add("Elemento 2");

        // Mostrar el primer elemento
        System.out.println("El primer elemento de la cola es " + micola.peek());

        // Elimina el primer elemento de la cola
        micola.remove();

        // Imprime el elemento 1
        System.out.println("El primer elemento de la cola es " + micola.peek());

        // Elimina el primer elemento de la cola
        micola.remove();

        // Mostrar el primer elemento
        System.out.println("El primer elemento de la cola es " + micola.peek());

        // Elimina el primer elemento de la cola
        micola.remove();

        // Mostrar el primer elemento
        System.out.println("El primer elemento de la cola es " + micola.peek());

    }
}
