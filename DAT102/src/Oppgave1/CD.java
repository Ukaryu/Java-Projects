package Oppgave1;

/**
 * Created by Martin on 13.05.2015.
 */
public class CD {
    private int cdNum;
    private String artist;
    private String cdTittel;
    private int year;
    private String company;

    public CD() {

    }

    public CD(int cdNum, String artist, String cdTittel, int year, String company) {
        this.cdNum = cdNum;
        this.artist = artist;
        this.cdTittel = cdTittel;
        this.year = year;
        this.company = company;
    }

    public int getCdNum() {
        return cdNum;
    }

    public String getArtist() {
        return artist;
    }

    public String getCdTittel() {
        return cdTittel;
    }

    public int getYear() {
        return year;
    }

    public String getCompany() {
        return company;
    }
}
