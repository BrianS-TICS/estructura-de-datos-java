package listas;

public class Nodo <T> {
    // Atributo valor tipo T que almacena la referencia al objeto que guarda en el nodo

    private T valor;
    cola.Nodo<T> siguiente;

    public Nodo(){
        valor = null;
        siguiente = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public cola.Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(cola.Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
