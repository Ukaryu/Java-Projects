package oppgave7;

import java.util.*;
/**
 * Created by Martin on 15.12.2014.
 */
public class ineffektiv {
    int medi = 0;

    public int median(int a []){
        //Sorterer listen i stigende rekkefølge
        Arrays.sort(a);

        //sjekker om listen har en lengde som er oddetall
        if (!(a.length % 2 == 0)){
            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < a.length/2+1; j++){

                    if (a[i] < a[j]){
                        medi = a[j];
                    }
                }
            }
        }

        //sjekker om listen har en lengde som er partall
        if (a.length % 2 == 0){
            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < a.length/2; j++){

                    if (a[i] < a[j]){
                        medi = (a[j]+a[j + 1])/2;
                    }
                }
            }
        }


        return medi;
    }
}
