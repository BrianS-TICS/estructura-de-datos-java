package EjercicioPilas;

import java.util.Stack;

public class Delimitadores2 {

    public boolean evaluaDelimitadores(String cadena) {

        Stack<String> pila = new Stack<String>();

        boolean lecturaPendiente = true;
        int contador = 0;

        while(contador < cadena.length() && lecturaPendiente){
            char caracter = cadena.charAt(contador);
            String caracterComoString = Character.toString(caracter);

            contador++;

            switch (caracter){

                case '(' : {
                    pila.push(Character.toString(')'));
                    break;
                }
                case '[' : {
                    pila.push(Character.toString(']'));
                    break;
                }
                case '{' : {
                    pila.push(Character.toString('}'));
                    break;
                }
                case '/' : {
                    pila.push(Character.toString('/'));
                    break;
                }

                case ')':
                case ']':
                case '}':
                {
                    String comparador = pila.peek();
                    
                    if (comparador != null){

                        if (caracterComoString.compareTo(comparador) == 0){
                            pila.pop();
                        }
                        else{
                            lecturaPendiente = false;
                        }

                    }
                    else{
                        lecturaPendiente = false;
                    }
                }

                case '*':{
                    if (siguienteAsterisco(cadena,contador)) {
                        pila.pop();
                        contador++;
                    }
                }

            }
        }

        if (pila.empty() && lecturaPendiente)
            return true;
        else
            return  false;
    }

    public static boolean siguienteAsterisco(String cadena, int posicion){
        char caracter = cadena.charAt(posicion);
        if(caracter == '*')
            return true;
        else
            return false;
    }
    public static boolean siguienteDiagonal(String cadena, int posicion){
        char caracter = cadena.charAt(posicion);
        if(caracter == '/')
            return true;
        else
            return false;
    }
}
