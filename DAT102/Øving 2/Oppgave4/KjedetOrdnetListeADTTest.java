package Oppgave4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//package 

/**
 * Test av KjedetOrdnetListeADT med heltall.
 * 
 * @author Ole Olsen
 */
public class KjedetOrdnetListeADTTest {   

    private KjedetOrdnetListe<Integer> liste;

    // Test data
    private Integer e0 = 1;
    private Integer e1 = 2;
    private Integer e2 = 3;
    private Integer e3 = 4;
    private Integer e4 = 5;
    private Integer e5 = 6;

    /**
     * Opprett en stabel for hver test.
     * 
     * @throws Exception exception
     */
    @Before
    public final void setup() throws Exception {
        liste = new KjedetOrdnetListe<Integer>();
    }

    /**
     * Tester om en ny liste er tom.
     */
    @Test
    public final void nyListeErTom() {
        //Fyll ut ...
    }

    /**
     * Tester leggTil og fjern.
     */
    @Test
    public final void leggTilOgFjern() {
     
     //  Fyll ut ...
      
    }
    
    /**
     * Tester ordning 
     * 
     */
    @Test
    public final void viseOrdnetVoksende() { 
     liste.leggTil(e1); 
     liste.leggTil(e4); 
     liste.leggTil(e3); 
     liste.leggTil(e0); 
     liste.leggTil(e5); 
     liste.leggTil(e2); 
     assertEquals(e0, liste.fjernForste());
     assertEquals(e1, liste.fjernForste());
     assertEquals(e2, liste.fjernForste());
     assertEquals(e3, liste.fjernForste());
     assertEquals(e4, liste.fjernForste());
     assertEquals(e5, liste.fjernForste());
     }
    
    /**
     * Tester ordning
     * 
     */
    @Test
    public final void viseOrdnetAvtagende(){
      // Fyll ut...
      
    }
          

    /**
     * Tester leggTil og fjern med like verdier.
     */
    @Test
    public final void leggTilOgfjernMedDuplikater() {

       // Fyll ut ...
    }

    /**
     * Tester leggTil og inneholder
     */
    @Test
    public final void leggTilOgInnholder() {
      
      //Fyll ut ...
        
    }

    /**
     * Tester om stabel med verdier ikke er tom.
     */
    @Test
    public final void erIkkeTom() {
       //Fyll ut ...
    }

    /**
     * Tester om leggTil og fjern p� en tom liste gir en tom liste.
     */
    @Test
    public final void leggTilFjernErTom() {
       //Fyll ut ...
    }

    /**
     * Pr�ver � fjerne et element fra en tom liste.
     */
    @Test
    public final void fjernFraTomListe() {
        assertNull("Fjerne fra tom liste", liste.fjern(e4));
    }

}
