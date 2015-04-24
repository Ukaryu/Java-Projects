package Oppgave6;

import com.sun.istack.internal.Nullable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Balansering{
     TabellStabel<Parentesinfo>stabel = new  TabellStabel<Parentesinfo>();

           
    private boolean passer(char apent, char lukket){
        switch(apent){
            case '(': return (lukket == ')'); 
            case '[': return (lukket ==']');
            case '{': return (lukket == '}');
            default: return false;
        }
    }//

  
public void foretaBalansering(String innDataStreng, int linjenr){

   int lengde = innDataStreng.length();

   boolean balansert = true;

   while(innDataStreng != null && balansert){

       Parentesinfo info = new Parentesinfo();
       info.settLinjenr(linjenr);
       System.out.println("test");

       char innData [] = innDataStreng.toCharArray();

       for (int i = 0; i < lengde; i++){
           info.settPosisjon(info.hentPosisjon()+1);

           if(innData[i] == '(' || innData[i] == '{' || innData[i] == '[') {
               info.settVenstreparentes(innData[i]);
               stabel.push(info);

           } else if(innData[i] == ')' || innData[i] == '}' || innData[i] == ']'){

               if (stabel.erTom()){
                   balansert = false;
                   System.out.println("Java-filen er ikke balansert ved linje " + info.hentLinjenr() + ", posisjon " + info.hentPosisjon());

               } else {
                   Parentesinfo infoFjern = stabel.pop();

                   if (!passer(infoFjern.hentVenstreparentes(),innData[i])){
                       balansert = false;
                       System.out.println("Java-filen er ikke balansert ved linje " + info.hentLinjenr() + ", posisjon " + info.hentPosisjon());
                   }

               }

           }
       }

   }

   if (!stabel.erTom()){
       System.out.println("Stabelen er ikke tom etter sok for ubalanse ved parantesbruk");
   }

}//

public  void lesFraFil(String filnavn){
    FileReader tekstFilLeser = null;
    try{
        tekstFilLeser = new FileReader(filnavn);
    }
    catch(FileNotFoundException unntak){
        System.out.println("Finner ikke filen!");
        System.exit(-1);
    }

    BufferedReader tekstLeser = new BufferedReader(tekstFilLeser);
    String linje = null;
    int linjenr = 1;
    try{
        linje = tekstLeser.readLine();

        while (linje != null)
            System.out.println("test");
          foretaBalansering(linje,linjenr);

          // Fyll ut

       //while
    }   
           
    catch(IOException unntak){
        System.out.println("Feil ved innlesing!");
        System.exit(-1);
    }
    try{tekstFilLeser.close();}
    catch(IOException unntak){
        System.out.println("Feil ved lukking av fil!");
    }

}//metode

}//class



