package oppgave1;

/**
 * Created by Martin on 15.12.2014.
 */
public class tall {
    static int t;

    static void giVerdi(int v){
        t = v;
        System.out.println(t);
    }

    static void okt(int okning){
        t += okning;
        System.out.println(t);
    }
}
