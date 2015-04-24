package Oppgave4;
//********************************************************************
//  SorteringOgsoking.java
//
//  Sortering og soking i tabell av objekter..
//********************************************************************

class SorteringOgSoking<T extends Comparable<T> >
{
   /********************************************************************
     Sorterer den spesifiserte tabellen av objekter ved kvikksortering

   ********************************************************************/
   public void kvikkSort (T[] data, int min, int maks)
   {
      int indeksTilPartisjon;

      if (maks - min  > 0)
      {
         /** Lager partisjon */
         indeksTilPartisjon = finnPartisjon(data, min, maks);

         /** Sorterer venstre side */
         kvikkSort(data, min, indeksTilPartisjon - 1);

         /** Sorterer h�yre side */
         kvikkSort(data, indeksTilPartisjon + 1, maks);
      }

   }

   /********************************************************************
     Finner partisjon.
   ********************************************************************/
   private int finnPartisjon (T[] data, int min, int maks)
   {
      int venstre, hoyre;
      T temp, pivot;

      pivot = data[min]; // pivot som forste element
      venstre = min;
      hoyre   = maks;

      while (venstre < hoyre)
      {
         /** soker et element som er > enn pivot */
         while (data[venstre].compareTo(pivot) <=0 &&
                            venstre < hoyre)
            venstre++;

         /** soker et elemnet som er < enn pivot */
         while (data[hoyre].compareTo(pivot) > 0)
            hoyre--;

         /** bytter elementene  */
         if (venstre < hoyre)
         {
            temp = data[venstre];
            data[venstre] = data[hoyre];
            data[hoyre] = temp;
         }
      }

      /** flytter pivot til riktig og sin endelige plass */
      temp = data[min];
      data[min] = data[hoyre];
      data[hoyre] = temp;

      return hoyre;
   }

   /********************************************************************
     Sorterer den spesifiserte tabellen av objekter ved flettesortering.

   ********************************************************************/
   public void fletteSorter (T[] data, int min, int maks)
   {
      T[] temp;
      int indeks, venstre, hoyre;

      /** returnerer en liste av lengde en */
      if (min==maks)
         return;

      /** finne lengden og midten av listen */
      int stor = maks - min + 1;
      int midten = (min + maks) / 2;
      temp = (T[])(new Comparable[stor]);

      fletteSorter(data, min, midten);       // sorterer venstre halvdel
      fletteSorter(data, midten + 1, maks);  // sorterer h�yre halvdel

      /** kopier sorterte data */
      for (indeks = 0; indeks < stor; indeks++)
             temp[indeks] = data[min + indeks];

      /** flett de to sorterte delene */
      venstre = 0;
      hoyre = midten - min + 1;
      for (indeks = 0; indeks < stor; indeks++)
      {
         if (hoyre <= maks - min)
            if (venstre <= midten - min)
               if (temp[venstre].compareTo(temp[hoyre]) > 0)
                   data[indeks + min] = temp[hoyre++];
               else
                  data[indeks + min] = temp[venstre++];
            else
               data[indeks + min] = temp[hoyre++];
         else
            data[indeks + min] = temp[venstre++];
      }
   }//
  /********************************************************************
     Sorterer den spesifiserte tabellen av objekter ved flettesortering.
     Alternativ utgave:

   ********************************************************************/
public void fletteSort(T[] tabell, int forste, int siste){
  // Sorterer elementene i tabellen i �kenede rekkef�lge
  // Forkrav: tabellen[forste..siste] er en tabell
  // Resultat: tabell[forste..siste] er sortert i �kende rekkef�lge
  // Metodekall: flette

  if(forste < siste){
    // Sorter hver halvdel
    int midten = (forste + siste)/2;  // posisjonen til midetn
    // Sorter venstre halvdel tabell[forste,midten];
    fletteSort(tabell, forste, midten);
    // Sorter h�yre halvdel tabell[midten+1,..siste]
    fletteSort(tabell, midten+1, siste);

    // Fletter de to halvdelene
    flette(tabell, forste, midten, siste);
  }
 }

private  void flette(T[] tabell,int forste, int midten, int siste){
   // Fletter to sorterte deltabeller, tabell[forste...midten] og
   // og tabell[midten+1 ...siste] til en sortert tabell
   // Forkrav: forste <= midten <= siste
   // Deltabellene tabell[forste...midten] og tabell[midten+1 ... siste]
   // er hver sorterte i �kende rekkef�lge
   // ResultatI tabell[forste..siste] er sorterte
   // Implementasjon : Denne metoden fletter to deltabeller til en
   // hjelpetabell og kopierer resultatet til den originale tabellen

   int stor = tabell.length;
   // Hjelpetabell
   T[] hjelpeTabell = (T[])(new Comparable[stor]);

     //Initierer lokale indekser
   int forste1 = forste; // start p� forste deltabell
   int siste1  = midten; // slutten p� forste deltabell
   int forste2 = midten+1; // starten p� andre deltabell
   int siste2  = siste;    // slutten p� siste deltabell

   // S� lenge begge deltabellene ikke er tomme, kopier
   // det minste elementet til hjelpetabellen.
   int indeks = forste1; // Neste ledige posisjon i hjelpetabellen

   while((forste <= siste1)&&(forste2 <= siste2)){
    // Invariant: hjelpeTabell[forste..indeks-1] er sortert
    if(tabell[forste].compareTo(tabell[forste2]) < 0){
        hjelpeTabell[indeks] = tabell[forste];
            forste++;
    }
    else{
        hjelpeTabell[indeks] = tabell[forste2];
            forste2++;
    }
    indeks++;
   }// while

   // Avslutte den forste deltabellen hvis n�dvendig
   while(forste <= siste1){
     // Invarariant: hjelpeTabell[forste..indeks-1] er sortert
     hjelpeTabell[indeks] = tabell[forste];
        forste++;
     indeks++;
   }//while

   // Avslutte den andre deltabellen hvis n�dvendig
   while(forste2 <= siste2){
    //Invariant: hjelpeTabell[forste..indeks-1] er sortert
    hjelpeTabell[indeks] = tabell[forste2];
        forste2++;
    indeks++;
   }//while

   // Kopier resultatet tilbake til den originale tabellen
   for(indeks = forste; indeks <= siste; indeks++){
      tabell[indeks] = hjelpeTabell[indeks];
   }

 }//flette */

   /********************************************************************
     Sortere den spesifiserte tabellen av objekter ved bobblesortering.

   ********************************************************************/
   public void bobleSort (T[] data)
   {
      int posisjon, sok;
      T temp;

      for (posisjon =  data.length - 1; posisjon >= 0; posisjon--)
      {
         for (sok = 0; sok <= posisjon - 1; sok++)
         {
            if (data[sok].compareTo(data[sok+1]) > 0)
            {
               /** Bytt verdiene */
               temp = data[sok];
                data[sok] = data[sok + 1];
                data[sok + 1] = temp;
            }
         }
      }
   }//

   /********************************************************************
       soker etter et spesielt element i en usortert tabll ved line�rsok.

   ********************************************************************/
   public boolean lineersokU (T[] data,int min, int maks, T element)
   {
      int indeks = min;
      boolean funnet = false;

      while (!funnet && indeks <= maks)
      {
         if (data[indeks].compareTo(element) == 0)
            funnet = true;
         indeks++;
      }

      return funnet;
   }//

  /********************************************************************
    soker etter et spesielt element i en sortert tabll ved line�rsok.

   ********************************************************************/
  public boolean lineersokS(T[] data, int min, int maks, T element)
  {
    int indeks = min;
    boolean funnet = false;

    while (indeks <= maks && data[indeks].compareTo(element) < 0 ){
         indeks++; }//while
    if(data[indeks].compareTo(element)== 0)
         funnet = true;
    return funnet;
}//

   /********************************************************************
     soker i tabellen ved binersok. Tabellen er sortert.
   ********************************************************************/
   public boolean binersok (T[] data, int min, int maks, T element)
   {
      boolean funnet = false;
      int midtpunkt = (min + maks) / 2;  // bestemme midtpunktet

      if (data[midtpunkt].compareTo(element) == 0)
         funnet = true;

      else if (data[midtpunkt].compareTo(element) > 0)
      {
         if (min <= midtpunkt - 1)
            funnet = binersok(data, min, midtpunkt - 1, element);
      }

      else if (midtpunkt + 1 <= maks)
         funnet = binersok(data, midtpunkt + 1, maks, element);

      return funnet;
   }//

   /********************************************************************
     Sorterer den spesifiserte tabellen ved utvalgsortering.
   ********************************************************************/
   public void utvalgsSortering (T[] data)
   {
      int minste;
      T temp;

      for (int neste = 0; neste < data.length-1; neste++)
      {
         minste = neste;
         for (int sok = neste+1; sok < data.length; sok++)
            if (data[sok].compareTo(data[minste])<0)
               minste = sok;

         /** Bytt verdiene */
         temp = data[minste];
         data[minste] = data[neste];
         data[neste] = temp;
      }
   }//
   /********************************************************************
     Sorterer den spesifiserte tabellen ved sortering ved innsetting.

   ********************************************************************/
   public void sorteringVedInsetting(T[] data)
   {
      for (int indeks = 1; indeks < data.length; indeks++)
      {
         T binersok = data[indeks];
         int posisjon = indeks;

         /** Forskyv st�rre verdier mot h�yre (mot h�yere indekser)*/
         while (posisjon > 0 && data[posisjon-1].compareTo(binersok) > 0)
         {
            data[posisjon] = data[posisjon-1];
            posisjon--;
         }

         data[posisjon] = binersok;
      }
   }//


}//class
