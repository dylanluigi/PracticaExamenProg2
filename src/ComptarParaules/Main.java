package ComptarParaules;

public class Main {

    public static void main(String[] args){

        try{

            FitxerParaulaIn fp = new FitxerParaulaIn("src/ComptarParaules/prova.txt");
            Paraula p;
            FreqRegistry fr = new FreqRegistry();

            while (fp.QuedenParaules()){
                p = fp.read();
                System.out.println("Paraula: " + p);
                fr.actualitza(p);
            }
            fr.sort();
            fr.write();
            fp.closeFile();

        }catch (Exception e){
            e.printStackTrace();
        }






    }

}
