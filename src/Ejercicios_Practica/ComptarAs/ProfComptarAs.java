package Ejercicios_Practica.ComptarAs;

import java.io.*;
public class ProfComptarAs {

    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("src/Serialization/Afile.txt");
            char c;
            int x;
            int n = 0;
            x = f.read();
            while (x != -1) {
                c = (char) x;
                if (c == 'a') {
                    n++;
                }
                x = f.read();
            }
            f.close();
            System.out.println("Hi havia un total de " + n + " lletres 'a'");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }



}
