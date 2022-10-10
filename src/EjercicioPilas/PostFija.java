package EjercicioPilas;

import java.util.Scanner;
import java.util.Stack;

public class PostFija {
    // Test (541*42)/(22+21)
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe la expreción :");
        String entrada = leer.next();
        String salida = "";
        Stack<Character> pila = new Stack<Character>();

        for(int i = 0; i < entrada.length() ; i++) {
            // Valido si es numero usando el codigo ASCII
            // Si es numero concateno directamente a el string de salido
            if(entrada.charAt(i) >= '0' & entrada.charAt(i) <= '9'){
                salida = salida + entrada.charAt(i);
            }
            // Usando el codigo ASCII valido de que rango a que rango se deben de considerar los operadores
            // Esto por que los operadores en el codigo ASCII estan ordenados en serie de "* : 42" a "/ : 47"
            if (entrada.charAt(i) >= '*' & entrada.charAt(i) <= '/'){
                // Al entrar en la condicion empujo el operador a la pila
                pila.push(entrada.charAt(i));
            }
            // En caso de existir un cierre se saca el ultimo operador de la pila y se concatena a los numeros
            // del string
            if(entrada.charAt(i) == ')'){
                salida = salida + pila.pop();
            }
        }

        // Si la pila de operadores sigue con elementos concateno a el string de salida
        while (!pila.isEmpty())
            salida = salida + pila.pop();

        // Imprimo resultado
        System.out.println(salida);

    }

}
