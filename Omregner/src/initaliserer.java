import javax.swing.*;

/**
 * Created by Martin on 18.09.2014.
 */
public class initaliserer {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new omregner(); // Åpner vinduet som kaller inn funksjonene fra "lytter"-klassen

            }
        });


    }
}
