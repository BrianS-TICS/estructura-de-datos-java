package ArbolBinarioOrdenado;

public class Nodo {
    private Nodo izquierdo;
    private Nodo derecho;
    private Comparable valor;

    private Nodo(){
        valor = null;
        izquierdo = null;
        derecho = null;
    }

    public Nodo(Comparable valor){
        this.valor = valor;
        izquierdo = null;
        derecho = null;
    }

    public Comparable getValor(){
        return valor;
    }

    public void setValor(Comparable valor){
        this.valor = valor;
    }



}
