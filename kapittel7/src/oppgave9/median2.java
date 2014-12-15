package oppgave9;

/**
 * Created by Martin on 15.12.2014.
 */
public class median2 {
    int medi;

    public int median(int a []){
        int k = 0;
        boolean usortert = true;

        while (usortert){

            for (int i = 0; i < a.length; i++){

                if(!(i+1==a.length)) {

                    if (a[i] > a[i + 1]) {

                        k = a[i + 1];
                        a[i + 1] = a[i];
                        a[i] = k;
                        usortert = true;
                        break; //Hvis et siffer ikke står i stigende rekkefølge så byttes de om og løkken blir brutt

                    } else if (i+2==a.length){
                        usortert=false;
                    }
                }

            }
        }

        int index = 0;
        if (a.length % 2 == 0){
            index = (a.length / 2) - 1;
            medi = (a[index]+ a[index +1]) / 2;
        } else if (!(a.length % 2 == 0)){
            index = (a.length / 2) - 1;
            medi = a[index];
        }

        return medi;
    }
}
