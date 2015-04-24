package Oppgave1.a;

/**
 * Created by Martin on 19.03.2015.
 */
public class Rekursjon {

    public int sum(int n){

        int result;
        if (n == 1){
            result = 1;
        } else{
            result = n + sum(n-1);
        }
        return result;

    }

}
