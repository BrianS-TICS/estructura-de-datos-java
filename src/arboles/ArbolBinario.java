package arboles;

public class ArbolBinario {
    // Raiz de un arbol binario
    protected Nodo raiz;
    public ArbolBinario() {
        raiz=null;
    }
    public ArbolBinario(Nodo raiz) {
        this.raiz= raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    public Nodo getRaiz() {
        return raiz;
    }
    //demas operaciones
    public void preorden() {
        preorden(raiz);
    }
    private void preorden(Nodo aux) {
        if (aux!=null)
        {
            visitar(aux);
            preorden(aux.getIzquierdo());
            preorden(aux.getDerecho());
        }

    }
    public void inorden() {
        inorden(raiz);
    }
    private void inorden(Nodo aux) {
        if(aux !=null) {
            inorden(aux.getIzquierdo());
            visitar(aux);
            inorden(aux.getDerecho());

        }
    }
    public void postorden() {
        postorden(raiz);
    }
    private void postorden(Nodo aux) {
        if(aux !=null) {
            postorden(aux.getIzquierdo());
            postorden(aux.getDerecho());
            visitar(aux);
        }
    }
    private void visitar(Nodo aux) {
        System.out.print(aux.getValor()+" ");
    }
    /*
     * Recorrido por Niveles
     */
    public void recorridoPorNiveles() {
        util.Cola<Nodo> cola = new util.Cola<Nodo>();
        cola.encolar(raiz);
        while (!cola.esVacia()) {
            Nodo aux = cola.frente();
            visitar(aux);
            if (aux.getIzquierdo() !=null)
                cola.encolar(aux.getIzquierdo());
            if(aux.getDerecho() !=null)
                cola.encolar(aux.getDerecho());
            cola.desencolar();
        }
    }
    /*
     * Recorrido preorden version iterativa, utiliza una pila
     */
    public void preordenIterativo() {
        //Usa la implementación de la pila
        util.Pila<Nodo> pila = new util.Pila<Nodo>();
        pila.apilar(raiz);
        while (!pila.esVacia()) {
            Nodo aux = pila.cima();
            visitar(aux);
            pila.retirar();
            if (aux.getDerecho() !=null)
                pila.apilar(aux.getDerecho());
            if(aux.getIzquierdo() !=null)
                pila.apilar(aux.getIzquierdo());

        }
    }
    /*
     * Recorrido inorden versión iterativa,utilizando una pila
     */
    public void inordenIterativo() {
        util.Pila<Nodo> pila = new util.Pila<Nodo>();
        pila.apilar(raiz);
        Nodo aux = raiz.getIzquierdo();
        while (aux != null || !pila.esVacia()) {
            if (aux != null) {
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }else {
                aux = pila.cima();
                pila.retirar();
                visitar(aux);
                aux = aux.getDerecho();
            }
        }
    }
    /*
     * Recorrido preorden versión iterativa, utilizando una pila
     */
    public void postOrdenIterativo(){
        util.Pila<Nodo> pila = new util.Pila<Nodo>();
        Nodo aux = raiz;
        Nodo q = raiz;
        while (aux != null) {
            //avanzar a la izquierda y aplila los nodos
            while(aux.getIzquierdo() != null) {
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }
            while (aux != null
                    && (aux.getDerecho() == null || aux.getDerecho() == q)) {
                visitar(aux);
                q = aux;
                if (pila.esVacia())
                    return;
                aux = pila.cima();
                pila.retirar();
            }
            pila.apilar(aux);
            aux = aux.getDerecho();
        }

    }

    // Demas operaciones

}
