package ArbolBinarioOrdenado;

import arboles.Nodo;

public class ArbolBinarioOrdenado {
    private Nodo raiz;

    public ArbolBinarioOrdenado(){
        raiz = null;
    }

    // Insertar un nodo en el arbol Binario
    public void insertar(Object valor) throws Exception{
        Comparable dato = (Comparable) valor;
        Nodo nuevo = new Nodo();

        nuevo.setValor(dato);
        if (raiz == null)
        {
            raiz = nuevo;
        }

        else{
            Nodo anterior = null;
            Nodo aux = raiz;
            while(aux != null){
                anterior = aux;
                if (dato.esMenor(aux.getValor())) {
                    aux = aux.getIzquierdo();
                }else if(dato.esMenor){

                }
            }
        }
    }

}
