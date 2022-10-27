package Recursividad;

public class FibRecursividad40a50 {
    private static long cont;
    public static void main(String[] args) {
    //instancia de Performance para tomar mediciones
        Performance p =new Performance();
        int desde = 40;//termino inicial
        int hasta = 50; //termino final
        double ant = -1;
        for (int i=desde;i<=hasta;i++) {
            cont = -1;//inicializar contado
            p.start();//comenzamos a tomar el tiempo
    //invocamos a la funcion recirsiva
            double f = fibonacci(i);
            p.stop();//detenemos e tiempo
            System.out.print("f("+i+") = "+f+", "+p.getMillis()+
                    " ms, "+cont+" veces.");
    //si no es el primero entonces calculamos el incremento de tiempo
            if(ant>=0) {
                System.out.println(" Incr = "+f/ant);}
            else {
                System.out.println(); }
            ant = f;//ahora, el término anteror será el que recien calculamos
        }
    }
    //MIDIENDO EL PERFORMACE DEL ALGORITO DE FIBONACCI RECURSIVO
    private static double fibonacci(int x)
    {
    //incrementamos contador
        cont++;
        return x<=2 ? 1: fibonacci(x-1)+fibonacci(x-2);
    }
}
