package Oppgave4;//package no.hib.dat102.liste.kjedet;

/**
 * Klasse for ordnet liste implementert med kjedet struktur En abstrakt brukes ofte ved arv der den er en superklasse.
 * En kan en ikke lage objekter av en slik klasse. En abstrakt klasse kan ha abstrakte metoder, men ikke n�dvendigvis.
 * En klasse som har minst en abstrakt klasse m� v�re abtstrakt
 *
 * @param <T> elementtypen
 */
public abstract class KjedetListe<T> implements ListeADT<T> {
    protected int antall;
    protected LinearNode<T> forste, siste;

    /**
     * Lager en ny tom liste.
     */
    public KjedetListe() {
        antall = 0;
        forste = null;
        siste = null;
    }

    // En abstrakt metode er en plassholder for en metode som
    // vil bli definert i avledet klasse. En abstrakt metode kan ikke v�re private

    @Override
    public abstract boolean inneholder(T element);

    @Override
    public abstract T fjern(T element);

    @Override
    public T fjernForste() {
        T svar = null;
        if (!erTom()) {
            svar = forste.getElement();
            forste = forste.getNeste();
            antall--;
        }
        if(erTom())
        	siste = null;
        
        return svar;
    }

    @Override
    public T fjernSiste() {
        T svar = null;
        if (!erTom()) {
            svar = siste.getElement();
            antall--;
            if (antall == 0) {
                forste = null;
                siste = null;
            } else {
                siste = forste;
                for (int i = 1; i < antall; i++) {
                    siste = siste.getNeste();
                }
                siste.setNeste(null);
            }
        }
        return svar;
    }

    @Override
    public T forste() {
        T svar = null;
        if (!erTom()) {
            svar = forste.getElement();
        }
        return svar;
    }

    @Override
    public T siste() {
        T svar = null;
        if (!erTom()) {
            svar = siste.getElement();
        }
        return svar;
    }

    @Override
    public boolean erTom() {
        return antall == 0;
    }

    @Override
    public int antall() {
        return antall;
    }
}
