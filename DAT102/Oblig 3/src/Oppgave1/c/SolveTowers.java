package Oppgave1.c;

/**
 * Created by Martin on 19.03.2015.
 */
public class SolveTowers {

    public static void main(String [] args){

        int disks = 20;

        TowersOfHanoi towers = new TowersOfHanoi(disks);

        long start = System.currentTimeMillis();
        towers.solve();
        long elapsedTimeMillis = System.currentTimeMillis()-start;

        float elapsedTimeSeconds = elapsedTimeMillis/1000;

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Time used to solve Tower of Hanoi with " + disks + " disks in milliseconds");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(elapsedTimeMillis);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Time used to solve Tower of Hanoi with " + disks + " disks in seconds");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(elapsedTimeSeconds);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Moves needed to solve Tower of Hanoi with " + disks + " disks");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(towers.getMovement());
    }
}
