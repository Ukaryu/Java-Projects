package Oppgave4;//package no.hib.dat102.liste.kjedet;

//import no.hib.dat102.liste.adt.OrdnetListeADT;

import Oppgave5.KjedetListe;
import Oppgave5.LinearNode;

/**
 * Kjedet ordnet liste.
 *
 * @param <T> elementtypen
 */
public class KjedetOrdnetListe<T extends Comparable<T>> extends KjedetListe<T> implements OrdnetListeADT<T> {
//Mangler  konstrukt�r
    @Override
    public void leggTil(T element) {

        LinearNode<T> ny = new LinearNode<T>(element);
        

        // Finn rett posisjon for nytt element
       //Fyll ut...
        antall++;
    }

    //
    // Implementerer de to abstrakte metodene
    //

    @Override
    public boolean inneholder(T element) {
        LinearNode<T> denne = forste;
        boolean resultat = false;
        while (denne != null && element.compareTo(denne.getElement()) > 0) {
            denne = denne.getNeste();
        }
        if (denne != null) {
            if (element.equals(denne.getElement())) {
                resultat = true;
            }
        } // ikke-funn
        return resultat;
    }

    @Override
    public T fjern(T element) {
        T svar = null;
        LinearNode<T> forrige = null, denne = forste;
        while (denne != null && element.compareTo(denne.getElement()) > 0) {
            forrige = denne;
            denne = denne.getNeste();
        }
        if (denne != null && element.equals(denne.getElement())) { // funnet
            antall--;
            svar = denne.getElement();
            if (forrige == null) { // Forste element
                forste = forste.getNeste();
                if (forste == null) { // Tom liste
                    siste = null;
                }
            } else { // Inni listen eller bak
                forrige.setNeste(denne.getNeste());
                if (denne == siste) { // bak
                    siste = forrige;
                }
            }
        } // ikke-funn
        return svar;
    }

}
