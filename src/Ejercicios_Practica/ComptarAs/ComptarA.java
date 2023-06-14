package Ejercicios_Practica.ComptarAs;

import java.io.*;

public class ComptarA {

    public static void main(String[] args){

        try {

            FileReader fr = new FileReader("src/Serialization/Afile.txt");

            char c;
            int total = 0;
            int intc;

            while ((intc=fr.read())!=-1){

                c = (char) intc;

                if (c=='a'){
                    total++;
                }

            }

            fr.close();
            System.out.println("Hi ha un total de "+total+" a's");




        }catch (Exception e){
            e.printStackTrace();
        }





    }



}
