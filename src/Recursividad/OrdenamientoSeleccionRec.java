package Recursividad;

public class OrdenamientoSeleccionRec {
    public static void ordenar(int arr [], int dd) {
        if (dd < arr.length){
            int posMin = busquedaPosMin(arr, dd);

            int aux = arr[dd];
            arr[dd] = arr[posMin];
            arr[posMin] = aux;

            ordenar(arr, dd+1);
        }
    }

    private static int busquedaPosMin(int [] arr, int dd){
        int posMin = dd;
        int min = arr[dd];
        for (int i = dd; i < arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
                posMin = 1;
            }
        }
        return  posMin;
    }
}
