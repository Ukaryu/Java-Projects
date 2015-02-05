package Oppgave1;



/**
 * Created by Martin on 05.02.2015.
 */
public interface CDarkivADT {
    CD samling [] = new CD [0];


    public void leggTil(CD element);

    public void slettCD(String CD);

    public void sokCD(String CD);

    public void sokArtist(String artist);

    public void antallCD();


}
