package Recursividad;

public class Hanoi {
    public static void main(String[] args) {
        hanoi('A','B','C',3);
    }
    public static void hanoi(char varinicial,char varcentral, char varfinal,int n) {
        if (n == 1)
            System.out.println("Mover disco "+ n + " desde varilla "+
                    varinicial + " a varilla "+ varfinal);
        else
        {
            hanoi(varinicial,varfinal,varcentral,n-1);
            System.out.println("Mover disco "+n+" desde varilla "+
                    varinicial + " a varilla "+varfinal);
            hanoi(varcentral, varinicial,varfinal,n-1);
        }
    }
}
