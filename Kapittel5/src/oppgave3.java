import easyIO.*;

/**
 * Created by Martin on 07.09.2014.
 */
public class oppgave3 {

    public static void main(String[] args) {
        Out skjerm = new Out();
        In innfil = new In("vekt.txt");

        int i;
        String [] navn = new String[27];
        int [] vekt = new int[27];
        int maks;
        int min;
        double snitt;
        int sum = 0;
        int idks = 0;


        for (i = 0; i < vekt.length; i++){ //Leser inn verdien fra tekstfilen
            navn[i] = innfil.inWord();
            vekt[i] = innfil.inInt();
        }
        innfil.close();

        maks = vekt[0];
        for (i = 1; i < vekt.length; i++){ //Finner maks verdien
            if (vekt [i] > maks){
                maks = vekt [i];
                idks = i;
            }
        }

        skjerm.outln("Eleven med størst vekt er " + navn[idks] + " på " + maks + " kg.");
        skjerm.outln();

        min = vekt [0];
        for (i = 1; i < vekt.length; i++){ //Finner minste verdi
            if (vekt [i] < min){
                min = vekt [i];
                idks = i;
            }
        }

        skjerm.outln("Eleven med minst vekt er " + navn[idks] + " på " + min + " kg.");
        skjerm.outln();

        for (i = 0; i < vekt.length; i++){
            sum += vekt[i];
        }

        snitt = sum / 27;
        skjerm.outln("Gjennomsnittsvekten i klassen er " + snitt);
    }
}
