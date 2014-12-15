package oppgave7;

/**
 * Created by Martin on 15.12.2014.
 */
public class hoved {
    //Mest sannsynlig feil framgangsmåte på denne oppgaven, til tross for korrekt svar
    public static void main(String[] args){
        int a [] = {10,14,13,11,15,19,12,16,18,1,2,4,6,7}; //1 2 4 6 7 10 11 12 13 14 15 16 18 19

        ineffektiv ie = new ineffektiv();

        System.out.println(ie.median(a));
    }
}
