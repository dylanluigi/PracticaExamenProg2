package Examen_Extraordinaria.Exc1;

import java.util.Scanner;

public class e1 {

    public static void main(String[] args) throws Matriu.MatriuCompleta {
        Matriu m = new Matriu(3);

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3*3; i++) {
            System.out.print("Valor: ");
            int n = s.nextInt();
            m.add(n);
            System.out.println();
        }

        System.out.println(m);
        System.out.println(m.calcularDeterminant());
    }





}
