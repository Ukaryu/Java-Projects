package Oppgave1;

/**
 * Created by Martin on 05.02.2015.
 */
public class CDarkiv implements CDarkivADT {

    CD samling [];
    int antall = 0;

    CDarkiv(){
        samling = new CD [20];

    }



    @Override
    public void leggTil(CD element) {
        samling[antall] = element;
        antall++;
    }

    @Override
    public void slettCD(String CD) {
        boolean funnet = false;
        try{
            for (int i = 0; i < samling.length; i++){
                if (funnet){
                    samling[i - 1] = samling [i]; //Hvis CDen blir funnet i arkivet så blir alle andre CDer forskjøvet ett hakk mot venstre
                }
                if (samling[i].tittel.toUpperCase().equals(CD.toUpperCase())){
                    funnet = true;
                    antall--;
                }
            }
        } catch (NullPointerException e){
            System.out.println("Ikke utfylt array");
        }
    }

    @Override
    public void sokCD(String CD) {
        try{
            for (CD elem : samling){
                if (elem.tittel.toUpperCase().contains(CD.toUpperCase())){
                    System.out.println(elem.tittel);
                }
            }
        } catch (NullPointerException e){
            System.out.println("Ikke utfylt array");
        }

    }

    @Override
    public void sokArtist(String artist) {
        try{
            for (CD elem : samling){
                if (elem.artist.toUpperCase().contains(artist.toUpperCase())){
                    System.out.println(elem.artist);
                }
            }
        } catch (NullPointerException e){
            System.out.println("Ikke utfylt array");
        }
    }

    @Override
    public int antallCD() {
        return antall;
    }
}
