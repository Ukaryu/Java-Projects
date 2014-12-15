package no.hib.dat100.kontakter.unntak;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import kontakter.KontaktInfo;
import kontakter.KontaktListe;

public class KontakListeLagring extends KontaktListe {

	public void skrivTilFil(String filnavn) {
		
		// TODO - START
		try {
            PrintWriter f = new PrintWriter(new FileWriter(filnavn));

            // skriv ut antall poster f�rst - size metode p� HashMap
            f.println(kontakter.size());
            // iterer over hash map via keySet og get metodene p� HashMap
            for (String key : kontakter.keySet()){
                KontaktInfo ki = kontakter.get(key);
                f.println(key);
                f.println(ki.getType());
                f.println(ki.getNummer());
            }
            // og skrive ut til filen en post om gangen
            f.close();

        } catch (IOException exception){
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }

		
		// TODO - SLUTT
	}
}