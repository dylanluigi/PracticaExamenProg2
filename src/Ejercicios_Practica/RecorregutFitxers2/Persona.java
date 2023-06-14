package Ejercicios_Practica.RecorregutFitxers2;

import java.io.Serial;
import java.io.Serializable;

public class Persona implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;
    private String name;

    private int code;


    public Persona(){
        name=null;
        code = 0;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
