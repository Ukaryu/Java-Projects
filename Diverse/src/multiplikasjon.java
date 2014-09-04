import easyIO.*;

/**
 * Created by Martin on 01.09.2014.
 */
class multiplikasjon {
    public static void main(String[] args) {
        Out skjerm = new Out();
        In tast = new In();
        int maks;


        do {
            skjerm.out("Skriv inn heltall mellom 1 og 20: ");
            maks = tast.inInt();
            if (maks >= 1 && maks <= 20) {
                // skriver først overskriften
                skjerm.out("   ");
                for (int i = 1; i <= maks; i++) {
                    skjerm.out(i,4);
                }
                skjerm.outln();
                skjerm.out("---");
                for (int i = 1; i <= maks;i++) {
                    skjerm.out("----");
                }
                skjerm.outln();
                // så skriver vi tabellen
                for (int i = 1; i <= maks; i++) {
                    skjerm.out(i,2);
                    skjerm.out("|");
                    for (int j = 1; j <= maks; j++) {
                        if ( j < i ) {
                            skjerm.out("    ");
                        } else {
                            skjerm.out(i*j,4);
                        }
                    }
                    skjerm.outln();
                }
                skjerm.outln();
            } else {
                skjerm.outln("Feil tall oppgitt: " + maks);
                skjerm.outln();
                skjerm.out("Ønsker du å starte på nytt?(ja/nei): ");

                String svar = tast.inLine().toLowerCase();
                if (svar.equals("ja")){
                    maks = 1;
                    skjerm.outln();
                } else {
                    maks = 0;
                }
            }
        } while (maks != 0);

    }
}

