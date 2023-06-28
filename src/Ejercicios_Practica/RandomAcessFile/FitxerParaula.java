package Ejercicios_Practica.RandomAcessFile;

import java.io.FileReader;

public class FitxerParaula {

    private int x;

    private FileReader fr;

    public FitxerParaula(String file) throws Exception{

        fr = new FileReader(file);
        x = fr.read();
        principiParaula();

    }

    public Paraula read() throws Exception{
        Paraula p = new Paraula();

        char c = (char) x;
        try{
            while (c!=' ' && c!='\n' && c!='\r' && quedanParaules()){
                p.add(c);
                x = fr.read();
                c = (char) x;
            }
            principiParaula();
        }catch (Exception e){

        }
        return p;


    }

    private void principiParaula() throws Exception{
        char c = (char) x;
        while (c==' '||c=='\n'||c=='\r'){
            x = fr.read();
            c= (char) x;
        }
    }

    private boolean quedanParaules(){return x!=-1;}



}
