package no.hib.dat102.mengde.tabell;
import no.hib.dat102.mengde.adt.*;
import java.util.Iterator;
import java.util.Random;
public class TabellMengde<T> implements MengdeADT<T>{
// ADT-en Mengde implementert som tabell 
//
    private final static Random tilf = new Random();
    private final static int STDK = 100;
    private int antall;
    private T[] tab;

    public TabellMengde(){
       this(STDK);
    }

    public TabellMengde(int start){
        antall = 0;
        tab = (T[])(new Object[start]);
    }

   @Override
  public int antall(){return antall;}
 
   @Override
   public boolean erTom(){ return (antall==0); }
    
   @Override
   public void leggTil(T element){
    //TODO
 }


    private void utvidKapasitet(){
        T[] hjelpetabell = (T[])(new Object[2*tab.length]);
        for (int i=0; i<tab.length; i++){
            hjelpetabell[i] = tab[i];
        }
        tab = hjelpetabell;
    }
    
    @Override
    public T fjernTilfeldig(){
        T svar = null;
        if (antall>0){
            int indeks = tilf.nextInt(antall);
            svar = tab[indeks];
            tab[indeks] = tab[antall-1];
            antall--;
        }
        return svar;
    }

    @Override
    public T fjern(T element){
    // S�ker etter og fjerner element.Retur med null ved ikke-funn
    //
        int pos = -1;
        T svar = null;
        if(!erTom()){
            for(int i=0; (i<antall)&&(pos==-1); i++){
                if(tab[i].equals(element))
                    pos = i;
            }

            if(pos!=-1){
                svar = tab[pos];
                tab[pos] = tab[antall-1];
                tab[antall-1] = null;
                antall--;        
            
        }        
     }
     return svar; 
    }
    
  @Override
  public MengdeADT<T> union(MengdeADT<T> m2){
        TabellMengde<T> begge = new TabellMengde<T>();
        for (int i = 0; i<antall; i++){
            begge.leggTil(tab[i]);
        }
        Iterator<T> teller = m2.oppramser();

        while (teller.hasNext()){
            begge.leggTil(teller.next());
        }
        
        return begge;
    }
    
    @Override
   public boolean inneholder(T element){
     int pos = -1;
     for(int i = 0; (i<antall)&&(pos==-1); i++){
      if(tab[i].equals(element))
       pos = i;
     }
     return(pos!=-1);
    }
    
    @Override
   public boolean erLik(MengdeADT<T> m2){
        boolean likeMengder = true;       
        T element;

        if(antall()== m2.antall()){         
           Iterator<T> teller = m2.oppramser();
            
            while (likeMengder && teller.hasNext()){
             element = teller.next();
             if(!this.inneholder(element)){
              likeMengder = false;
             }//if             
            }//while
            
        }//if
        else{
         likeMengder = false;
           }         
       return likeMengder;        
    } 
    @Override   
    public void leggTilAlle(MengdeADT<T> m2){
     Iterator<T> teller = m2.oppramser();
     while (teller.hasNext())
            leggTil(teller.next());     
    }
    
    @Override
    public Iterator<T> oppramser(){
     return new TabellIterator<T>(tab, antall);
    }

}//class