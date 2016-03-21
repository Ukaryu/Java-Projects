package Oppgave5.d;

/**
 * Created by Martin on 11.05.2015.
 */
public class main {
    public static void main(String[] args) {
        Student a = new Student(10, "Ole");
        Student b = new Student(10, "Ole");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        b = a;
        System.out.println(b.hashCode());
    }
}
