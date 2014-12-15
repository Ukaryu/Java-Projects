import easyIO.*;

/**
 * Created by Martin on 02.11.2014.
 */
public class Akronym {
    private String akronym;
    private int antTolkning;
    private String akroTolkning [] = new String[10];


    Akronym(String akronym,String akroTolkning){
        this.akronym = akronym;
        this.akroTolkning [antTolkning]= akroTolkning;
        antTolkning = 1;

    }

    void add(String t) {
        boolean funnet = false;
        if (antTolkning < 10) {
            for (int i = 0; i < antTolkning; i++){
                if(akroTolkning[i].equals(t)){
                    funnet = true;
                }
            }
            if (!funnet){
                akroTolkning[antTolkning] = t;
                antTolkning++;
            }

        } else {
            System.out.println("For mange tolkninger av " + akronym);
        }
    }

    public void skrivData(){
        Out skjerm = new Out();

        skjerm.outln(akronym + " har følgende tolkninger:");
        for (int i = 0; i < antTolkning; i++){
            skjerm.outln(akroTolkning[i]);
        }
        skjerm.outln();

    }
}
