package Oppgave1.b;

/**
 * Created by Martin on 19.03.2015.
 */
public class main {

    public static void main (String [] args){

        Sequence s = new Sequence();

        System.out.println("---------------------------------");
        System.out.println("First ten numbers in the sequence");
        System.out.println("---------------------------------");

        for (int i = 0; i < 11; i++){
            System.out.println( s.sum(i));
        }

    }

}
