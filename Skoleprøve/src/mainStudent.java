/**
 * Created by Martin on 22.10.2014.
 */
public class mainStudent {

        public static void main(String[] args){

            String navn1 = "Ole Olsen";
            int studentNummer1 = 12345;
            boolean dataStudent1 = false;

            String navn2 = "Kari Nilsen";
            int studentNummer2 = 12346;
            boolean dataStudent2 = true;

            Student s1 = new Student();
            Student s2 = new Student(navn1, studentNummer1, dataStudent1);
            Student s3 = new Student(navn2, studentNummer2, dataStudent2);

            s1.skrivStudent();
            s2.skrivStudent();
            s3.skrivStudent();


        }
}
