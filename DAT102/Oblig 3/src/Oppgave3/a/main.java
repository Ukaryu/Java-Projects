package Oppgave3.a;

/**
 * Created by Martin on 19.03.2015.
 */
public class main {

    public static void main(String [] args){

        int data [] = {2, 4, 5, 7, 8, 10, 12, 15, 18, 21, 23, 27, 29, 30, 31};
        int target = 2;

        System.out.println(BinarySearch.search(data, 0, data.length - 1, target));

    }

}
