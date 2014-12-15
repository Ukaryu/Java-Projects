package utfilTest;

import easyIO.Out;

/**
 * Created by Martin on 15.12.2014.
 */
public class test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++){
            Out utfil = new Out(i + ".txt");
            utfil.outln(i + " test");
            utfil.close();
        }



    }
}
