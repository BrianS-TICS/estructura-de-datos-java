package Recursividad;

public class sumaNumeros {
    public static void main(String[] args) {
        final int n = 10;
        System.out.println(sumaEnteros(n));
    }
    static long sumaEnteros(int n){
        if( n == 1){
            return 1;
        }
        else{
            return n + sumaEnteros(n+1);
        }
    }
}
