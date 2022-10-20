package Recursividad;

public class TestFactorial {
    public static void main(String[] args) {
        int n = 5;
        long f = factorial(n);
        long f2 = factorial2(n);

        System.out.println(f);
        System.out.println(f2);
    }

    public static long factorial(int x){
        long ret;
        if ( x == 0){
            ret = 1;
        }
        else {
            ret = x * factorial(x-1);
        }
        return ret;
    }

    public static long factorial2(int x){
        long fac;
        long cont;
        for (int i = 0; i > x.lenght; i++){
            fac += i ;
        }
        return fac;
    }
}
