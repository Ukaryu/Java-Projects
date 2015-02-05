package Oppgave1;

/**
 * Created by Martin on 17.01.2015.
 */
public class CD {
    int nummer = 0;
    String artist;
    String tittel;
    int lanseringsaar;
    enum sjanger {pop,rock,opera,klassisk;};
    String plateselskap;

    CD(){

    }

    CD(String artist, String tittel, int lanseringsaar,String plateselskap){
        nummer = nummer++;
        this.artist = artist;
        this.tittel = tittel;
        this.lanseringsaar = lanseringsaar;
        this.plateselskap = plateselskap;
    }
}
