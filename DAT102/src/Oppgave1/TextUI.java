package Oppgave1;

import java.util.*;

/**
 * Created by Martin on 13.05.2015.
 */
public class TextUI {
    private CDArchive cda = new CDArchive();
    private Scanner keys = new Scanner(System.in);

    public void menu(){
        boolean end = false;

        while (!end){
            System.out.println();
            System.out.println("Choose what you wish to do by entering the corresponding number in the menu: ");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("1. Add a CD");
            System.out.println("2. Delete a CD");
            System.out.println("3. Search for a CD by title");
            System.out.println("4. Search for CDs by an artist");
            System.out.println("5. Exit program");

            int choice = Integer.parseInt(keys.nextLine());

            switch (choice){
                case 1:
                    inputCD();
                    break;
                case 2:
                    System.out.println("Enter title of the CD you wish to delete: ");
                    System.out.println("--------------------------------------------");
                    cda.delCD(keys.nextLine());
                    break;
                case 3:
                    System.out.println("Enter the title of the CD you wish to find: ");
                    System.out.println("--------------------------------------------");
                    outputCDs(keys.nextLine());
                    break;
                case 4:
                    System.out.println("Enter the name of the artist: ");
                    System.out.println("--------------------------------------------");
                    outputCDsByArtists(keys.nextLine());
                    break;
                case 5:
                    end = true;
            }
        }
    }

    public void inputCD(){
        CD newCD = null;

        System.out.println("Please input the information about the CD that you wish to add: ");

        System.out.println("Serial number of CD:");
        int numCD = Integer.parseInt(keys.nextLine());
        System.out.println("Name of artist: ");
        String artist = keys.nextLine();
        System.out.println("Title of CD: ");
        String titleCD = keys.nextLine();
        System.out.println("Year of release: ");
        int year = Integer.parseInt(keys.nextLine());
        System.out.println("Name of company: ");
        String company = keys.nextLine();
        System.out.println();

        newCD = new CD(numCD,artist,titleCD,year,company);
        cda.addCD(newCD);
    }

    public void outputCDs(String s) {
        ArrayList<CD> arr = cda.fetchCD(s);


        for (CD elem : arr) {

            System.out.println("CD serial number: " + elem.getCdNum());
            System.out.println("CD title: " + elem.getCdTittel());
            System.out.println("Artist/Group: " + elem.getArtist());
            System.out.println("Company: " + elem.getCompany());
            System.out.println("Year of release: " + elem.getYear());
            System.out.println();

        }
    }

    public void outputCDsByArtists(String s) {
        ArrayList<String> artists = cda.fetchArtist(s);
        ArrayList<CD> arr = new ArrayList<CD>();

        for (String elem : artists) {

            for (CD element : cda.fetchCD(elem)) {

                if (!arr.contains(element)) {
                    arr.add(element);
                }
            }

        }

        for (CD elem : arr) {

            System.out.println("CD serial number: " + elem.getCdNum());
            System.out.println("CD title: " + elem.getCdTittel());
            System.out.println("Artist/Group: " + elem.getArtist());
            System.out.println("Company: " + elem.getCompany());
            System.out.println("Year of release: " + elem.getYear());
            System.out.println();

        }
    }
}
