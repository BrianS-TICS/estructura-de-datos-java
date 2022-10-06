package listas;
public class Lista<T> {
    private Nodo<T> cabeza;
    private int tamanio;
    public Lista(){
        cabeza = null;
        tamanio=0;
    }
    public int getTamanio(){
        return tamanio;
    }
    public boolean esVacio(){
        if(cabeza==null)
            return true;
        else
            return false;
    }

    public void insertar(T valor,int pos) throws
            PosicionIlegalException{
        if (pos>=0 && pos<=tamanio) {
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            // El nodo a insertar esta al comienzo de la lista
            if(pos==0) {
                nuevo.setSiguiente(cabeza);
                cabeza=nuevo;
            }else {
                //El nodo a insertar va al final de la lista
                if(pos==tamanio) {
                    Nodo<T> aux = cabeza;
                    while(aux.getSiguiente() !=null) {
                        aux=aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                    //insertar al final
                }else {
                    //insertar en medio
                    Nodo<T> aux=cabeza;
                    for(int i=0;i<=pos-2;i++) {
                        aux=aux.getSiguiente();
                    }
                    Nodo<T> siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            tamanio++;
        }else {
            throw new PosicionIlegalException();
        }

    }
    public void remover(int pos) throws PosicionIlegalException{
        if(pos>=0 && pos<tamanio)
        {
            if (pos==0) {
                //el nodo a eliminar esta en la primera posicion
                cabeza = cabeza.getSiguiente();
                tamanio--;
            }
            else
            {
                Nodo<T> aux = cabeza;
                for(int i=0;i<pos-2;i++)
                {
                    aux = aux.getSiguiente();
                }
                Nodo<T> prox = aux.getSiguiente();
                aux.setSiguiente(prox.getSiguiente());
                tamanio--;
            }
        }
        else
        {
            throw new PosicionIlegalException();
        }
    }
    public void limpiar() {
        cabeza= null;
        tamanio=0;
    }
    public T getValor(int pos) throws PosicionIlegalException{
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
//
