package Ejercicios_Practica.Matrices;

import java.util.Random;

public class Matriz {

    private double[][] m;
    private int filas, columnas;


    public static class WrongDimension extends Exception{

        public WrongDimension(String s){
            super(s);
        }

    }

    public Matriz(int filas, int columnas){

        try{
            if(filas<=0 || columnas<=0){
                throw new WrongDimension("Error de dimensio!");
            }
            this.m=new double[filas][columnas];
            this.filas=filas;
            this.columnas=columnas;

        }catch (WrongDimension wd) {
            System.out.println(wd.getMessage());
        }
    }

    public int getFilas() {
        return this.filas;
    }

    public int getColumnas() {
        return this.columnas;
    }

    @Override
    public String toString() {
        String s = " ";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                s += m[i][j] + " ";
            }
            s += "\n ";
        }
        return s;
    }

    public void setValue(int fila, int columna, double value){
        this.m[fila][columna]=value;
    }


    public void fillRandom(int MAX){
        Random rnd = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.m[i][j]=rnd.nextInt(MAX);
            }
        }
    }

    public void copy(Matriz org) throws WrongDimension{

            if (this.filas!= org.filas || this.columnas!=org.columnas){
                throw new WrongDimension("Dimension erronea!");
            }

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    this.m[i][j]=org.m[i][j];
                }
            }
    }

    public static Matriz add(Matriz a, Matriz b) throws WrongDimension{

        if (a.filas!=b.filas || a.columnas!=b.columnas){
            throw new WrongDimension("Wrong Dimension");
        }
        Matriz res = new Matriz(a.filas,b.columnas);

        for (int i = 0; i < a.filas; i++) {
            for (int j = 0; j < a.columnas; j++) {
                res.m[i][j] = a.m[i][j]+b.m[i][j];
            }
        }
        return res;
    }

    public Matriz add(Matriz a) throws WrongDimension{

        if (this.filas!=a.filas||this.columnas!=a.columnas){
            throw new WrongDimension("Wrong Dimesnion!");
        }

        Matriz res = new Matriz(filas,columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                res.m[i][j] = this.m[i][j]+a.m[i][j];
            }
        }

        return res;


    }

    public Matriz mult(Matriz a, Matriz b) throws WrongDimension{

        if (a.columnas!=b.filas){
            throw new WrongDimension("Dimension Erronea");
        }

        Matriz res = new Matriz(a.filas, b.columnas);

        for (int i = 0; i < a.filas; i++) {
            for (int j = 0; j < b.columnas; j++) {
                res.m[i][j] = 0;
                for (int k = 0; k < a.columnas; k++) {
                    res.m[i][j]+=a.m[i][k]+b.m[k][j];
                }

            }
        }
        return  res;

    }






}
