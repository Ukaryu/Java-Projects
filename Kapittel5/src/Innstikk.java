import java.util.*;

/**
 * Created by Martin on 17.09.2014.
 */
public class Innstikk {

    public static void main(String[] args) {
        Integer trekning [] = {18, 12, 1, 21, 13, 34, 7};

       /* for (int k = 0; k < trekning.length - 1; k++){

            int t = trekning[k + 1];
            int i = k;

            while (i >= 0 && trekning[i] > t){
                trekning [i + 1] = trekning [i];
                i--;
            }

            trekning [i + 1] = t;
        }

        if (trekning == null) {
            return;
        }
        int i = 0;
        int j = trekning.length - 1;
        int tmp;
        while (j > i) {
            tmp = trekning[j];
            trekning[j] = trekning[i];
            trekning[i] = tmp;
            j--;
            i++;
        }

        */

        Arrays.sort(trekning, Collections.reverseOrder());
        for (int elem:trekning){
            System.out.println(elem);
        }

    }
}
