import easyIO.*;

/**
 * Created by Martin on 11.09.2014.
 */

public class oppgave4 {
    public static void main(String[] args) {
        Out skjerm = new Out();

        double [] grader = new double[13];
        double [] radianer = new double[13];
        double [] sin = new double[13];
        double [] cos = new double[13];
        int i;

        for (i = 0; i < 13; i++){
            grader [i] += i*15;
            radianer [i]= (Math.PI * grader [i]) / 180;
            sin[i]= Math.sin(radianer[i]);
            cos[i]= Math.cos(radianer[i]);
        }

        skjerm.out("x i grader" ,24, Out.CENTER);
        skjerm.out("x i radianer",24, Out.CENTER);
        skjerm.out("sin(x)", 24, Out.CENTER);
        skjerm.outln("cos(x)", 24, Out.CENTER);

        for (i = 0; i < 95; i++){
            skjerm.out("-");

        }
        skjerm.outln("-");


        for (i = 0; i < 13; i++){
            skjerm.out(grader[i], 3, 24,Out.CENTER);
            skjerm.out(radianer[i], 3, 24, Out.CENTER);
            skjerm.out(sin[i], 3, 24, Out.CENTER);
            skjerm.outln(cos[i], 3, 24, Out.CENTER);

        }

        for (i = 0; i < 96; i++){
            skjerm.out("-");

        }

    }

}
