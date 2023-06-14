package Ejercicios_Practica.RecorregutFitxers2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {


    public static void main(String[] args){

        try{

            FileOutputStream fos = new FileOutputStream("src/Ejercicios_Practica.RecorregutFitxers2/persones.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (int i = 0; i < 4; i++) {
                Persona p = new Persona();
                String s = llegirCadena();
                int x = llegirNum();
                p.setName(s);
                p.setCode(x);
                oos.writeObject(p);
            }

            oos.close();

            FileInputStream fis = new FileInputStream("src/Ejercicios_Practica.RecorregutFitxers2/persones.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Persona p;
            boolean eof = false;

            do {
                try{
                    p = (Persona) ois.readObject();
                    System.out.println(p);

                }catch (EOFException eofException){
                    eof=true;
                }

            }while (!eof);
            ois.close();
            System.out.println("Bye!");

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    private static String llegirCadena() {
        String s = "";
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Nom: ");
            s = in.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    private static int llegirNum() {
        int x = 0;
        try {
            String s;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Codi: ");
            s = in.readLine();
            x = Integer.parseInt(s);
        } catch (IOException e) {
        } catch (NumberFormatException e) {
        }
        return x;
    }






}
