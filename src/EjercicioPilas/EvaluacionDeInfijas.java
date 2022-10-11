package EjercicioPilas;

import java.util.Scanner;
import java.util.Stack;

public class EvaluacionDeInfijas {

    public static void main(String[] args) {

        System.out.println("Escribe la expresión:");
        Scanner leer = new Scanner(System.in);

        String exprecion = limpiar(leer.nextLine());
        String [] arrayInfijo = exprecion.split(" ");

        Stack < String > entrada = new Stack < String > ();
        Stack < String > operadores = new Stack < String > ();
        Stack < String > resultado = new Stack < String > ();

        for (int i = arrayInfijo.length - 1; i >= 0; i--) {
            entrada.push(arrayInfijo[i]);
        }try {
            while (!entrada.isEmpty()) {
                switch (seleccioOperador(entrada.peek())){
                    case 1:
                        operadores.push(entrada.pop());
                        break;
                    case 4:
                        while(seleccioOperador(operadores.peek()) >= seleccioOperador(entrada.peek())) {
                            resultado.push(operadores.pop());
                        }
                        operadores.push(entrada.pop());
                        break;case 2:

                        while(!operadores.peek().equals("(")) {

                            resultado.push(operadores.pop());

                        }
                        operadores.pop();
                        entrada.pop();

                        break;

                        default:
                        resultado.push(entrada.pop());}

            }
            String infijo = exprecion.replace(" ", "");
            String postfix = resultado.toString().replaceAll("[\\]\\[,]","");
            System.out.println("Expresion Infija: " + infijo);
            System.out.println("Expresion Postfija: " + postfix);

        }catch(Exception ex){System.out.println("Error");
            System.err.println(ex);
        }
    }
    private static String limpiar(String s) {
        s = s.replaceAll("\\s+", "");
        s = "(" + s + ")";
        String simbols = "+-*/()";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (simbols.contains("" + s.charAt(i))) {
                str += " " + s.charAt(i) + " ";
            }else str += s.charAt(i);
        }
        return str.replaceAll("\\s+", " ").trim();
    }
    private static int seleccioOperador(String op) {
        int seleccion = 99;
        if (op.equals("^")) seleccion = 5;
        if (op.equals("*") || op.equals("/")) seleccion = 4;
        if (op.equals("+") || op.equals("-")) seleccion = 3;
        if (op.equals(")")) seleccion = 2;
        if (op.equals("(")) seleccion = 1;
        return seleccion;
    }

}

