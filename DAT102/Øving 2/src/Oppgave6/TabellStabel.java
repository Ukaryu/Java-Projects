package Oppgave6;
//  Tabellimplementasjon av en stabel.
//********************************************************************

class TabellStabel<T> implements StabelADT<T>
{
  private final int STANDARD_KAPASITET = 100;
  private int topp;  // indikerer neste plass
  private  T[] stabel;
  
  /*******************************************************************
    Oppretter en tom stabel.
  *******************************************************************/
  public TabellStabel()
  {
    topp = 0;
    stabel = (T[])(new Object[STANDARD_KAPASITET]);
  }

  /*******************************************************************
    Oppretter en tom stabel med en spesifisert kapasitet.
  *******************************************************************/
  public TabellStabel(int startKapasitet)
  {
    topp = 0;
    stabel = (T[])(new Object[startKapasitet]);
  }

  /*******************************************************************
    Legger til det spesifiserte elementet p� toppen av stabelen, utvider
    kapasitetet til stabelen hvis n�dvendig.
  *******************************************************************/
  public void push (T element)
  {
    if (antall() == stabel.length) 
      utvid();

    stabel[topp] = element;
    topp++;
  }

  /*******************************************************************
    
    Fjerner toppelementet og returnerer en referanse til den.
    Hvis stabelen er tom fra f�r, s� returneres null
  *******************************************************************/
 public T pop(){
    T resultat = null;
    if (!erTom()){
      topp--;
    resultat = stabel[topp];
    stabel[topp] = null;
    } 
    return resultat;
  }

   
  /*******************************************************************
    Returnerer toppelementet uten � fjerne det..
    Hvis stabelen er tom fra f�r, s� returneres null
  *******************************************************************/
  public T peek() 
  {
    if (erTom())
      return null;
    else
    return stabel[topp-1];
  }

  /*******************************************************************
  Returnerer sann hvis stabelen er tom og usann ellers. 
  *******************************************************************/
  public boolean erTom()
  {
    return (topp == 0);
  }
 
  /*******************************************************************
    Returnerer antall elementer.
  *******************************************************************/
  public int antall()
  {
    return topp;
  }

  /*******************************************************************
    Returnerer en strengrepresentasjon av stabelen.. 
  *******************************************************************/
  public String toString()
  {
    String resultat = "";

    for (int sok=0; sok < topp; sok++)
      resultat = resultat + stabel[sok].toString() + "\n";

    return resultat;
  }

  /*******************************************************************
    Oppretter en ny tabell for � lagre innholdet.
  *******************************************************************/
  private void utvid()
  {
    T[] hjelpeTabell = (T[])(new Object[stabel.length*2]);
    
    for (int indeks =0; indeks < stabel.length; indeks++)
      hjelpeTabell[indeks] = stabel[indeks];
    
    stabel = hjelpeTabell;
  }
}
