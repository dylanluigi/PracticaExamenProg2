package Examen_Extraordinaria.Exc2;

import java.io.Serializable;
import java.util.Objects;

public class Estudiant implements Serializable {

    //Declaracio de variables privadas
    private final String NIF;
    private final String NOM;
    private int curs;

    //Sentinela
    public static Estudiant estudiant = new Estudiant("999","ZZZ",999);

    public Estudiant(String NIF, String NOM, int curs){
        this.NIF = NIF;
        this.NOM = NOM;
        this.curs = curs;
    }

    public String getNIF() {
        return NIF;
    }

    public String getNOM() {
        return NOM;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public boolean isSentinela(){return Objects.equals(NOM, estudiant.getNOM());}




}
