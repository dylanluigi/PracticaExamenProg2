package ComptarParaules;

public class FreqRegistry {


    private int MAX = 100000;
    private Paraula[] ps;
    private int[] freq;
    private int num;


    public FreqRegistry(){
        ps = new Paraula[MAX];
        freq = new int[MAX];
        num = 0;
    }

    public void actualitza(Paraula p){
        int i = 0;

        ps[num]=p;
        while (!p.equals(ps[i])){
            i++;
        }
        if (i<num){
            freq[i]++;
        }else{
            freq[num]=1;
            num++;
        }
    }

    public void sort() {
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (freq[j] < freq[j+1]) {
                    // Swap freq[j] and freq[j+1]
                    int tempFreq = freq[j];
                    freq[j] = freq[j+1];
                    freq[j+1] = tempFreq;

                    // Swap ps[j] and ps[j+1]
                    Paraula tempParaula = ps[j];
                    ps[j] = ps[j+1];
                    ps[j+1] = tempParaula;
                }
            }
        }
    }

    public void write(){
        for (int i = 0; i < num; i++) {
            System.out.println("La paraula "+ps[i]+" apareix "+freq[i]+" vegades.");
        }

    }






}
