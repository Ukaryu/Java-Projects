package Oppgave1;

/**
 * Created by Martin on 17.01.2015.
 */
public class CD {
    int nummer;
    String artist;
    String tittel;
    int lanseringsaar;
    String sjanger [] = {"Pop","Rock","Opera","Klassisk"};
    String besSjanger;
    String plateselskap;

    CD(){

    }

    CD(String artist, String tittel, int lanseringsaar,int i,String plateselskap){
        nummer = nummer++;
        this.artist = artist;
        this.tittel = tittel;
        this.lanseringsaar = lanseringsaar;
        besSjanger = sjanger[i];
        this.plateselskap = plateselskap;
    }


}
