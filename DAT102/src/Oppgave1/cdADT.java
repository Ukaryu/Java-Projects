package Oppgave1;

import java.util.*;

/**
 * Created by Martin on 13.05.2015.
 */
public interface cdADT {

    /**
     * ArrayList to save CD elements in.
     */
    ArrayList<CD> cd = new ArrayList<CD>();

    /**
     * @param el The CD element that will be placed in the ArrayList.
     */

    public void addCD(CD el);

    /**
     * @param s The CD that will be removed from the ArrayList.
     */

    public void delCD(String s);

    /**
     * @param s The substring that will be used to find the CD element.
     * @return Returns the CD elements that corresponds with substring.
     */

    public ArrayList<CD> fetchCD(String s);

    /**
     * @param s The substring that will be used to find the Artist of CD.
     * @return Returns the CD element that corresponds with substring.
     */

    public ArrayList<String> fetchArtist(String s);

    /**
     * @return Returns number of CD elements in ArrayList.
     */

    public int fetchNumCD();


}
