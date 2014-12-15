package no.hib.dat100.kontakter.unntak;

import kontakter.KontaktInfo;
import kontakter.KontaktListe;

public class KontaktListeFinnSikker extends KontaktListe {

	public KontaktInfo finnKontaktInfoSikker(String navn) throws KeyNotUsedException {
		
		KontaktInfo ki = null;
		
		// TODO - START
		
		// signaller IllegalArgumentException hvis navn er null
		
		
		// Hvis n�kkel er i bruk (containsKey metode p� en HashMap)
		// sett ki lik det som er lagret for n�kkelen
		
		// eller signaller KeyNotUsedException
		
		// TODO - SLUTT
		return ki;
	}
}
