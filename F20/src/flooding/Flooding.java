import java.util.Scanner;
import easyIO.*;

public class Flooding {

	static char DEKKET_CHR = '~';
    static char NESTEN_DEKKET_CHR = 'O';
    static char SIKKERT_CHR = '+';
    
	static int NESTEN_DEKKET_INT = 2; 

	public static void main(String args[]) {
        Out skjerm = new Out();

		// terreng hogde
		int[][] terreng = { { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
				{ 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
				{ 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 } };

		int hav = 0;

		while (hav >= 0) {
			Scanner in = new Scanner(System.in);

            for (int i = 0; i < terreng.length; i++){
                for (int h = 0; h < terreng[i].length; h++){

                    if (terreng[i][h] <= hav){
                        skjerm.out(DEKKET_CHR);

                    } else if ((terreng[i][h]- hav) <= NESTEN_DEKKET_INT){
                        skjerm.out(NESTEN_DEKKET_CHR);

                    } else {
                        skjerm.out(SIKKERT_CHR);
                    }

                }
                skjerm.outln();
            }
			// itererer igjennom terreng og skriv tegn som angitt i oppgaven


			
			System.out.print("Hav høyde : ");
			hav = in.nextInt();
		}
	}
}