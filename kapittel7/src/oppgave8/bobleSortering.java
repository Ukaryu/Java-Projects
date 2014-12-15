package oppgave8;

/**
 * Created by Martin on 15.12.2014.
 */
public class bobleSortering {


    public void bobleSort(int a []){
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
                        for (int elem : a){
                            System.out.println(elem);
                        }
                    }
                }

            }
        }



    }
}
