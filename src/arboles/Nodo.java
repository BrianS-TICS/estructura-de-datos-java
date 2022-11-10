package arboles;

/* Representa un arbol que contiene 3 campos
*   Valor izquierdo y derecho
* */

public class Nodo {
    private Object valor;
    private Nodo izquierdo;
    private Nodo derecho;
    public Nodo() {
        valor = null;
        izquierdo=null;
        derecho=null;
    }
    public Nodo(Object valor) {
        this.valor = valor;
        izquierdo=null;
        derecho=null;
    }
    public Object getValor() {
        return valor;
    }
    public void setValor(Object valor) {
        this.valor = valor;
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
