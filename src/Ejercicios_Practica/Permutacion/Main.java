package Ejercicios_Practica.Permutacion;

public class Main {
    public static void main(String[] args) {
        Permutacio p = new Permutacio(4);
        p.primeraPermutacio();
        while (!p.darreraPermutacio()) {
            System.out.println(p);
            p.seguentPermutacio();
        }
        System.out.println(p);
    }
}
