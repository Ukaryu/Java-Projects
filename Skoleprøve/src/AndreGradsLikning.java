import easyIO.*;

public class AndreGradsLikning{

    public static void main(String[] args){

        In tast = new In();
        Out skjerm = new Out();

        int tilfelle1 = 0;
        int tilfelle2 = 0;
        int tilfelle3 = 0;

        skjerm.out("Hvor mange likninger skal løses: ");
        int antallLikninger = tast.inInt();

        for (int i = 0; i < antallLikninger; i++){

            skjerm.out("Skriv inn a-verdien: ");
            double a = tast.inInt();

            skjerm.out("Skriv inn b-verdien: ");
            double b = tast.inInt();

            skjerm.out("Skriv inn c-verdien: ");
            double c = tast.inInt();


            double avhengighetsVerdi = ((b * b) - 4 * a * c);


            if (avhengighetsVerdi < 0){

                skjerm.outln("Ligningen har ingen reele løsninger");

                        tilfelle1++;

            } else if(avhengighetsVerdi == 0){

                double x = -(b / (2 * a));

                skjerm.out("Ligningen har en dobbelrot: " + x);

                tilfelle2++;

            } else{

                double x1 = ((-b + Math.sqrt(avhengighetsVerdi) / (2 * a)));

                double x2 = ((-b - Math.sqrt(avhengighetsVerdi) / (2 * a)));

                skjerm.outln("Ligningen har røttene x1 = " + x1 + " og x2 = " + x2);

                tilfelle3++;

            }


        }

        skjerm.outln();
        skjerm.outln("Det var " + tilfelle1 + " ligninger for tilfelle 1.");
        skjerm.outln();
        skjerm.outln("Det var " + tilfelle2 + " ligninger for tilfelle 2.");
        skjerm.outln();
        skjerm.outln("Det var " + tilfelle3 + " ligninger for tilfelle 3.");



    }




}
	
	