package Recursividad;

    public class SumaRecursiva {
        public static void main(String [] args) {
            final int n=259;
            System.out.println(sumaIterativa(n));
            System.out.println(sumaRecursiva(n));
        }

        //Versión Recursiva
        public static int sumaRecursiva(int
                                                n) {
            if(n<=9)
                return n;
            else
                return
                        sumaRecursiva(n/10)+n%10;
        }
        //Versión Iterativa
        public static int sumaIterativa(int n) {
            int suma = 0;
            while(n>9)
            {
                suma = suma + n%10;
                n = n/10;
            }
            return (suma+n);
        }
    }
