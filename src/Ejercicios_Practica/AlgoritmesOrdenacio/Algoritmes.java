package Ejercicios_Practica.AlgoritmesOrdenacio;

public class Algoritmes {

    public static final int NoTrobat = -1;

    public static void InsercioDirecta(Dades[] array){

        final int N = array.length;
        int j;
        Dades x;

        for (int i = 0; i < N; i++) {
            x = array[i];
            j=i-1;
            while ((j>=0)&&(x.clau < array[j].clau)){
                array[j+1]=array[i];
                j--;
            }
            array[j+1]=x;
        }

    }

    public static void SeleccioDirecta(Dades[] array){

        final int N = array.length;
        int j_min;
        Dades min;

        for (int i = 0; i < N-1; i++) {
            min=array[i];
            j_min = i;
            for (int j = 0; j < i+1; j++) {
                if (array[j].clau<min.clau){
                    min = array[j];
                    j_min=j;
                }
            }
            array[j_min]=array[i];
            array[i]=min;
        }
    }

    public static void BubbleSort(Dades[] array){
        final int N = array.length;
        Dades x;
        int i = 0;
        while (i<N-1){
            int lj = N;
            for (int j = N-2; j >= i; j--) {
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

    public static void espolsada(Dades[] array){

        final int N = array.length;
        Dades x;
        int esq = 0;
        int dre = N-1;
        while (esq<dre){

            int lj = dre;
            for (int i = dre - 1; i >= esq; i--) {
                if (array[i+1].clau < array[i].clau){
                    x = array[i+1];
                    array[i+1]=array[i];
                    array[i]=x;
                    lj = i+1;
                }
            }
            esq = lj+1;
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

    //cercaDicotomica
    private static int BinarySearch(Dades[] t, Dades x) {
        int inf = 0, sup = t.length - 1;
        int mig = (sup + inf) / 2;
        while ((inf < sup) && (t[mig].clau != x.clau)) {
            if (t[mig].clau < x.clau) {
                inf = mig + 1;
            } else {
                sup = mig - 1;
            }
            mig = (sup + inf) / 2;
        }
        return (t[mig].clau == x.clau ? mig : NoTrobat);
    }






}
