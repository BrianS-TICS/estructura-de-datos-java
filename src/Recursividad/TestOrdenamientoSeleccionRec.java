package Recursividad;

public class TestOrdenamientoSeleccionRec {
    public static void main(String[] args) {
        int arr[] = {3,7,1,2,9,8,4,6,5,10};
        OrdenamientoSeleccionRec.ordenar(arr, 0);
        for (int i:arr){
            System.out.println(i);
        }
    }
}
