package Ejercicios_Practica.Vector;


import java.util.Random;

public class Vector {

    public static class WrongDimension extends Exception{
        public WrongDimension (String s){
            super(s);
        }
    }


    private double[] dimensio;

    public Vector(int dimensio){
        this.dimensio=new double[dimensio];
    }

    public int getDimensio() {
        return dimensio.length;
    }

    @Override
    public String toString() {
        String s = "(";
        for (int i = 0; i < dimensio.length; i++) {
            s += dimensio[i] + " ";
        }
        return s + ")";
    }

    public double modul(){
        double s =0;

        for (int i = 0; i < dimensio.length; i++) {
            s+=dimensio[i]*dimensio[i];
        }
        return Math.sqrt(s);
    }

    public void setValue(int index, double value){
        this.dimensio[index]=value;
    }

    public void fillRand(int MAX){
        Random rnd = new Random();

        for (int i = 0; i < this.dimensio.length; i++) {
            this.dimensio[i]=rnd.nextInt(MAX);
        }
    }

    public double prodEsclar(Vector v) throws WrongDimension {
        if (this.dimensio.length!=v.dimensio.length){
            throw new WrongDimension("Wrong dimension");
        }
            double s = 0;
            for (int i = 0; i < dimensio.length; i++) {

                s+=dimensio[i]*v.dimensio[i];

            }


        return Math.sqrt(s);

    }





}
