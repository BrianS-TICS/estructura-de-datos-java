package EjercicioPilas;

public class ClienteExpresionAI {

    public static void main(String[] args) {
        String cadena = "(X + Z)* W / T ^ Y - V";
        ExpresionAritmeticaInfija expArIn = new ExpresionAritmeticaInfija(cadena);
        expArIn.convertirPostFija(cadena);

    }

}