package Ejercicios_Practica.RandomAcessFile;

public class Paraula {

    public static final int MAX = 20;

    private char[] paraula;

    private int longitud;

    public Paraula(){
        paraula=new char[MAX];
        longitud=0;
    }

    public void add(char c){
        if (longitud<MAX){
            paraula[longitud]=c;
            longitud++;
        }
    }

    @Override
    public String toString(){
        String s="";
        for (int i = 0; i < longitud; i++) {
            s+=paraula[i];
        }
        return s;
    }

    public String normalize(){
        String s = "";
        for (int i = 0; i < longitud; i++) {
            s+=paraula[i];
        }
        for (int i = longitud; i <MAX ; i++) {
            s+=" ";
        }
        return s;
    }

    public int length(){return longitud;}

    public boolean equals(Paraula p){
        boolean equal = p.length()==longitud;
        for (int i = 0; i < longitud && equal; i++) {
            equal = p.getCharAt(i)==paraula[i];
        }
        return equal;
    }

    public char getCharAt(int i){return paraula[i];}

    public void extraerPalabra(String s){
        longitud = 0;
        char c = s.charAt(longitud);
        while (c!=' ' && longitud<MAX){
            paraula[longitud]=0;
            longitud++;
            c = s.charAt(longitud);
        }
    }


}
