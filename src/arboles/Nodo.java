package arboles;

/* Representa un arbol que contiene 3 campos
*   Valor izquierdo y derecho
* */

public class Nodo {
    private Object Valor;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo(){
        valor = null;
        setIzquierdo(null);
        setDerecho(null);
    }

    public Nodo(Object valor){
        this.valor = valor;
        setIzquierdo(null);
        setDerecho(null);
    }

    public Object getValor() {
        return Valor;
    }

    public void setValor(Object valor) {
        Valor = valor;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}
