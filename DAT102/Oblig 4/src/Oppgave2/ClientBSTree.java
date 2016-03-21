package Oppgave2;

/**
 * Created by Martin on 29.04.2015.
 */

import java.util.*;

public class ClientBSTree {
    public static void main (String [] args){

        final int NODES = 4096;
        Random random = new Random();
        int heigths [] = new int [100];

        KjedetBinaerSokeTre<Integer> tree = new KjedetBinaerSokeTre<Integer>();

        for (int i = 0; i < 100; i++){

            tree = new KjedetBinaerSokeTre<Integer>();

            for (int j = 0; j < NODES; j++) {
                Integer element = new Integer(random.nextInt(30));
                tree.leggTil(element);
            }

            heigths [i] = tree.showHeight();


        }



        System.out.println("Tree with  " + NODES + " nodes.");

        tree.visInorden();

        /***********************************************/

        System.out.println();
        System.out.println("The minimal theoretical height of the tree is " + tree.findMinimalHeight(NODES));

        /***********************************************/

        System.out.println();
        System.out.println("The maximum theoretical height of the tree is " + (NODES -1));

        /***********************************************/

        System.out.println();
        System.out.println("Smallest height was " + tree.findSmallestHeight(heigths));

        /***********************************************/

        System.out.println();
        System.out.println("Largest height was " + tree.findLargestHeight(heigths));

        /***********************************************/

        System.out.println();
        System.out.println("Average height of all " + heigths.length + " trees was " + tree.findAverageHeight(heigths));





    }
}
