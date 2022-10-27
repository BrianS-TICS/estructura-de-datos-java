package Recursividad;
import java.util.Hashtable;
import java.util.Scanner;

public class FibRecursivoOptimizado {
    public static void main(String[] args) {
        //inicializamos la tabla
        Hashtable<Integer,Double>t = new
                Hashtable<Integer,Double>();
        t.put(1, 1d);//1d = 1 convertido a double
        t.put(2, 1d);//1d = 1 convertido a double
        //el usuario ingresa el valor de n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantos términos quiere ver:");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++) {
            double f = fibonacci(i,t);
            System.out.println("fib("+i+") = "+f);
        }
    }
    private static double fibonacci(int x,Hashtable<Integer,Double>t) {
        //primerop verificamos si el resultado esta en la table
        Double d = t.get(x);
        //si no estaba entonces lo calculamos y lo ingresamos a la table
        if(d==null)
        {
            d = fibonacci(x-1,t)+fibonacci(x-2,t);
            t.put(x, d);
        }
        //retornamos el resultado
        return d;
    }
}