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
            skjerm.outln("Skriv inn tallene for å velge funksjonen du ønsker å bruke");
            skjerm.outln("1 for å legge til en CD i arkivet.");
            skjerm.outln("2 for å slette en CD fra arkivet");
            skjerm.outln("3 for å søke etter en CD i arkivet");
            skjerm.outln("4 for å søke etter en artist i arkivet");
            skjerm.outln("5 for å få antall CDer i arkivet");
            skjerm.outln("9 for å avslutte");
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

                       skjerm.out("Sjanger for platen. '0' for pop, '1' for rock, '2' for opera, og '3' for klassisk: ");
                       int sjanger = tast.inInt();

                       skjerm.out("Plateselskap: ");
                       String plateselskap = tast.inLine();

                       CD ny = new CD(artist,tittel,lansering,sjanger,plateselskap);
                       arkiv.leggTil(ny);
                       break;

                   case 2 :
                       skjerm.out("Skriv inn CDen du ønsker å slette: ");
                       String CD = tast.inLine();
                       arkiv.slettCD(CD);
                       break;

                   case 3 :
                       sokCd();
                       break;

                   case 4 :
                       sokArtist();
                       break;

                   case 5 :
                       antallCD();
                       break;

                   case 6 :
                       skjerm.out("Vennligst skriv inn det du ønsker å kalle arkivet: ");
                       String navnArkiv = tast.inLine();
                       Fil f = new Fil(navnArkiv,arkiv.samling);
                       f.skrivUt();

               }
        }
    }

    public void sokCd(){
        skjerm.out("Søk etter en CD i arkivet: ");
        String CD = tast.inLine();
        arkiv.sokCD(CD);
    }

    public void sokArtist(){
        skjerm.out("Søk etter en artist i arkivet: ");
        String artist = tast.inLine();
        arkiv.sokArtist(artist);
    }

    public void antallCD(){
        int pop = 0;
        int rock = 0;
        int opera = 0;
        int klassisk = 0;

        skjerm.outln("Antall CDer i arkivet er : " + arkiv.antallCD());
        try{
            for (CD elem : arkiv.samling){
                if (elem.besSjanger.equals("Pop")){
                    pop++;
                } else if(elem.besSjanger.equals("Rock")){
                    rock++;
                } else if (elem.besSjanger.equals("Opera")){
                    opera++;
                } else if (elem.besSjanger.equals("Klassisk")){
                    klassisk++;
                }
            }


        } catch (NullPointerException e){

        } finally {
            skjerm.outln("Av de CDene så er: ");
            skjerm.outln(pop + " pop");
            skjerm.outln(rock + " rock");
            skjerm.outln(opera + " opera");
            skjerm.outln(klassisk + " klassisk");
        }








    }
}
