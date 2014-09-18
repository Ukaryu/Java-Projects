import easyIO.*;

import java.util.Arrays;

/**
 * Created by Martin on 18.09.2014.
 */
public class oppgave3 {
    public static void main(String[] args) {
        Tekst t = new Tekst();

        Sortert s = new Sortert();

        alfSort as = new alfSort();

        alfString a = new alfString();
    }



}

class Tekst {

    Tekst(){
        Out skjerm = new Out();
        In tast = new In();

        skjerm.outln("Skriv in setningen som skal reverseres: ");
        String s = tast.inLine();
        String ny = "";

        for(int i = s.length()-1; i >= 0; i--){
             ny+= s.charAt(i);
        }
        skjerm.outln(ny);
    }
}

class Sortert{
    Sortert(){
        Out skjerm = new Out();

        int heltall [] = {3,5,6,7,8,100};
        boolean sort = true;

        for (int i = 0; i < heltall.length - 1 && sort; i++){

            if (heltall[i] < heltall[i + 1]){
                sort = true;
            } else{
                sort = false;
            }
        }

        skjerm.outln();
        if(sort){
            skjerm.outln("Tabellen er sortert i stigende rekkefølge");
        } else{
            skjerm.outln("Tabellen er ikke sortert i stigende rekkefølge");
        }
    }
}

class alfSort{
    alfSort(){
        Out skjerm = new Out();

        String setninger [] = {"sopp","bjørn","zwitter","nitram", "abs"};

        Arrays.sort(setninger);
        skjerm.outln();
        skjerm.outln("Ordet som kommer først alfabetisk i tabellen ved bruk av .sort metoden er: " + setninger[0]);
    }
}

class alfString {
    alfString(){
        Out skjerm = new Out();

        String setninger [] = {"sopp","bjørn","zwitter","nitram", "abs"};
        String første = setninger[0];

        for (int i = 0; i < setninger.length; i++){

            if (første.compareToIgnoreCase(setninger[i]) > 0){
                første = setninger[i];
            }
        }

        Arrays.sort(setninger);
        første = setninger[0];
        skjerm.outln();
        skjerm.outln("Ordet som kommer først alfabetisk i tabellen er: " + første);
    }
}
