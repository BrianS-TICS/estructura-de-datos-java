package listas;

public class PosicionIlegalException extends Exception{
    public PosicionIlegalException(){
        super("Posicion ilegal en la lista");
    }
}
