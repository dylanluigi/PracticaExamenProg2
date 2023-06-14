package Vector;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Vector.WrongDimension {

        Vector v1 = new Vector(3);
        Vector v2 = new Vector(3);

        v1=llegirVector("Insereix els " + v1.getDimensio() + " valors del vector: ", v1.getDimensio());
        System.out.println(v1);
        v2.fillRand(100);
        System.out.println("Vector v2: " + v2);
        double m1 = v1.modul();
        String s = String.format("%.2f", m1);
        System.out.println("El mòdul de v1: " + s);
        double m2 = v2.modul();
        s = String.format("%.2f", m2);
        System.out.println("El mòdul de v2: " + s);
        double pv1 = v1.prodEsclar(v2);
        System.out.println("El prod. vectorial v1 * v2: "+pv1);
        double pv2 = v2.prodEsclar(v1);
        System.out.println("El prod. vectorial v2 * v1: "+pv2);





    }


    public static Vector llegirVector(String msg, int dimension){

        Vector v = new Vector(dimension);

        double x;

        try{

            String s;
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println(msg);
            for (int i = 0; i < dimension; i++) {

                System.out.print("Valor "+i+" del vector:");
                s=br.readLine();
                x= Double.parseDouble(s);
                v.setValue(i,x);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return v;

    }



}
