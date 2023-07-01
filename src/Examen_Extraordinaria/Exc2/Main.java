package Examen_Extraordinaria.Exc2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Main {

    private static ObjectInputStream oisEst;

    private static ObjectInputStream oisAss;

    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        System.out.print("NIF: ");
        String NIF = s.nextLine();
        find(NIF);

    }


    public static void find(String NIF) throws IOException, ClassNotFoundException {

        oisEst = new ObjectInputStream(new FileInputStream("estudiants.dat"));
        oisAss = new ObjectInputStream(new FileInputStream("assignatures.dat"));

        Estudiant est;
        est = (Estudiant) oisEst.readObject();
        boolean found = false;

        while (!est.isSentinela() && !found){
            if (est.getNIF().equals(NIF)){
                found = true;
            }
        }

        if (found){

            Assignatura ass;
            ass = (Assignatura) oisAss.readObject();

            while (!ass.esCentinela()){
                if (ass.conte(NIF)){
                    System.out.println("CODI: "+ass.getCODI()+" - NOM: "+ass.getNOM()+" CURS: "+ass.getCURS()+" NOTA: "+ass.getNota(NIF));
                }
            }

        }

    }



}

