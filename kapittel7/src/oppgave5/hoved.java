package oppgave5;

/**
 * Created by Martin on 15.12.2014.
 */
public class hoved {
    public static void main(String[] args){
        metodeTest mt = new metodeTest();

        mt.m1(10);

        /*
        * På de fire første resultatene så får du en demonstrasjon av at metode m1 skriver ut hvilken metode som behandles
        * og hva int k er. Videre så trekker metoden fra 1 av int k, og kaller
        * så på metode m2 som gjør akkurat det samme som m1.Samme for m3. Til slutt blir m4 kalt ifra m3,
        * som bare trekker fra 1 av int k når man følger deloppgave a.
        * I deloppgave b legger man til en if funksjon i m4 som sjekker om k er større enn 0. Ved bruk av k = 10 så ser
        * man at siste resultatet som blir skrevet ut er -1 og er i metode m4. For å forhindre negative tall så burde
        * plassere kommandoen som trekker fra k under if funksjonen slik at det blir vurdert om k > 0 før man trekker
        * ifra. Det ville ha vært optimalt å gjøre dette på alle andre metoder i tilfelle k = 2 for eksempel.
        * */
    }
}
