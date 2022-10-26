package Recursividad;

public class MCD {
    public static void main(String[] args) {
        System.out.println(mcd(6,124));
    }
    public static int mcd(int m,int n)
    {
        if(n<=m && m%n ==0)
            return n;
        else if(m<n)
            return mcd(n,m);
        else
            return mcd(n,m%n);
    }


    //iterativo
    public static int maximoComunDivisor(int m, int n) {
        int temporal;
        while (n != 0) {
            temporal = n;
            n = m % n;
            m = temporal;
        }
        return m;
    }
}
