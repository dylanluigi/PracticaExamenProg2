package Matrices;

public class Main {
    public static void main(String[] args) {
        Matriz a = new Matriz(3, 2);
        Matriz b = new Matriz(2, 2);
        Matriz c = new Matriz(2, 2);
        Matriz d = new Matriz(2, 2);
        Matriz e = new Matriz(2, 2);
        a.fillRandom(100);
        System.out.println("Les dades de la matriu a són: \n" + a);
        b.fillRandom(100);
        System.out.println("Les dades de la matriu b són: \n" + b);
        try {
            c.copy(b);
            System.out.println("S'assigna la matriu b a la c: \n" + c);
        } catch (Matriz.WrongDimension ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        try {
            d = Matriz.add(b, c);
            System.out.println("Suma de matrius b i c: \n" + d);
        } catch (Matriz.WrongDimension exc) {
            System.out.println("Error: " + exc.getMessage());
        }
        try {
            e = b.add(a);
            System.out.println("Suma de matrius b i a: \n" + e);
        } catch (Matriz.WrongDimension exc) {
            System.out.println("Error: " + exc.getMessage());
        }
    }
}
