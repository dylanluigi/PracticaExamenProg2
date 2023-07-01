package Ejercicios_Practica.AlgoritmesOrdenacio;

public class Algoritmes {

    public static final int NoTrobat = -1;

    // Insertion Sort algorithm.
    public static void InsercioDirecta(Dades[] array){
        final int N = array.length;
        int j;
        Dades x;

        // Outer loop increments through the array
        for (int i = 0; i < N; i++) {
            x = array[i];
            j=i-1;

            // Inner loop swaps elements to the right position until it finds a smaller one
            while ((j>=0)&&(x.clau < array[j].clau)){
                array[j+1]=array[i];
                j--;
            }
            array[j+1]=x; // Place the element at the right position
        }
    }

    // Selection Sort algorithm.
    public static void SeleccioDirecta(Dades[] array){
        final int N = array.length;
        int j_min;
        Dades min;

        // Outer loop for each element in the array
        for (int i = 0; i < N-1; i++) {
            min=array[i];
            j_min = i;

            // Inner loop to find the smallest element in the remaining array
            for (int j = 0; j < i+1; j++) {
                if (array[j].clau<min.clau){
                    min = array[j];
                    j_min=j;
                }
            }
            // Swap the smallest found element with the first unsorted element
            array[j_min]=array[i];
            array[i]=min;
        }
    }

    // Bubble Sort algorithm.
    public static void BubbleSort(Dades[] array){
        final int N = array.length;
        Dades x;
        int i = 0;

        // Loop until the array is sorted
        while (i<N-1){
            int lj = N;

            // Move through the array from end to start
            for (int j = N-2; j >= i; j--) {

                // If next element is smaller, swap them
                if (array[j+1].clau < array[j].clau){
                    x = array[j+1];
                    array[j+1]=array[j];
                    array[j]=x;
                    lj=j;
                }
            }
            i = lj+1;
        }
    }

    // Cocktail Shaker Sort algorithm.
    public static void espolsada(Dades[] array){
        final int N = array.length;
        Dades x;
        int esq = 0;
        int dre = N-1;

        // While there are elements to be sorted
        while (esq<dre){
            int lj = dre;

            // Bubble up the largest element to the end of the array
            for (int i = dre - 1; i >= esq; i--) {
                if (array[i+1].clau < array[i].clau){
                    x = array[i+1];
                    array[i+1]=array[i];
                    array[i]=x;
                    lj = i+1;
                }
            }
            esq = lj+1;

            // Bubble down the smallest element to the beginning of the array
            for (int i = esq; i <=dre; i++) {
                if (array[i+1].clau < array[i].clau){
                    x = array[i+1];
                    array[i+1] = array[i];
                    array[i]=x;
                    lj = i+1;
                }
            }
            dre = lj-1;
        }
    }

    // Binary Search algorithm.
    private static int BinarySearch(Dades[] t, Dades x) {
        int inf = 0, sup = t.length - 1;
        int mig = (sup + inf) / 2;

        // While there are elements in the search space
        while ((inf < sup) && (t[mig].clau != x.clau)) {

            // If current element is smaller, search in the right half
            if (t[mig].clau < x.clau) {
                inf = mig + 1;
            } else {
                // If current element is larger, search in the left half
                sup = mig - 1;
            }
            mig = (sup + inf) / 2;
        }
        // If found return the index, else return NoTrobat
        return (t[mig].clau == x.clau ? mig : NoTrobat);
    }
}
