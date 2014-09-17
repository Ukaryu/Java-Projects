import easyIO.*;
/**
 * Created by Martin on 12.09.2014.
 */
public class palindrom {

    public static void main(String[] args) {
        Out skjerm = new Out();
        In tast = new In();

        skjerm.outln("Skriv inn ordet som skal vurderes: ");
        String pal = tast.inLine();
        int v = 0;
        int h = pal.length() - 1;
        boolean palindrom = true;

        while (v < h) {
            if (pal.charAt(v) != pal.charAt(h) ){
                palindrom = false;
            }
            v++;
            h--;
        }

        if(palindrom){
            skjerm.out(pal + " er et palindrom");
        } else {
            skjerm.out(pal + " er ikke et palindrom");
        }
    }
}
