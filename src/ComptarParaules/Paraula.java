package ComptarParaules;

public class Paraula {


    private char[] p;
    private int longitud;

    private final int MAX = 200;

    public Paraula(){
        p = new char[MAX];
        longitud = 0;
    }

    public Paraula(char[] paraula){
        p = paraula;
        longitud = paraula.length;
    }

    @Override
    public String toString(){
        String str = "";
        for (int i = 0; i < longitud; i++) {
            str+=p[i];
        }
        return str;
    }

    public void add(char c){

        if(longitud<MAX){
            p[longitud]=c;
            longitud++;
        }
    }

    public boolean equals(Paraula paraula){
        int i = 0;
        while (p[i] == paraula.p[i] && i<longitud){
            i++;
        }
        return p[i]==paraula.p[i];
    }

    public boolean isNull(){
        return longitud==0;
    }



}
