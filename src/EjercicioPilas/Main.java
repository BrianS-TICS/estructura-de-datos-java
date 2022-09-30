package EjercicioPilas;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* String cadena ="while (m<(n[8]+0))\n"
                +"{\n"
                +"    p = 7;\n"
                +"    \n"
                +"    6 = 6;\n"
                +"}\n";
        */
        // System.out.println("Cadena a Evaluar = \n"+cadena);
        System.out.println("Escribe la exprecion a evaluar");
        String cadenaExpresion = sc.nextLine();

        Delimitadores objDelimitadores = new Delimitadores();

        if (objDelimitadores.evaluacionDelimitadores(cadenaExpresion))
            System.out.println("EXITO");
        else
            System.out.println("ERROR");

    }
}