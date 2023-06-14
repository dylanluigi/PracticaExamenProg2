package Ejercicios_Practica.Permutacion;

public class Permutacio {
    private int[] dades;

    public Permutacio(int dimensio) {
        this.dades = new int[dimensio];
    }

    @Override
    public String toString() {
        String resultat = "";
        for (int i = 0; i < dades.length; i++) {
            resultat += dades[i] + " ";
        }
        return resultat;
    }

    public void primeraPermutacio() {
        for (int i = 0; i < this.dades.length; i++) {
            this.dades[i] = i;
        }
    }

    boolean darreraPermutacio() {
        int i = 0, j = dades.length - 1;
        while ((i < dades.length - 1) && (dades[i] == j)) {
            i++;
            j--;
        }
        return dades[i] == j;
    }

    public void seguentPermutacio() {
        int i, j, canvi;
        final int N = dades.length;
        //cerca de l'element a canviar
        i = N - 2;
        while (dades[i] > dades[i + 1]) {
            i--;
        }
        //cerca de l'element que intercamvia
        j = N - 1;
        while (dades[j] < dades[i]) {
            j--;
        }
        //intercamvi
        canvi = dades[i];
        dades[i] = dades[j];
        dades[j] = canvi;
        //reordenació del elements a la dreta de i
        for (i++, j = N - 1; i < j; i++, j--) {
            canvi = dades[i];
            dades[i] = dades[j];
            dades[j] = canvi;
        }
    }
}
