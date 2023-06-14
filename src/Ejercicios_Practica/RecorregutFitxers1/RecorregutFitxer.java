package Ejercicios_Practica.RecorregutFitxers1;

import java.io.*;

public class RecorregutFitxer {


    public static void main(String[] args){

        try {

            Persona p = new Persona();
            String s;
            FileInputStream fp;
            BufferedReader br;

            fp = new FileInputStream("src/Ejercicios_Practica.RecorregutFitxers1/persones2.dat");
            br = new BufferedReader(new InputStreamReader(fp));
            s = br.readLine();

            while (s!=null){

                p.setName(s);
                p.setCode(Integer.parseInt(br.readLine()));
                System.out.println(p);
                s = br.readLine();
            }

            br.close();
            System.out.println("Bye!");





        }catch (Exception e){

            e.printStackTrace();

        }

    }







}
