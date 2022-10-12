package ListaDoblementeEnlazada;

public class Nodo <T>{
    //atributo valor de tipo T.Almacena la
//referencia al objeto que se guarda
//en el nodo
    private T valor;
    Nodo<T> siguiente;
    Nodo<T> anterior;
    //constructor por defecto
    public Nodo() {
        valor = null;
        siguiente = null;
        anterior = null;
    }
    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }
    public Nodo<T> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }
}