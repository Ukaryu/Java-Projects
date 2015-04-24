package Oppgave3.a;

/**
 * Created by Martin on 19.03.2015.
 */
public class BinarySearch{

    public static boolean search(int data [],int min, int max, int target){
        System.out.println(1);
        int midpoint = (min+max) / 2;
        boolean found = false;

        if (data[midpoint] == target){
            found = true;
        } else if (data[midpoint] > target){
            if (0 <= midpoint - 1){
                found = search(data, min, midpoint - 1, target);
            }
        } else if (midpoint + 1 <= max){
            found = search(data, midpoint + 1, max, target);
        }

        return found;
    }
}
