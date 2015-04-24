package Oppgave4;

import java.util.Random;

/**
 * Created by Martin on 20.03.2015.
 */
public class main {

    public static void main(String [] args){

        int min = 0;
        int max = 32000;
        int i = 0;
        int measurements = 20;
        long average = 0;

        Random rand = new Random();

        System.out.printf("%n %s","---------------------------------------------------------------------------------------------");
        System.out.printf("%n %s", "Result of Quicksort");
        System.out.printf("%n %s","---------------------------------------------------------------------------------------------");
        System.out.printf("%n %-8s %-27s %-17s %s", "N", "Number of Measurements", "Average time", "Theoretical time (1.4*10^-7*(N*log2N");
        System.out.printf("%n %s","---------------------------------------------------------------------------------------------");

        while(!(i == 21)){

            Integer list [] = new Integer[max + 1];

            for (int j = 0; j < list.length; j++){
                list[j] = rand.nextInt(1000);
            }

            for (i = 0; i < measurements; i++){

                SorteringOgSoking ss = new SorteringOgSoking();
                long start = System.nanoTime();
                ss.kvikkSort(list, min, max);
                average += System.nanoTime()-start;
            }

            average = average / measurements;
            double averageSeconds = (double)average/1000000000;
            double theoreticalTime = (1.4*Math.pow(10,-7))*max*(Math.log(max)/Math.log(2));
            System.out.printf("%n %-18s %-19s %-25f %-7f",max,measurements,averageSeconds,theoreticalTime);

            if (max == 32000){
                max = 64000;
                average = 0;
            } else if (max == 64000){
                max = 128000;
                average = 0;
            } else {
                i = 21;
            }


        }

        System.out.printf("%n %s","---------------------------------------------------------------------------------------------");
        System.out.printf("%n %s", "Result of Merge Sort");
        System.out.printf("%n %s","---------------------------------------------------------------------------------------------");
        System.out.printf("%n %-8s %-27s %-17s %s", "N", "Number of Measurements", "Average time", "Theoretical time (5.1*10^-7*(N*log2N");
        System.out.printf("%n %s","---------------------------------------------------------------------------------------------");

        i = 0;
        max = 32000;

        while(!(i == 21)){

            Integer list [] = new Integer[max + 1];

            for (int j = 0; j < list.length; j++){
                list[j] = rand.nextInt(1000);
            }

            for (i = 0; i < measurements; i++){

                SorteringOgSoking ss = new SorteringOgSoking();
                long start = System.nanoTime();
                ss.fletteSort(list, min, max);
                average += System.nanoTime()-start;
            }

            average = average / measurements;
            double averageSeconds = (double)average/1000000000;
            double theoreticalTime = (5.1*Math.pow(10,-7))*max*(Math.log(max)/Math.log(2));

            System.out.printf("%n %-18s %-19s %-25f %-7f",max,measurements,averageSeconds,theoreticalTime);

            if (max == 32000){
                max = 64000;
                average = 0;
            } else if (max == 64000){
                max = 128000;
                average = 0;
            } else {
                i = 21;
            }


        }



    }

}
