package Oppgave5;//********************************************************************
//
//  Representerer en tabell implementasjon av samling k�.
    // front til k�en er i posisjon 0.
//********************************************************************

public class TabellKoe<T> implements KoeADT<T> {
  private final int STDKAPASITET  = 100;
  private int bak;
  private T[] koe;

  /******************************************************************
    Oppretter en tom k� med standard st�rrelse.
    ******************************************************************/
  public TabellKoe() {
    bak = 0;
    koe = (T[])(new Object[STDKAPASITET]);

  }

  /******************************************************************
    Oppretter en tom k� med spesifisert kapasitet..
  ******************************************************************/
  public TabellKoe (int startKapasitet)   {
     bak = 0;
     koe = (T[])(new Object[startKapasitet]);
   }

  /******************************************************************
    Legger til et spesifisert element bak i k�en, utvider hvis n�dvendig

  ******************************************************************/
  public void innKoe(T element){
     if (antall() == koe.length)
        utvid();

     koe[bak] = element;
     bak++;
  }

  /******************************************************************
    Fjerner elementet foran i k�en.
  ******************************************************************/
  public T utKoe() {

      T resultat = null;
       if (!erTom()){
          resultat = koe[0];
          bak--;
        }

     /** flytter elementene en plass frem */
     for (int soek=0; soek < bak; soek++){
          koe[soek] = koe[soek+1];
       }
     koe[bak] = null;  // kan sl�yfes
     return resultat;
  }

 /******************************************************************
    Returnerer elementet foran.
  ******************************************************************/
  public T foerste() {

      T resultat = null;

     if (!erTom()){
         resultat = koe[0];
     }
     return resultat;
  }

  /******************************************************************
    Returnerer sann hvis k�en er tom, usann ellers..
  ******************************************************************/
  public boolean erTom(){
     return (bak == 0);
  }

  /******************************************************************
    Returnerer antall elementer i k�en.
  ******************************************************************/
  public int antall()  {
     return bak;
  }

  /******************************************************************
    Returnerer en strengrepresentasjon av elementene i k�en.
  ******************************************************************/
  public String toString() {
     String resultat = "";

     for (int soek=0; soek < bak; soek++){
        resultat = resultat + koe[soek].toString() + "\n";
     }
     return resultat;
  }

  /******************************************************************
    Oppretter en ny tabell st�rre for � lagre elmentene.
  ******************************************************************/
  private void utvid() {
     T[] hjelpetabell = (T[])(new Object[koe.length*2]);

     for (int soek =0; soek < koe.length; soek++){
         hjelpetabell[soek] = koe[soek];
      }
      koe = hjelpetabell;
  }

}//class



