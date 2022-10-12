package ListaDoblementeEnlazada;

public class ListaDoblementeEnlazada<T> {
    //primer elemento de la lista
    private Nodo<T> cabeza;
    private int tamanio;
    //constructor por defecto
    public ListaDoblementeEnlazada() {
        cabeza = null;
        tamanio =0;
    }
    /*
     * devuelve el tamaño de la lista
     */
    public int getTamanio() {
        return tamanio;
    }
    public boolean esVacia() {
        return (cabeza==null);
    }.
    //Agrega un nuevo nodo al final de la lista
    public void agregar(T valor) {

    }
    public void insertar(T valor, int pos)
    {

    }
    //devuelve el valor de una determinada posicion
    public T getValor(int pos)
    {

    }
    //elimina un nodo de una determinada posicion
    public void remover(int pos)
    {

    }
    //elimina todos los nodos de la lista
    public void limpiar() {
        cabeza= null;
        tamanio = 0;
    }
}