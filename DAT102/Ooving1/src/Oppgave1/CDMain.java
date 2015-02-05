package Oppgave1;

/**
 * Created by Martin on 05.02.2015.
 */
public class CDMain {
    public static void main(String [] args){
        CD ny = new CD("Kid Rock","First Kiss",1999,"Album Corp.");

        CDarkiv a = new CDarkiv();
        a.leggTil(ny);
        a.sokCD("first");

        Tekstgrensesnitt t = new Tekstgrensesnitt();
        t.brukervalg();

    }
}
