import easyIO.Out;

import java.util.Random;

/**
 * Created by Martin on 16.10.2014.
 */
public class TerningSimulator {
    Random terning = new Random();
    int kast [] = new int[100];
    int antall [];


    TerningSimulator(int ant){
        this.antall [] = new int[ant];
    }

    public void finnTerningKast(){
        Out skjerm = new Out();

        int teller = 19;

        for (int i = 0; i < kast.length; i++){
            kast [i] = terning.nextInt(6) + 1;
            skjerm.out(kast [i], 4);

            while (i == teller){
                skjerm.outln();
                teller += 20;
            }

            antall[0] += kast[i] == 1 ? 1 : 0;
            antall[1] += kast[i] == 2 ? 1 : 0;
            antall[2] += kast[i] == 3 ? 1 : 0;
            antall[3] += kast[i] == 4 ? 1 : 0;
            antall[4] += kast[i] == 5 ? 1 : 0;
            antall[5] += kast[i] == 6 ? 1 : 0;
        }

    }

}
