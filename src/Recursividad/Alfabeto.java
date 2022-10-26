package Recursividad;

public class Alfabeto {
    public static void main(String[] a)
    {
        System.out.println();
        metodoA('Z');
        System.out.println();
    }
    static void metodoA(char c)
    {
        if (c>'A')
            metodoB(c);
        System.out.print(c);
    }
    static void metodoB(char c)
    {
        metodoA(--c);
    }
}
