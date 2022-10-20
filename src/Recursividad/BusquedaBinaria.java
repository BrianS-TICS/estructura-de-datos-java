package Recursividad;

public class BusquedaBinaria {
    public static int busquedaBinaria(int arr[], int v, int i, int j) {
        int k = (i+j)/2;

        if (i>j)
            return -1;
        if (arr[k]==v)
            return k;
        else{
            if (arr[k] < v){
                i = k + 1;
            }
            else {
                j = k -1;
            }
            return busquedaBinaria(arr, k, i,j);
        }
    }
}
