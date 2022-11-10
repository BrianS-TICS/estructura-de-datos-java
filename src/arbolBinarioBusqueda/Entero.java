package arbolBinarioBusqueda;

public class Entero implements Comparable{
    private int data;
    public Entero(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public boolean esIgual(Object q){
        Entero obj = (Entero)q;
        return (data == obj.getData());
    }

    public boolean esMenor(Object q){
        Entero obj = (Entero)q;
        return (data < obj.getData());
    }

    public boolean esMayor(Object q){
        Entero obj = (Entero)q;
        return (data > obj.getData());
    }

    public String toString(){
        return ""+data;
    }

}
