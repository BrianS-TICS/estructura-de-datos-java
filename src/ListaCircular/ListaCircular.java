package ListaCircular;

import Listas.Nodo;
import Listas.PosicionIlegalException;

public class ListaCircular<T> {
    //primer elemento de la lista
    private Listas.Nodo<T> cabeza;
    //Total de elementos de la lista
    private int tamanio;
    //constructor por defecto
    public ListaCircular() {
        cabeza=null;
        tamanio=0;
    }
    public int getTamanio() {
        return tamanio;
    }
    public boolean esVacia() {
        if(cabeza==null)
            return true;
        else
            return false;
    }
    //Agregar un nuevo nodo al final de la lista
    public void agregar(T valor) {
        Listas.Nodo<T> nuevo = new Listas.Nodo<T>();
        nuevo.setValor(valor);
        if (esVacia()) {
            // Como hay un solo nodo el siguiente apunta al mismo
            nuevo.setSiguiente(nuevo);
            cabeza=nuevo;
        }
        else {
            //agregar al final de la lista
            Listas.Nodo<T> aux =cabeza;
            while (aux.getSiguiente() != cabeza)
            {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            //Enlaza al ultimo nodo con el primero
            nuevo.setSiguiente(cabeza);
        }
        tamanio++;
    }
    public void insertar(T valor,int pos) throws
            Listas.PosicionIlegalException {
        if (pos>=0 && pos<=tamanio) {
            Listas.Nodo<T> nuevo = new Listas.Nodo<T>();
            nuevo.setValor(valor);
            // El nodo a insertar esta al comienzo de la lista
            if(pos==0) {
                // Buscar el ultimo nodo
                Nodo<T> ultimo = cabeza;
                while (ultimo.getSiguiente() != cabeza){
                    ultimo = ultimo.getSiguiente();
                }

                nuevo.setSiguiente(cabeza);
                cabeza=nuevo;

                ultimo.setSiguiente(cabeza);
            }else {
                //El nodo a insertar va al final de la lista
                if(pos==tamanio) {
                    Listas.Nodo<T> aux = cabeza;
                    while(aux.getSiguiente() !=cabeza) {
                        aux=aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(cabeza);
                    //insertar al final
                }else {
                    //insertar en medio
                    Listas.Nodo<T> aux=cabeza;
                    for(int i=0;i<=pos-2;i++) {
                        aux=aux.getSiguiente();
                    }
                    Listas.Nodo<T> siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            tamanio++;
        }else {
            throw new Listas.PosicionIlegalException();
        }

    }
    public void remover(int pos) throws Listas.PosicionIlegalException {
        if(pos>=0 && pos<tamanio)
        {
            if (pos==0) {
                //el nodo a eliminar esta en la primera posicion
                cabeza = cabeza.getSiguiente();
                tamanio--;
            }
            else
            {
                Listas.Nodo<T> aux = cabeza;
                for(int i=0;i<pos-2;i++)
                {
                    aux = aux.getSiguiente();
                }
                Listas.Nodo<T> prox = aux.getSiguiente();
                aux.setSiguiente(prox.getSiguiente());
                tamanio--;
            }
        }
        else
        {
            throw new Listas.PosicionIlegalException();
        }
    }
    public void limpiar() {
        cabeza= null;
        tamanio=0;
    }
    public T getValor(int pos) throws Listas.PosicionIlegalException {
        if(pos>=0 && pos<tamanio)
        {
            T valor;
            if(pos==0) {
                valor=cabeza.getValor();
                return valor;
            }
            else
            {
                Nodo<T> aux= cabeza;
                for(int i=0;i<=pos-1;i++) {
                    aux= aux.getSiguiente();
                }
                valor = aux.getValor();
            }
            return valor;

        }
        else
        {
            throw new PosicionIlegalException();
        }
    }



}