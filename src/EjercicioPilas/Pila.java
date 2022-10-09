package EjercicioPilas;

public class Pila<T> {
    //atributos cabeza, que apunta al tope de la pila
    private Nodo<T> cabeza;
    //Almacenar el total de elementos de la pila
    private int tamanio;
    //Constructor por defecto
    public Pila() {
        cabeza= null;
        tamanio=0;
    }
    //Devuelve el total de elementos de la pila
    public int getTamanio() {
        return tamanio;
    }
    //Verifica si la pila esta vacia
    public boolean esVacia() {
        //si cabeza es null, regresa un true
        //y si no es null, regresa en false
        if (cabeza==null)
            return true;
        else
            return false;
        //return (cabeza==null);
    }
    //Apila un elemento nuevo
    public void apilar(T valor) {
        //Crear un nuevo Nodo
        Nodo<T> nuevo = new Nodo<T>();
        //Fija el valor dentro del Nodo
        nuevo.setValor(valor);
        if (esVacia()) {
            //primer elemento que ingreso
            //cabeza apunta al nuevo nodo
            cabeza= nuevo;
        } else {
            // se enlaza el campo siguiente de nuevo con la cabeza
            nuevo.setSiguiente(cabeza);
            //la cabeza nueva de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        //Incrementar el tamaño porque hay un nuevo elemento
        tamanio++;
    }
    //Elimina un elemento de la pila
    public void retirar() {
        if (!esVacia())
        {
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
    }
    //devuelve el elemento almacenadp en el tope de la pila
    public T cima() {
        if(!esVacia())
            return cabeza.getValor();
        else
            return null;
    }

}