package mybrowser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.swing.*;

public class GoBtnListener implements ActionListener {

	private JTextArea webpagetextarea;
	private JTextField urltextfield;

	public GoBtnListener(JTextArea webpagetextarea, JTextField urltextfield) {
		this.webpagetextarea = webpagetextarea;
		this.urltextfield = urltextfield;
	}

	public void actionPerformed(ActionEvent e) {

		String urlstr = urltextfield.getText();
		String text = "";

		// TODO - START
		

			
        try{

            URL url = new URL("http://" + urlstr);

            Scanner in = new Scanner(url.openStream());

            int antall = 0;

            while(antall < MyBrowser.MAX_LINES && in.hasNextLine()) {
                String linje = in.nextLine();
                antall++;

                text += "\n" + linje;
            }


            // put the text into the web text area
            webpagetextarea.setText(text);

            // close the Scanner;

        } catch (MalformedURLException mfe) {
            webpagetextarea.setText("URL ikke gyldig");
        }  catch (IOException ioe){
            webpagetextarea.setText("Websiden finnnes ikke");
        } finally {
            urltextfield.setText("");
        }
	}
}
