import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OhjeIkkuna extends JFrame {
	
	JTextArea ohjeet;
	JLabel ohjeOtsikko;
	JButton sulje;
	
	
	public OhjeIkkuna(){
	
	setLayout(null);
	
	//ohjeen lopetusnappi
	sulje = new JButton("SULJE");
	
		//sijainti
		Dimension paikka_sulje = sulje.getPreferredSize();		
		sulje.setBounds(320, 650, paikka_sulje.width, paikka_sulje.height);
		sulje.setSize(150, 70);
		
			add(sulje);
		
			sulje.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
				
					if(e.getActionCommand().equals("SULJE"));
					
					dispose(); 
			}
		});
		
	//JLabel ohjeen otsikolle
	ohjeOtsikko = new JLabel("Ohjeet");
	
		Dimension paikka_ohjeOtsikko = ohjeOtsikko.getPreferredSize();		
		ohjeOtsikko.setBounds(350, 40, paikka_ohjeOtsikko.width, paikka_ohjeOtsikko.height);
		
			ohjeOtsikko.setFont(new Font("Serif", Font.BOLD, 35));
			ohjeOtsikko.setVisible(true);
			ohjeOtsikko.setSize(150, 70);
	
		add(ohjeOtsikko);
		
	//ohjeet teksti
	ohjeet = new JTextArea
	("Valitse kuvassa näkyvän kuvion nimi eri vaihtoehdoista. "
	+ "Huom! Voit tehdä valinnan vain kerran, joten mieti ennen kuin vastaat."
	+ "Vastauksen väri kertoo oliko vastaus oikein."
	+ " Vihreä on oikein ja punainen väärin."
	+ " Pelin voit lopettaa Lopeta peli>>>-napista."); 

				//tekstin rajoitus textArea komponentin reunoihin
				ohjeet.setLineWrap(true);
				ohjeet.setWrapStyleWord(true);
				ohjeet.setEditable(false);

					//sijainti
					Dimension paikka_ohjeet = ohjeet.getPreferredSize();													
					ohjeet.setBounds(150, 100, paikka_ohjeet.width, paikka_ohjeet.height);
						//lisäys
						add(ohjeet);	
							//fontti ja koko
							ohjeet.setFont(new Font("Serif", Font.BOLD, 30));
							ohjeet.setSize(500,500);
	}
	
}
