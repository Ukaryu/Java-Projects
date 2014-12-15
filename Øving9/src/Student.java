/**
 * Created by Martin on 04.11.2014.
 */
public class Student extends Person{
    private int studentNummer;
    private String klasse;

    Student(String fornavn, String etternavn, int fodselsaar, int studentNummer, String klasse){
        super(fornavn,etternavn,fodselsaar);
        this.studentNummer = studentNummer;
        this.klasse = klasse;

    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public String getKlasse() {
        return klasse;
    }

    public void skrivData(){
        skjerm.outln("Navn: " + getFornavn() + " " + getEtternavn());
        skjerm.outln("Fødelsår: " + getFodselsaar());
        skjerm.outln("Studentnummer: " + studentNummer);
        skjerm.outln("Klasse: " + klasse);
        skjerm.outln();
    }
}
