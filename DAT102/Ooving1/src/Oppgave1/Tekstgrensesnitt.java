package Oppgave1;
import easyIO.*;

/**
 * Created by Martin on 05.02.2015.
 */
public class Tekstgrensesnitt {
    In tast = new In();
    Out skjerm = new Out();

    CDarkiv arkiv = new CDarkiv();

    public void brukervalg(){

        int valg = 0;
        while (valg != 9){

            skjerm.outln();
            skjerm.outln("Trykk 1 for å legge til en CD i arkivet.");
            skjerm.outln("Trykk 2 for å slette en CD fra arkivet");
            skjerm.outln("Trykk 3 for å søke etter en CD i arkivet");
            skjerm.outln("Trykk 4 for å søke etter en artist i arkivet");
            skjerm.outln("Trykk 5 for å få antall CDer i arkivet");
            skjerm.outln("Trykk 9 for å avslutte");
            skjerm.outln();
            valg = tast.inInt();

               switch (valg){
                   case 1 :
                       skjerm.outln("Vennligst skriv inn informasjon om CDen du ønsker å legge til: ");

                       skjerm.out("Artistnavn: ");
                       String artist = tast.inLine();

                       skjerm.out("CD Tittel: ");
                       String tittel = tast.inLine();

                       skjerm.out("Lanseringsår: ");
                       int lansering = tast.inInt();

                       skjerm.out("Plateselskap: ");
                       String plateselskap = tast.inLine();

                       CD ny = new CD(artist,tittel,lansering,plateselskap);
                       arkiv.leggTil(ny);
                       break;

                   case 2 :
                       skjerm.out("Skriv inn CDen du ønsker å slette: ");
                       String CD = tast.inLine();
                       arkiv.slettCD(CD);
                       break;

                   case 3 :
                       skjerm.out("Søk etter en CD i arkivet: ");
                       CD = tast.inLine();
                       sokCd(CD);
                       break;

                   case 4 :
                       skjerm.out("Søk etter en artist i arkivet: ");
                       String aartist = tast.inLine();
                       sokArtist(aartist);
                       break;

               }
        }
    }

    public void sokCd(String CD){
        arkiv.sokCD(CD);
    }

    public void sokArtist(String artist){
        arkiv.sokArtist(artist);
    }
}
