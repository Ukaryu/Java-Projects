import easyIO.*;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Martin on 02.11.2014.
 */
public class Redundant2{
    static HashMap<String,Akronym> tolkninger;
    public static void main(String[] args) {
        In innfil = new In("akronymer.txt");
        In tast = new In();
        Out skjerm = new Out();

        String akronym;
        String akroArray [] = new String[1694];
        String akroTolkning [] = new String[10];
        String akronymer [] = new String[847];

        tolkninger = new HashMap<String, Akronym>();

        for (int j = 0; j < akroArray.length; j++){
            akroArray [j] = innfil.inWord();
            j++;
            akroArray [j] = innfil.readLine();
        }

        int tolk = 0;
        int i = 0;


        while(tolk < akroArray.length){
            akronymer[i] = akroArray[tolk];

            i++;
            tolk += 2;
        }

        for (int t = 0; t < akronymer.length; t++){
            int s = 0;

            akronym = akronymer[t];
            String tolkning;

            for (int h = 0; h < akroArray.length; h++) {
                if (akronym.equals(akroArray[h])) {

                    tolkning = akroArray[h + 1].trim();
                    if (tolkninger.containsKey(akronym)) {

                        // vi skal nå legge til en ny tolkning
                        Akronym a = tolkninger.get(akronym);
                        a.add(tolkning);

                    } else {
                        // vi lager et nytt Akronym-objekt
                        Akronym ny = new Akronym(akronym, tolkning);

                        // vi legger det inn i akronym-registeret
                        tolkninger.put(akronym, ny);
                    }
                }
            }

        }

        dialog();
    }

    static void dialog (){
        Out skjerm = new Out();
        In tast = new In();

        String akro;

        do {
            skjerm.outln("Skriv inn hvilket akronym du ønsker å søke på (avslutt med '-': ");
            akro = tast.inWord().trim().toUpperCase();
            Akronym as = tolkninger.get(akro);
            as.skrivData();
        } while (!akro.equals("-"));

    }
}