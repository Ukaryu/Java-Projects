package no.hib.dat102.mengde.kjedet;

import no.hib.dat102.mengde.adt.*;
//********************************************************************
// Kjedet implementasjon av en mengde. 
//********************************************************************
import java.util.*;

public class KjedetMengde<T> implements MengdeADT<T> {
 private static Random rand = new Random();
 private int antall; // antall elementer i mengden
 private LinearNode<T> start;

 /**
  * Oppretter en tom mengde.
  */
 public KjedetMengde() {
  antall = 0;
  start = null;
 }//

  
 @Override
 public void leggTil(T element) {
  //TODO
 }

@Override
 public void leggTilAlle(MengdeADT<T> m2) {
  Iterator<T> teller = m2.oppramser();
  while (teller.hasNext()){
   leggTil(teller.next());
  }
 }

 
 @Override
 public T fjernTilfeldig() {
  LinearNode<T> forgjenger, aktuell;
  T resultat = null;
  if (!erTom()) {
   int valg = rand.nextInt(antall) + 1;
   if (valg == 1) {
    resultat = start.getElement();
    start = start.getNeste();
   } else {
    forgjenger = start;
    for (int nr = 2; nr < valg; nr++){
     forgjenger = forgjenger.getNeste();
    }
    aktuell = forgjenger.getNeste();
    resultat = aktuell.getElement();
    forgjenger.setNeste(aktuell.getNeste());
   }
   antall--;
  }// if
  return resultat;
 }//

 
 @Override
 public T fjern(T element) {
  boolean funnet = false;
  LinearNode<T> forgjenger, aktuell = null;
  T resultat = null;
  if (!erTom()) {
   if (start.getElement().equals(element)) {// Sletter foran
    resultat = start.getElement();
    start = start.getNeste();
    antall--;
   } else { // Gjennomgår den kjedete strukturen
    forgjenger = start;
    aktuell = start.getNeste();
    for (int søk = 1; søk < antall && !funnet; søk++) {
     if (aktuell.getElement().equals(element))
      funnet = true;
     else {
      forgjenger = aktuell;
      aktuell = aktuell.getNeste();
     }
    }
    if (funnet) {
     resultat = aktuell.getElement(); // Sletter midt inni eller
              // bak
     forgjenger.setNeste(aktuell.getNeste());
     antall--;
    }
   }// if –else
  }// if ikke-tom
  return resultat;
 }//

 @Override
 public MengdeADT<T> union(MengdeADT<T> m2) {
  KjedetMengde<T> begge = new KjedetMengde<T>();
  LinearNode<T> aktuell = start;
  while (aktuell != null) {
   begge.leggTil(aktuell.getElement());
   aktuell = aktuell.getNeste();
  }// while
  Iterator<T> teller = m2.oppramser();
  while (teller.hasNext())
   begge.leggTil(teller.next());
  return begge;
 }//

 
 @Override
 public boolean inneholder(T element) {
  boolean funnet = false;
  LinearNode<T> aktuell = start;
  for (int søk = 0; søk < antall && !funnet; søk++) {
   if (aktuell.getElement().equals(element))
    funnet = true;
   else
    aktuell = aktuell.getNeste();
  }
  return funnet;
 }

 
 @Override
 public boolean erLik(MengdeADT<T> m2) {
  boolean likeMengder = true;
  T element = null;
  if (antall() == m2.antall()) {
   Iterator<T> teller = m2.oppramser();
   while (teller.hasNext() && likeMengder) {
    element = teller.next();
    if (!this.inneholder(element)) {
     likeMengder = false;
    }// if
   }// while
  }// if
  else {
   likeMengder = false;
  }
  return likeMengder;
 }

 
 @Override
 public boolean erTom() {
  return (antall() == 0);
 }

 
 @Override
 public int antall() {
  return antall;
 }

 @Override
 public Iterator<T> oppramser() {
  return new KjedetIterator<T>(start);
 }

}// class
