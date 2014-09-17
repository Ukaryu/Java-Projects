import easyIO.*;

public class Innlesning {

    public static void main(String[] args) {
        // Lese inn fil til en array og manipulere String

        String brukerString = "";
        Out skjerm = new Out();
        In tast = new In();
        In innfil = new In("Innlesning.txt");
		
		/* Leser inn fil */
        int antallOrd = innfil.inInt();
        String[] ord = new String[antallOrd];

        for (int i = 0; innfil.hasNext(); i++)
            ord[i] = innfil.inWord();
		
		/* Skriver ut filinnholdet */
        skjerm.outln(antallOrd);
        for (String linje : ord)
            skjerm.outln(linje);
        skjerm.outln();
		
		/* Leser inn fra bruker */
        skjerm.out("Skriv inn tekst: ");
        brukerString = tast.inWord();
		
		/* Finner ord[] som matcher brukerString */
        int antallLike = 0;
        for (int i = 0; i < ord.length; i++)
            if (brukerString.contains(ord[i]))
                antallLike++;
        skjerm.outln("Antall like ord er " + antallLike);
		
		/* Går gjennom tabellen og skriver ut de midterste tegnene i hver streng med bestemte regler.*/
        for (int i = 0; i < antallOrd; i++) {
			/* Hvis strengen inneholder bare et tegn
			 * skriver ut hele strengen*/
            if (ord[i].length() == 1)
                skjerm.outln(ord[i]);
			
			/* Hvis lengden er jevn
			 * skriver ut de 2 midterste tegnene */
            else if (ord[i].length() % 2 == 0)
                skjerm.outln(ord[i].substring((ord[i].length() / 2) - 1, (ord[i].length() / 2) + 1));
			
			/* Hvis lengden har odd lengde
			 * skriver ut de 3 midterste tegnene */
            else if ((ord[i].length() % 2 != 0) && (ord[i].length() > 3))
                skjerm.outln(ord[i].substring(ord[i].length() / 2 - 1, ord[i].length() / 2 + 2));
            else if (ord[i].length() == 3)
                skjerm.outln(ord[i]);
        }

    }

}