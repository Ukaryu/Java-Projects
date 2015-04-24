package Oppgave2;
//********************************************************************
//  DobbeKjedetlOrdnetListeS.java       
//
//  Representerer en dobbeltkedetliste med midtpeker.
//********************************************************************
;

class DobbelKjedetOrdnetListeS<T extends Comparable <T>> {
 
 private DobbelNode<T> forste;
 private DobbelNode<T> midten;
 private DobbelNode<T> siste;
 private int antall;
    
   /******************************************************************
     Oppretter en tom liste.
   ******************************************************************/
   //Konstruktor
   
    DobbelKjedetOrdnetListeS(T minVerdi, T maksVerdi){
     
        //Forste node
        DobbelNode<T> nyNode1 = new DobbelNode<T>(minVerdi);
        //nyNode1.settElement(minVerdi);
        forste = nyNode1;
        midten = forste;

        //Siste node
        DobbelNode<T> nyNode2 = new DobbelNode<T>();
        nyNode2.setElement(maksVerdi);
        nyNode1.setNeste(nyNode2);
        nyNode2.setForrige(nyNode1);
        siste = nyNode2;
        
        antall = 0;
    }
    
//***********************************************************************************
// *
// *
// ***********************************************************************************
 
 
  public void leggTil(T el){
      //TODO... Fyll ut
   
     //Setter inn ordnet f�r den noden p peker p�
     DobbelNode<T> p;
     
    if((el.compareTo(forste.getElement())<=0 )||(el.compareTo(siste.getElement())>=0)){
      //Ugyldig. Alternativt kan vi ha det som et forkrav!
            System.out.println("Ugyldig verdi. verdi > " + forste.getElement() + "verdi < " + siste.getElement());
     
       
    }else{ // Kun lovlige verdier
    
        antall++;
                
        if(el.compareTo(midten.getElement()) >= 0){//Finn plass i siste halvdel
             p = midten.getNeste();
        }else{                                   // Finn plass i f�rste halvdel
           p = forste.getNeste();
        }
        
        while(el.compareTo(p.getElement()) >= 0){
             p = p.getNeste();
        }//while
            
            // Setter inn:
            //Innsett foran noden som p peker p�
          
           // Fyll ut  
                           
                             
           //Oppdaterer ny midten
           nyMidten();
           
        }//else lovlige
        
  }// 
  
  //**********************************************************************************
  // Hjelpemetode til � finne ny midten
  // Mindre effektiv fordi vi m� gjennomgp� ca halve listen
  //*********************************************************************************
  private void nyMidten(){
    int midtNR = antall/2 ;
    DobbelNode<T> p = forste.getNeste();
    for(int i = 1; i <= midtNR; i++){
       p = p.getNeste();
    }
   midten = p; 
  }//
       
  //***********************************************************************************
// *
// *
// ***********************************************************************************
  public boolean fins(T el){
        boolean funnet = false;
        DobbelNode<T> p;
        if((el.compareTo(forste.getElement())<=0 )||(el.compareTo(siste.getElement())>=0)){
      //Ugyldig. Alternativt kan vi ha det som et forkrav!
            System.out.println("Ugyldig verdi. verdi > " + forste.getElement() + "verdi < " + siste.getElement());
      
       
    }else{ // Kun lovlige verdier    
        if(el.compareTo(midten.getElement()) >= 0){ //Let i siste halvdel
          p = midten;                          // Midten defineres � tilh�re siste del
          }else{                                   // Let i f�rste halvdel
          p = forste.getNeste();
          }
        
         while(el.compareTo(p.getElement()) > 0){
            p = p.getNeste();
         }//while
         
         // Test p� funnet
         if(el.compareTo(p.getElement()) == 0){
           funnet = true;
          }
    }//else
        return funnet;
  }//
  
  //***********************************************************************************
// *
// *
// ***********************************************************************************

   public T fjern(T el){
     T resultat = null;
     DobbelNode<T> p= null;
     boolean funnet = false;
     
     if((el.compareTo(forste.getElement())<=0) ||(el.compareTo(siste.getElement())>=0)){
        //Ugyldig. Alternativt kan vi ha det som et forkrav!
          System.out.println("Ugyldig verdi. verdi > " + forste.getElement() + "verdi < " + siste.getElement());
             
     }else{ // Kun lovlige verdier    
                        
         if(el.compareTo(midten.getElement()) >= 0){
              p = midten;
          }
         else{
            p = forste.getNeste();
          }
        
           while(el.compareTo(p.getElement()) > 0){
              p = p.getNeste();   
            }//while
          
            if(el.compareTo(p.getElement()) == 0){
                funnet = true;
             }
                  
          if(funnet){ 
          // Tar ut
             antall = antall -1;
              p.getNeste().setForrige(p.getForrige());
              p.getForrige().setNeste(p.getNeste());
              
              // Oppadtere midten
              nyMidten();         
           
             resultat = p.getElement();
                       
        }//funnet
       
       }// lovlige
     return resultat;
  }//
  //***********************************************************************************
// *
// *
// ***********************************************************************************
    
   private DobbelNode<T> finss(T el){
       //Returnerer en peker til noden hvis den fins, ellers returneres null.
       //TODO
       //..Fyll ut...
       // fjern-metoden kan bruke denne.       
           
   }
   
   
    public void  skrivListe(){
     DobbelNode<T> p = forste;
     
     while(p != null){
        System.out.print(p.getElement() + " ");
        p = p.getNeste();
         }
         
         System.out.println("Forste:" + forste.getElement() + " Midten:" + midten.getElement() +
                       " Siste:" + siste.getElement());
        System.out.println(); 
                
    }//

}//class
  
 