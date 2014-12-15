public class Student{

    private String navn;
    private int studentNummer;
    private boolean dataStudent;


    Student(){

        navn = "NN";
        studentNummer = 0;
        dataStudent = false;

    }

    Student(String navn, int studentNummer, boolean dataStudent){

        this.navn = navn;
        this.studentNummer = studentNummer;
        this.dataStudent = dataStudent;

    }

    public String getNavn(){

        return navn;

    }

    public int getStudentNummer(){

        return studentNummer;

    }

    public boolean getDataStudent(){

        return dataStudent;

    }

    public void skrivStudent(){

        System.out.println("Navn: " + getNavn());
        System.out.println("Studentnr: " + getStudentNummer());
        System.out.print("Datastudent: ");

        if (getDataStudent()){

            System.out.println("ja");

        } else{

            System.out.println("nei");

        }

    }

}