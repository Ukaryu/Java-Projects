package oppgave7;

import java.util.*;
/**
 * Created by Martin on 15.12.2014.
 */
public class ineffektiv {
    int medi = 0;

    public int median(int a []){
        Arrays.sort(a);

        for(int i = 0; i < a.length; i++){
            for (int j = 0; j > a.length; j++){
                if (a[i] < a[j]){
                    medi = a[j];
                }
            }
        }


        return medi;
    }
}
