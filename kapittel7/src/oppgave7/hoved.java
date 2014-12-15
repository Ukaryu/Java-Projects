package oppgave7;

/**
 * Created by Martin on 15.12.2014.
 */
public class hoved {
    public static void main(String[] args){
        int a [] = {10,14,13,11,15,19,18,1,2,4,6,7,8}; //1 2 4 6 7 8 10 11 13 14 15 18 19

        ineffektiv ie = new ineffektiv();

        System.out.println(ie.median(a));
    }
}
