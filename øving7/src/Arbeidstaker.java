import easyIO.Out;

/**
 * Created by Martin on 14.10.2014.
 */
public class Arbeidstaker {
    final double TOTALETIMER = 37.5;
    String navn;
    double timelon;
    double antallTimer;
    int skatteprosent;

    Arbeidstaker(){
        navn = "Martin";
        timelon = 160;
        antallTimer = 40;
        skatteprosent = 20;
    }

    Arbeidstaker(String navn, double timelon, double antallTimer, int skatteprosent){
        this.navn = navn;
        this.timelon = timelon;
        this.antallTimer = antallTimer;
        this.skatteprosent = skatteprosent;
    }

    public String getNavn() {
        return navn;
    }

    public double getTimelon() {
        return timelon;
    }

    public double getAntallTimer() {
        return antallTimer;
    }

    public int getSkatteprosent() {
        return skatteprosent;
    }

    public double finnOvertidsTimer(){
        double overtid = antallTimer - TOTALETIMER;
        if (overtid < 0){
            return 0;
        } else {
            return overtid;
        }
    }

    public double finnBruttolon(){
        double overtid = 0;

        if (finnOvertidsTimer() > 0)
            overtid = timelon * finnOvertidsTimer() * 1.50;

        return timelon * (antallTimer - finnOvertidsTimer()) + overtid;
}

    public double finnSkatt(){
        double skatt = (skatteprosent * finnBruttolon()) / 100;

        return skatt;
    }

    public double finnNettolon(){
        double netto = (finnBruttolon() - finnSkatt());

        return netto;
    }
    static void overskrift(){
        Out skjerm = new Out();

        System.out.format("%-20s %8s %10s %8s %10s %10s %10s", "Navn", "Timer", "TLønn", "OTimer", "Brutto", "Skatt", "Netto");
        System.out.println();
        for (int i = 0; i < 30; i++){
            System.out.print("---");
        }
        System.out.println("---");
    }

    public void skrivUt(){
        Out skjerm = new Out();
        System.out.format("%-20s %8s %10s %8s %10s %10s %10s", getNavn(), getAntallTimer(), getTimelon(), finnOvertidsTimer(), finnBruttolon(), finnSkatt(), finnNettolon());
        System.out.println();

    }
}
