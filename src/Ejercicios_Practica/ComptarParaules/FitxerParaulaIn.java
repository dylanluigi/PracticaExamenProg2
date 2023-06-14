package Ejercicios_Practica.ComptarParaules;

import java.io.*;

public class FitxerParaulaIn {

    private int x;

    private FileReader fr = null;

    public FitxerParaulaIn(String filepath) throws Exception{

        fr =  new FileReader(filepath);
        x = fr.read();

    }

    public void closeFile() throws Exception{
        fr.close();
    }

    private void principiParaula() throws Exception{
        char c = (char) x;

        while (c==' '|| c=='\n'||c=='\r'){
            x= fr.read();
            c = (char) x;
        }

    }

    public Paraula read(){

        Paraula p = new Paraula();

        char c = (char) x;
        try{

            while ((c != ' ') && (c != '\n') && (c != '\r') && (x != -1)){
                p.add(c);
                x = fr.read();
                c = (char) x;
            }

            principiParaula();

        }catch (Exception e){
            e.printStackTrace();
        }

        return p;

    }

    public boolean QuedenParaules() {
        return x != -1;
    }



}
