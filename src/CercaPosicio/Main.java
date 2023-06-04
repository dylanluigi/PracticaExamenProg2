package CercaPosicio;

import ComptarParaules.Paraula;

import java.io.*;

public class Main {

    private static class PosicionIncorrectaException extends Exception{};


    public static void main(String[] args){

        int position = llegirEnter("Insereix posicio: ");
        cerca("src/CercaPosicio/persones.dat", position);


    }

    private static void cerca(String filename,int position){

        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));

            oos.writeObject(new Persona("Hola",202));
            oos.writeObject(new Persona("Como",201));
            oos.writeObject(new Persona("Estas",203));
            oos.writeObject(Persona.centinela);
            oos.close();



            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            if (position<=0){
                throw new PosicionIncorrectaException();
            }
            int x = 1;
            Persona p = (Persona) ois.readObject();
            while (!p.esCentinela() && x<position){
                p = (Persona) ois.readObject();
                x++;
            }
            if (!p.esCentinela() && x==position){
                System.out.println("Registry: " + p);
            }else {
                System.out.println("Error");
            }

        }catch (PosicionIncorrectaException e){
            System.out.println("Posicio inexsistent");
        }catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }

    }



    private static int llegirEnter(String msg) {
        int x = 0;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(msg);
            String s = in.readLine();
            x = Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return x;
    }

}
