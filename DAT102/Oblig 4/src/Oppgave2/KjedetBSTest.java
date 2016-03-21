package Oppgave2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class KjedetBSTest {

    private KjedetBinaerSokeTre<Integer> bs;
    // Testdata som legges inn i treet
    private Integer e0 = 1;
    private Integer e1 = 2;
    private Integer e2 = 3;
    private Integer e3 = 4;
    private Integer e4 = 5;
    private Integer e5 = 6;
    private Integer e6 = 7;

    //Data som ikke legges inn i treet
    private Integer e7 = 8;

    /**
     * Opprett en tomt tre for hver test.
     *
     * @throws Exception exception
     */
    @Before
    public final void setup() throws Exception {
        bs = new KjedetBinaerSokeTre<Integer>();
    }

    /**
     * Tester  finn
     */
    @Test
    public final void erElementIBSTre() {
        bs = new KjedetBinaerSokeTre<Integer>();
        bs.leggTil(e0);
        bs.leggTil(e2);
        bs.leggTil(e6);
        bs.leggTil(e3);
        bs.leggTil(e5);
        bs.leggTil(e1);
        bs.leggTil(e4);

        int values [] = {e0,e1,e2,e3,e4,e5,e6};
        for (int elem : values){
            assertTrue(bs.finn(elem) != null);
        }
        assertTrue(bs.finn(e7) == null);


    /* Her legger du inn e0...e6 i treet i en vilk�rlig rekkef�lge.
     * Etterp� sjekker du om elementene fins og til slutt sjekker du
     * at e7 ikke fins
     */

    }

    /**
     * 1.  Tester ordning  ved � legge til elementer og fjerne minste
     */
    @Test
    public final void erBSTreOrdnet() {
        bs = new KjedetBinaerSokeTre<Integer>();
        bs.leggTil(e0);
        bs.leggTil(e2);
        bs.leggTil(e6);
        bs.leggTil(e3);
        bs.leggTil(e5);
        bs.leggTil(e1);
        bs.leggTil(e4);

        Integer values[] = {e0, e1, e2, e3, e4, e5, e6};

        for (int elem : values){
            bs.fjernMin();
            assertTrue(bs.finn(elem) == null);
        }


     /* Her legge du f�rst inn e0...e6 i en vilk�rlig rekkef�lge
      * og s� fjerne du minste hele tiden
      */
    }

    /**
     * 2 Tester ordning ved � bruke en inordeniterator
     * Her studerer du alt om bruk av inordeniterator.
     */
    @Test
    public final void erBSTreOrdnet2() {
        bs.leggTil(e3);
        bs.leggTil(e2);
        bs.leggTil(e4);
        bs.leggTil(e1);
        bs.leggTil(e5);
        bs.leggTil(e0);
        bs.leggTil(e6);

        Integer el[] = {e0, e1, e2, e3, e4, e5, e6};
        int i = 0;
        for (Integer e : bs) {
            assertEquals(el[i], e);
            i++;
        }


    }


}//class
