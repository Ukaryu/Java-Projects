package oppgave2;

import easyIO.In;

import java.util.HashMap;

/**
 * Created by Martin on 02.11.2014.
 */
public class Hoved {
    static HashMap<String, Akronym> tolkninger;

    public static void main(String[] args) {
        tolkninger = new HashMap<String, Akronym>();

        byggRegister();

        brukerdialog();

    }

    static void byggRegister() {
        In fil = new In("akronymer.txt");
        while (!fil.endOfFile()) {

            // leser akronymet og tolkningen
            String akro = fil.inWord();
            String tolkning = fil.inLine().trim();

            // sjekker om akronymet er registrert tidligere
            if (tolkninger.containsKey(akro)) {

                // vi skal nå legge til en ny tolkning
                Akronym a = tolkninger.get(akro);
                a.add(tolkning);

            } else {
                // vi lager et nytt Akronym-objekt
                Akronym ny = new Akronym(akro, tolkning);

                // vi legger det inn i akronym-registeret
                tolkninger.put(akro, ny);
            }
        }
        fil.close();
    }

    static void brukerdialog() {
        In tastatur = new In();
        String svar;
        do {
            System.out.print("Skriv inn et akronym (avslutt med -): ");
            svar = tastatur.inLine();
            svar = svar.trim();
            svar = svar.toUpperCase();
            if (tolkninger.containsKey(svar)) {
                Akronym a = tolkninger.get(svar);
                a.skrivData();
            } else if (!svar.equals("-")){
                System.out.println(svar + " fins ikke i akronymregisteret.");
            }
        } while (!svar.equals("-"));
    }
}
