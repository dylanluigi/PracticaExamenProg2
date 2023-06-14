package Examen.Exc2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class e2 {

    public static class playerNotFound extends Exception{
        public playerNotFound(String s){
            super(s);
        }
    }

    public class Jugador{

        public static final int NAME_SIZE = 30;
        public static final int TEAM_SIZE = 30;
        private static final int DATA_SIZE = (Character.BYTES * NAME_SIZE)+(Character.BYTES*TEAM_SIZE)+Integer.BYTES;

        private String name,team;
        private int score;

        public Jugador(String name, String team, int score){
            this.name = name;
            this.team = team;
            this.score = score;
        }

        public static void updateScore(String name, int newScore, String pathToFile){
            try{
                RandomAccessFile raf = new RandomAccessFile(pathToFile,"rw");
                while (raf.getFilePointer()<raf.length()){

                    String readName = readString(raf,NAME_SIZE);
                    if (readName.equals(name)){
                        raf.skipBytes(Character.BYTES*TEAM_SIZE);
                        raf.write(newScore);
                    }
                    raf.skipBytes(Character.BYTES * TEAM_SIZE + Integer.BYTES);
                }
                raf.close();
                throw new playerNotFound("No se ha encontrado ningun jugador con ese nombre en el archivo!");
            }catch (playerNotFound| IOException e){
                e.printStackTrace();
            }
        }

        private static String readString(RandomAccessFile raf,int size) throws IOException {
            char[] chars = new char[size];
            for (int i = 0; i < size; i++) {
                chars[i]=raf.readChar();
            }

            return new String(chars).replace('\0',' ').trim();
        }


    }


}
