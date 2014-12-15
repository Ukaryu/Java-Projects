package oppgave3;

/**
 * Created by Martin on 15.12.2014.
 */
public class snitt {
    double snittet;

    public double gjennomsnitt(int [] a){
        for (int elem : a){
            snittet += elem;
        }
        snittet = snittet / a.length;

        return snittet;
    }
}
