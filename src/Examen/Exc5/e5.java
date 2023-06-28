package Examen.Exc5;

public class e5 {

    /*
     * La clasificación por inserción es un algoritmo
     * de clasificación simple que funciona de manera
     * similar a la forma en que clasifica las cartas
     * en sus manos. La vector se divide virtualmente
     * en una parte ordenada y otra no ordenada.
     * Los valores de la parte no ordenada se seleccionan y
     * colocan en la posición correcta en la parte ordenada.
     */

    public void insercionDirecta(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
             * greater than key, to one position ahead
             * of their current position
             */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }



}
