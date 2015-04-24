package Oppgave5;

//********************************************************************
//  TabellOrdnetListe.java
//
//  Representerer en tabell av en ordnet liste.
//********************************************************************

public class TabellOrdnetListe<T extends Comparable<T>> extends TabellListe<T>
  implements OrdnetListeADT<T> {
 /******************************************************************
  * Opprette en tom liste med standard kapasitet..
  ******************************************************************/
 public TabellOrdnetListe() {
  super();
 }

 /******************************************************************
  * Oppretter en tom liste med spesifisert kapasitet.
  ******************************************************************/
 public TabellOrdnetListe(int startKapasitet) {
  // Konstrukt�ren til basisklassen m� alltid kalles f�rst!
  super(startKapasitet);
 }

 /******************************************************************
  * Legger til et spesifisert element til denne listen. slik at listen
  * fortsatt er sortert.
  ******************************************************************/
 // OBS!leggTil-metoden er effektiv fordi den ikke sammenligner
 // un�dvendig mange ganger. Den utnytter at elementene er ordnet.
 
 // Vi lager to metoder i denne klassen , fjern og inneholder som
 // overkj�rer superklassens

 public void leggTil(T element) {
  if (antall() == liste.length)
   utvid(); // arves
  // Klassen som skal bruke metoden m� implementere Comparable
  int i = 0;
  while (i < bak && element.compareTo(liste[i]) > 0) {
   i++;
  }
  // i peker n� p� plassen der elementet skal inn

  for (int j = bak; j > i; j--) {// M� lage plass ved � skifte bakover
   liste[j] = liste[j - 1]; // de elementene p� plassene f.o.m indeks i
  }
  liste[i] = element;
  bak++;
 }

 // Implementer de to abstrakte metodene
 @Override
 public boolean inneholder(T element) {
  return (finn(element) != IKKE_FUNNET);
 }

 @Override
 //
 public T fjern(T element) {
  T resultat = null;

  int indeks = finn(element);

  if (indeks != IKKE_FUNNET) {
   resultat = liste[indeks];
   bak--;
   /** skifter elementene etter det vi fjernet en plass opp */
   for (int i = indeks; i < bak; i++)
    liste[i] = liste[i + 1];
   liste[bak] = null;
  }// if

  return resultat;
 }

 // TODO effektiv
 
 private int finn(T el) {
 //...fyll ut
  return 0;
 }

}// class

