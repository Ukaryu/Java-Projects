package Oppgave5;
//**************************************************************************
//  K�ADT.java      
//  Definerer interface til en samling k�. Sist oppdatert 24.01
//***************************************************************************

public interface KoeADT<T>{
   /**  Legge til et element bak i k�en. */
   public void innKoe(T element);

   /**  Fjerner og returnerer elementet foran i k�en.*/
   public T utKoe();

   /**  Returnerer elementet foran i k�en uten � fjerne det fra k�en. */
      /******************************************************************
   public T foerste()
   
   /**  Returns sann hvis denne  k�ene ikke inneholder noen elementer.. */
   public boolean erTom();

   /**  Returnerer antall elementer i k�en. */
   public int antall();

  }//