package Examen_Extraordinaria.Exc2;

import java.io.Serializable;

public class Assignatura implements Serializable {

    private final int CODI;

    private final String NOM;

    private final int CURS;

    private final String[] estudiants;

    private final int[] notes;

    private int nEstudiants;

    public static Assignatura centinela = new Assignatura(999,"ZZZ",999,new String[]{"XD"},new int[]{22});

    public Assignatura(int CODI, String NOM, int CURS, String[] estudiants, int[] notes){
        this.CODI = CODI;
        this.NOM = NOM;
        this.CURS = CURS;
        this.nEstudiants = estudiants.length;
        this.estudiants = estudiants;
        this.notes = notes;
    }

    public int getNota(String NIFest){
        int nota = -1;
        boolean found = false;

        for (int i = 0; i < nEstudiants && !found; i++) {
            if (NIFest.equals(estudiants[i])){
                nota = notes[i];
            }
        }
        return nota;
    }


    public int getCODI() {
        return CODI;
    }

    public String getNOM() {
        return NOM;
    }

    public int getCURS() {
        return CURS;
    }

    public int getnEstudiants() {
        return nEstudiants;
    }

    public void setnEstudiants(int nEstudiants) {
        this.nEstudiants = nEstudiants;
    }

    public boolean conte(String NIF) {

        boolean found = false;

        for (int i = 0; i < estudiants.length && !found; i++) {
            // Use .equals() to compare strings
            if (estudiants[i].equals(NIF)) {
                found = true;
            }
        }
        return found;

    }

        public boolean esCentinela() {return CODI == centinela.CODI;}
}
