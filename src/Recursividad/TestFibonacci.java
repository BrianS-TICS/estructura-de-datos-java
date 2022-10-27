package Recursividad;

import java.util.Scanner;

public class TestFibonacci {
    public static void main(String[] args) {
        //ingreso datos
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese un valor:");
        int n=scanner.nextInt();
        //invoco función recursiva
        Fibonacci fib = new Fibonacci();
        double f= fib.fibonacciRec(n);
        //muestro resultado
        System.out.println("El termino "+n+" es: "+f);
        scanner.close();
    }
}
