/**
 * Created by Martin on 04.11.2014.
 */
public class Oppgave3 {
    public static void main(String[] args) {
        Person liste [] = {new Student("Martin", "Robertsen", 1995, 146167, "4HDATA"),
                           new Student("Ola", "Nordmann", 1994, 146169, "4HDATA"),
                           new Lerer("Åge", "Endresen", 1960, 20000, 400),
                           new Lerer("June", "Helen", 1980, 17000, 420)};

        for (Person elem : liste){
            Person p = elem;
            p.skrivData();
        }
    }
}
