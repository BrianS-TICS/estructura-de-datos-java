package Recursividad;

public class testBusquedaBinaria {
    public static void main(String[] args) {
        int [] arr = {2, 4, 5, 8, 12, 18, 23, 45};
        int v = 6;

        System.out.println(BusquedaBinaria.busquedaBinaria(arr, v, 0, arr.length-1));
    }
}
