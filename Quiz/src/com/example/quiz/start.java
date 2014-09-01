package com.example.quiz;

import easyIO.*;

/**
 * Created by Martin on 28.08.2014.
 */
public class start {
    public static void main(String[] args) {
        In tast = new In();
        Out skjerm = new Out();
        int poeng = 0;

        skjerm.outln("The Almost-Ultimate Quiz");
        skjerm.outln();



        skjerm.out("Hva er hovedstaden i Japan?: ");
        String hovedstad = tast.inLine().toLowerCase();
        if (hovedstad.equals("tokyo")) {  //Sammenligner string variabelen med brukers svar
            skjerm.outln("Korrekt");
            poeng++;
        } else {
            skjerm.outln("Svaret er ikke korrekt");
        }
        skjerm.outln();


        skjerm.out("Hvor mange spørsmål har du svart på hittil?: ");
        int sporsmaal = tast.inInt();
        if (sporsmaal == 1) {
            skjerm.outln("Korrekt");
            poeng++;
        } else {
            skjerm.outln("Seriøst?");
        }
        skjerm.outln();


        skjerm.out("Hva heter kongen av Norge?: ");
        String kongen = tast.inLine().toLowerCase();
        if (kongen.equals("harald")) {
            skjerm.outln("Korrekt");
            poeng++;
        } else {
            skjerm.outln("Dårligt");
        }
        skjerm.outln();


        skjerm.out("Hva er hundens latinske navn?: ");
        String latin = tast.inLine().toLowerCase();
        if (latin.equals("canis lupus familiaris")) {
            skjerm.outln("Meget bra");
            poeng++;
            poeng++;
        } else {
            skjerm.outln("Close, but no cigar, more like completely opposite direction of it");
        }
        skjerm.outln();


        skjerm.out("Hva heter HiB på engelsk?: ");
        String hib = tast.inLine().toLowerCase();
        if (hib.equals("bergen university college")) {
            skjerm.outln("Korrekt");
            poeng++;
        } else {
            skjerm.outln("Dårligt");

        }
        skjerm.outln();


        skjerm.outln("Din totale poengsum er " + poeng + " ut av maks 6");
        skjerm.outln();
        if (poeng == 6){
            skjerm.outln("Full pott, you make me proud son");
        } else if (poeng >= 4) {
            skjerm.outln("Du kan sikkert gjøre bedre, kanskje");
        } else if (poeng >= 2) {
            skjerm.outln("Meget bra, just kidding, du sugde");
        } else {
            skjerm.outln("Eg har ikje ord...");
        }

    }
}
