package ListaCircular;

public class Nodo<T> {
    //Atributo valor de tipo T.Almacena la referencia al objeto
    //que guarda en el nodo
    private T valor;
    //referencia al siguiente nodo enlazado
    Nodo<T> siguiente;
    //Constructor por defecto
    public Nodo() {
        valor = null;
        siguiente = null;
    }
    //Devuelve el valor
    public T getValor() {
        return valor;
    }
    //Modifica el alor
    public void setValor(T valor) {
        this.valor = valor;
    }
    //devuelve el atributo siguiente
    public Nodo<T> getSiguiente() {
        return siguiente;
    }
    //modifica el atributo siguientr
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }


}
