package oppgave3;

import easyIO.*;

import java.util.ArrayList;

/**
 * Created by Martin on 18.12.2014.
 */
public class Student {
    String navn;
    ArrayList<Kurs> kurs = new ArrayList<Kurs>();

    Student(String navn){
        this.navn = navn;
    }

    Student(In tast, Out skjerm){
        skjerm.outln("Skriv inn studentens navn: ");
        navn = tast.inLine().toUpperCase();
        skjerm.outln();
    }

    void leggTilKurs(Kurs k){
        kurs.add(k);
    }

}
