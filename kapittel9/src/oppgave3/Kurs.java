package oppgave3;

import easyIO.*;

import java.util.ArrayList;

/**
 * Created by Martin on 18.12.2014.
 */
public class Kurs {
    String kurskode;
    String kursnavn;
    ArrayList<Student> studenter = new ArrayList<Student>();

    Kurs(String kurskode){
        this.kurskode = kurskode;
    }

    Kurs(In tast, Out skjerm){
        skjerm.outln("Skriv inn kurskode: ");
        kurskode = tast.inLine().toUpperCase();
        skjerm.outln();
    }

    void leggTilStudent(Student s){
        studenter.add(s);
    }
}
