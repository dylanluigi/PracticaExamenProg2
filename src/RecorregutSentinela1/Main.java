package RecorregutSentinela1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {


    public static void main(String[] args){
        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/RecorregutSentinela1/persones.dat"));

            for (int i = 0; i < 4; i++) {
                Persona p = new Persona(llegirCadena(), llegirNum());
                oos.writeObject(p);
            }
            oos.writeObject(Persona.centinela);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/RecorregutSentinela1/persones.dat"));

            Persona p = (Persona) ois.readObject();

            while (!p.esCentinela()){
                System.out.println(p);
                p = (Persona) ois.readObject();
            }

            ois.close();
            System.out.println("Bye!");

        }catch (IOException ioException){
            ioException.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }



    private static String llegirCadena() {
        String s = "";
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Nom: ");
            s = in.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    private static int llegirNum() {
        int x = 0;
        try {
            String s;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Codi: ");
            s = in.readLine();
            x = Integer.parseInt(s);
        } catch (IOException e) {
        } catch (NumberFormatException e) {
        }
        return x;
    }
}
