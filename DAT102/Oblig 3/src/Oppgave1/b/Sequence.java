package Oppgave1.b;

/**
 * Created by Martin on 19.03.2015.
 */
public class Sequence {

    public int sum(int n){

        int result = 0;

        if (n == 1){
            result = 5;
        } else if (n == 0){
            result = 2;
        } else if (n > 1){
            result = (5 * sum(n-1)) - (6 * sum(n-2)) + 2;
        }

        return result;

    }

}
