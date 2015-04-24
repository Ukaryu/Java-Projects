package Oppgave6;
//********************************************************************
//  
//  Definerer interface til en datastruktur stabel.
//********************************************************************


public interface StabelADT<T>
{
  /**  Legger p� et element p� toppen av stabelen. 
    * @element element legges p� stabelen
    */
  public void push(T element);
  
  /**  Fjerner og returnerer toppelementet fra stabelen.
    * @return T element p� toppen av stabelen eller null hvis tom
    */
  public T pop();

  /**  Returnerer toppelementet uten � fjerne det fra stabelen. 
    * @return T element p� toppen av stabelen eller null hvis tom
    */
  public T peek();
  
  /**  Avgj�r om stabelen er tom.
    * @return boolean true hvis stabelen ikke inneholder noen elementer. 
    */
  public boolean erTom();
  
   /**  Returnerer antall elementer p� stabelen.
     * @return int antall elementer p� stabelen
     */
  public int antall();

    /**  Returnerer en strengrepresentasjon av elementene p� stabelen.
    * @return String representasjon av stabelen
    */
  public String toString();
}
