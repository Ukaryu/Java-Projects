package Oppgave5.e;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 * Created by Martin on 11.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        final int ANT = 100000;
        final int GRENSE = 999999;
        Random t = new Random();
        Integer[] tab = new Integer[ANT];
        HashSet<Integer> hs = new HashSet<Integer>();
        int tall = 376;
        for (int i = 0; i < ANT; i++) {
            tab[i] = tall;
            hs.add(tall);
            tall = (tall + 45713) % 1000000;
        }
        Arrays.sort(tab);

        //Genererer tilfeldige tall
        Integer[] randomNumbers = new Integer[10000];
        for (int i = 0; i < 10000; i++) {
            randomNumbers[i] = t.nextInt(GRENSE);
        }

        //Søker først gjennom 'hs', HashSet
        int hashTeller = 0;
        long hashTidStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            if (hs.contains(randomNumbers[i])) {
                hashTeller++;
            }
        }
        long hashTid = System.currentTimeMillis() - hashTidStart;

        //Søker så gjennom Integer tabellen
        int intTeller = 0;
        long intTidStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            if (Arrays.binarySearch(tab, randomNumbers[i]) >= 0) {
                intTeller++;
            }
        }

        long intTid = System.currentTimeMillis() - hashTidStart;
        System.out.println("Fant " + hashTeller + " i HashSet etter " + hashTid + "ms.\n" + "Fant " + intTeller + " i Int-tabell etter " + intTid + "ms.");
    }
}