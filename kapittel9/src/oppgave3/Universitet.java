package oppgave3;

import easyIO.*;

import java.util.HashMap;

/**
 * Created by Martin on 18.12.2014.
 */
public class Universitet {
    HashMap<String, Student> studenter = new HashMap<String, Student>();
    HashMap<String, Kurs> kurs = new HashMap<String, Kurs>();
    In tast = new In();
    Out skjerm = new Out();

    void kommandoer(){
        boolean avslutt = false;

        skjerm.outln("Skriv inn forskjellige kommandoer for å gjøre noe");
        skjerm.outln("S for legge til ny student, K for å legge til nytt kurs ved bruk av kurskode.");
        skjerm.outln("P for å legge til student med kurskode.");
        skjerm.outln("V for å se på hvile kurs en student har.");
        skjerm.outln("E for å se hvilke studenter som er på diverse kurs.");
        skjerm.outln("Q for å avslutte");
        skjerm.outln();

        while(!avslutt){


            char valg = tast.inChar();
            skjerm.outln();
            switch (Character.toUpperCase(valg)){
                case 'S' :
                    Student s = new Student(tast, skjerm);
                    studenter.put(s.navn,s);
                    break;
                case 'K' :
                    Kurs k = new Kurs(tast, skjerm);
                    kurs.put(k.kurskode, k);
                    break;
                case 'P' :
                    skjerm.outln("Skriv inn studentens navn: ");
                    String student = tast.inLine().toUpperCase();
                    skjerm.outln();
                    skjerm.outln("Skriv inn kurskoden: ");
                    String kurskode = tast.inLine().toUpperCase();

                    if (studenter.containsKey(student) && kurs.containsKey(kurskode)){

                        Student s1 = studenter.get(student);
                        Kurs k1 = kurs.get(kurskode);
                        s1.leggTilKurs(k1);
                        k1.leggTilStudent(s1);

                    } else if (studenter.containsKey(student)) {

                        Student s2 = studenter.get(student);
                        Kurs k2 = new Kurs(kurskode);
                        kurs.put(kurskode, k2);
                        s2.leggTilKurs(k2);
                        k2.leggTilStudent(s2);

                    } else if (kurs.containsKey(kurskode)){

                        Kurs k3 = kurs.get(kurskode);
                        Student s3 = new Student(student);
                        studenter.put(student, s3);
                        k3.leggTilStudent(s3);
                        s3.leggTilKurs(k3);

                    } else {

                        Student s4 = new Student(student);
                        Kurs k4 = new Kurs(kurskode);
                        studenter.put(student, s4);
                        kurs.put(kurskode, k4);
                        s4.leggTilKurs(k4);
                        k4.leggTilStudent(s4);
                    }
                    skjerm.outln("Student og kurskode lagt til.");
                    skjerm.outln();
                    break;
                case 'V' :
                    skjerm.outln("Skriv inn hvilken student du vil se nærmere på: ");
                    String student1 = tast.inLine().toUpperCase();

                    skjerm.outln();
                    skjerm.outln("Student har følgende kurs: ");
                    Student s5 = studenter.get(student1);

                    for (Kurs k5 : s5.kurs){
                        skjerm.outln(k5.kurskode);
                    }
                    skjerm.outln();
                    break;
                case 'E' :
                    skjerm.outln("Skriv inn hvilken kurskode du vil se nærmere på");
                    String kurskode2 = tast.inLine().toUpperCase();
                    skjerm.outln();
                    skjerm.outln("Studenter som tar kurset: ");
                    Kurs k6 = kurs.get(kurskode2);

                    for (Student s6 : k6.studenter){
                        skjerm.outln(s6.navn);
                    }
                    skjerm.outln();
                    break;
                case 'Q' :
                    skjerm.outln("Avslutter");
                    avslutt = true;
                    break;
            }
        }
    }

}
