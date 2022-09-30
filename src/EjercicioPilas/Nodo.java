package EjercicioPilas;

public class Nodo<T>{
    //Atributo valor de tipo T. Almacena la referencia al objeto
    //  que se guarda en el nodo
    private T valor;
    //Referencia al siguiente nodo enlazado
    private Nodo<T> siguiente;
    //constructor por defecto
    public Nodo() {
        valor=null;
        siguiente = null;
    }
    //devuelve el valor
    public T getValor() {
        return valor;
    }
    //modifica el valor
    public void setValor(T valor) {
        this.valor = valor;
    }
    //devuelve el atributo siguiente
    public Nodo<T> getSiguiente() {
        return siguiente;
    }
    //modifica el atributo siguiente
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }


}