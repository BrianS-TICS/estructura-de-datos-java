package Recursividad;

import java.util.Scanner;

public class TestFibonacci {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un valor");
        int valor = leer.nextInt();
        Fibonacci fib = new Fibonacci();
        double f = fib.fibonacciRec(n);
        System.out.println("Resultado " + n + " es " + f);
        leer.close();
    }
}
