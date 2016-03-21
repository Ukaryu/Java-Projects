package Oppgave1;

import java.util.ArrayList;

/**
 * Created by Martin on 13.05.2015.
 */
public class CDArchive implements cdADT {
    ArrayList<CD> cd = new ArrayList<CD>();

    CDArchive() {

    }

    public void addCD(CD el) {
        cd.add(el);
    }

    public void delCD(String s) {
        ArrayList<CD> arr = fetchCD(s);

        for (CD elem : arr) {
            CD item = elem;
            cd.remove(item);
        }
    }

    public ArrayList<CD> fetchCD(String s) {
        ArrayList<CD> arr = new ArrayList<CD>();

        for (int i = 0; i < fetchNumCD(); i++) {
            CD check = cd.get(i);

            if ((check.getArtist().indexOf(s)) != -1) {
                arr.add(check);
            } else if ((check.getCdTittel().indexOf(s)) != -1) {
                arr.add(check);
            } else if ((check.getCompany().indexOf(s)) != -1) {
                arr.add(check);
            }
        }

        return arr;
    }

    public ArrayList<String> fetchArtist(String s) {
        ArrayList<String> arr = new ArrayList<String>();

        for (int i = 0; i < fetchNumCD(); i++) {
            CD check = cd.get(i);

            if (((check.getArtist().indexOf(s)) != -1) && !arr.contains(check.getArtist())) {
                arr.add(check.getArtist());

            }
        }

        return arr;
    }

    public int fetchNumCD() {
        return cd.size();
    }


}
