package EjercicioPilas;

import java.util.Scanner;

public class ClienteExpresionAI {

    public static void main(String[] args) {
        /*
        String cadena = "(X + Z)* W / T ^ Y - V";
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe la expresión infija: ");
        String cadena = leer.nextLine();

        ExpresionAritmeticaInfija expArIn = new ExpresionAritmeticaInfija(cadena);
        System.out.println();
        expArIn.convertirPostFija(cadena);
    }

}