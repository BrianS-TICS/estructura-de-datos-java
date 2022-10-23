package Recursividad;

import java.util.Scanner;

public class Muestranaturales {
    public static void main(String[]args) {
        Scanner scaner = new Scanner (System.in);
        System.out.println("Proporciona la cantidad de "
                + "elementos a mostrar: ");
        int n = scaner.nextInt();
        //forma iterativa
			/*for(int i=0;i<=n;i++) {
				System.out.println(i);
			}*/
        //forma recursiva
        muestraNaturales(n);
    }
    private static void muestraNaturales(int n)
    {
        if (n>0)
        {
            muestraNaturales(n-1);
        }
        System.out.println(n);
    }
}

