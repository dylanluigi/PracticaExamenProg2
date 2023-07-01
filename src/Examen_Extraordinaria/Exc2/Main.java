package Examen_Extraordinaria.Exc2;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static ObjectInputStream oisEst;

    private static ObjectInputStream oisAss;

    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);
        System.out.print("NIF: ");
        String NIF = s.nextLine();

        String[] estudiants1 = {"NIF1", "NIF2"};
        int[] notes1 = {80, 90};
        Assignatura assignatura1 = new Assignatura(101, "Mathematics", 1, estudiants1, notes1);

        String[] estudiants2 = {"NIF3", "NIF4"};
        int[] notes2 = {85, 95};
        Assignatura assignatura2 = new Assignatura(102, "Physics", 1, estudiants2, notes2);

        generateAssignaturaFile("assignatures.dat", assignatura1, assignatura2);

        find(NIF);

    }

    public static void generateAssignaturaFile(String filename, Assignatura... assignaturas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            for (Assignatura assignatura : assignaturas) {
                oos.writeObject(assignatura);
            }
            oos.writeObject(Assignatura.centinela);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void find(String NIF) throws IOException, ClassNotFoundException {
        oisAss = new ObjectInputStream(new FileInputStream("assignatures.dat"));

        Assignatura ass;
        ass = (Assignatura) oisAss.readObject();

        while (!ass.esCentinela()){
            if (ass.conte(NIF)){
                System.out.println("CODI: "+ass.getCODI()+" - NOM: "+ass.getNOM()+" CURS: "+ass.getCURS()+" NOTA: "+ass.getNota(NIF));
            }
            ass = (Assignatura) oisAss.readObject();
        }

        oisAss.close();
    }




}

