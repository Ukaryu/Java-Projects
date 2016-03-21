package Oppgave2;
//*******************************************************************
//  Bin�rTreNode.java               
//
//  Representerer en node i et bin�rt tre.
//*******************************************************************

public class BinaerTreNode<T> {
    private T element;
    private BinaerTreNode<T> venstre, hoyre;


    /**
     * **************************************************************
     * Oppretter et nytt tre med spesifisert data.
     * ***************************************************************
     */
    BinaerTreNode(T el) {
        element = el;
        venstre = null;
        hoyre = null;
    }

    /**
     * **************************************************************
     */
   /*   Hent- og settmetoder
   /******************************************************************/
    public BinaerTreNode<T> getVenstre() {
        return venstre;
    }

    public BinaerTreNode<T> getHoyre() {
        return hoyre;
    }

    public void setVenstre(BinaerTreNode<T> ny) {
        venstre = ny;
    }

    public void setHoyre(BinaerTreNode<T> ny) {
        hoyre = ny;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T el) {
        element = el;
    }

    /**
     * **************************************************************
     * Returnerer antall barn ulik null.
     * ***************************************************************
     */
    public int antallBarn() {
        int barn = 0;

        if (venstre != null)
            barn = 1 + venstre.antallBarn();

        if (hoyre != null)
            barn = barn + 1 + hoyre.antallBarn();

        return barn;
    }
}