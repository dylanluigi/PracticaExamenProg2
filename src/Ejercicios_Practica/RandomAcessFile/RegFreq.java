package Ejercicios_Practica.RandomAcessFile;

import java.io.File;
import java.io.RandomAccessFile;

public class RegFreq {

    private static final int MIDA_DEL_REGISTRO = (Paraula.MAX*2)+4;

    private static File file = new File("RegFreq.dat");

    private RandomAccessFile raf;


    public RegFreq() throws Exception{
        raf = new RandomAccessFile(file,"rw");

    }


}
