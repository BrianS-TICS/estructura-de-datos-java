package cola;
import java.util.*;

public class Cola <T> {
    // Atributo cabeza
    private Nodo <T> cabeza;

    private Nodo <T> cola;

    private int tamanio;

    public Cola(){
        cabeza = null;
        cola = null;
        tamanio = 0;
    }

    public int getTamanio(){
        return tamanio;
    }

    public boolean esVacio(){
        return (cabeza==null);
    }

    public void encolar(T valor){
        // Crear un nuevo elemento

    }
}
