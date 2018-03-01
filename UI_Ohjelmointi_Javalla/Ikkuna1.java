import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ikkuna1 extends JFrame {


	
	private static final long serialVersionUID = 1L;
	private JLabel lbl;
	private ImageIcon kuva;
	

	public Ikkuna1() {
		
		/*
		 * framen koko, framen ja pelin nimi,
		 * absoluuttinen layoutti
		*/
		setSize(1000,800); 
		setTitle("GEOMETRIAPELI"); 
		setLayout(null);
		 
		// kuvan lisääminen JLabeliin
		kuva = new ImageIcon (getClass().getResource("Ympyrä.jpg"));
		lbl = new JLabel (kuva);
		
			//sijainti
			Dimension paikka_kuva = lbl.getPreferredSize();													
			lbl.setBounds(165, 280, paikka_kuva.width, paikka_kuva.height);
		
				add(lbl);
		
		//JLabelin lisäys, sijainti, teksti yms		
		JLabel kysymys = new JLabel("MIKÄ KUVIO KUVASSA ON?"); 
				
			Dimension koko_kysymys = kysymys.getPreferredSize();													
			kysymys.setBounds(300, 100, koko_kysymys.width, koko_kysymys.height);
			
				add(kysymys);	
				
					kysymys.setFont(new Font("Serif", Font.PLAIN, 38));
					kysymys.setSize(500,30);
			

		//kysymys JLabel	
		JLabel kysymysNum = new JLabel("1/1"); 
					
			Dimension koko_kysymysNum = kysymysNum.getPreferredSize();													
			kysymysNum.setBounds(300, 230, koko_kysymysNum.width, koko_kysymysNum.height);	
			
				add(kysymysNum);
			
					kysymysNum.setFont(new Font("Serif", Font.BOLD, 25));
					kysymysNum.setSize(50,30);

			/*
			 *  lisää"kysymysnumero"-labelin sekä
			 *  asettaa fontin ja sijainnin
			*/
			
			
		//sama ohjenappi kuin edellisessä ikkunassa				
		JButton ohjenappula = new JButton("?"); 
			
			
			Dimension koko_ohjenappula = ohjenappula.getPreferredSize();													
			ohjenappula.setBounds(40, 722, koko_ohjenappula.width, koko_ohjenappula.height);
			
				add(ohjenappula);	
			
					ohjenappula.setFont(new Font("Serif", Font.BOLD, 32));
					ohjenappula.setSize(50,50);
					
					ohjenappula.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							
							if(e.getActionCommand().equals("?"));
							
							OhjeIkkuna oi = new OhjeIkkuna();
							oi.setVisible(true);
							oi.setSize(800,800);
							oi.setTitle("Ohjeet");
		
						}
					});
				
		//pelin lopetusnappi jossa muotoilu, toiminnot jne.			
		JButton lopetus = new JButton("LOPETA PELI >>>");
		
		
		
			Dimension paikka_lopetus = lopetus.getPreferredSize();
			
			lopetus.setBounds(650, 700, paikka_lopetus.width, paikka_lopetus.height);
			lopetus.setSize(200, 50);
			lopetus.setBackground(Color.CYAN);
			lopetus.setFont(new Font("Serif", Font.ITALIC, 20));
					add(lopetus);		
					
					lopetus.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							if(e.getActionCommand().equals("LOPETA PELI"));
							
							
							dispose();	
						}
					});
			

		//radiopainikkeet vastaamiseen
		JRadioButton vastaus1 = new JRadioButton("Kolmio"); 
		JRadioButton vastaus2 = new JRadioButton("Ympyrä"); 
		JRadioButton vastaus3 = new JRadioButton("Neliö"); 
		
			//radionappien ryhmä
		    ButtonGroup radionapit = new ButtonGroup();
		    radionapit.add(vastaus1);
		    radionapit.add(vastaus2);
		    radionapit.add(vastaus3);
		
			
				Dimension koko_vastaus1 = vastaus1.getPreferredSize();
				Dimension koko_vastaus2 = vastaus2.getPreferredSize();	
				Dimension koko_vastaus3 = vastaus3.getPreferredSize();	
										
					vastaus1.setBounds(500, 340, koko_vastaus1.width, koko_vastaus1.height);
					vastaus2.setBounds(500, 400, koko_vastaus2.width, koko_vastaus1.height);
					vastaus3.setBounds(500, 460, koko_vastaus3.width, koko_vastaus1.height);
						
						add(vastaus1);
						add(vastaus2);	
						add(vastaus3);
						
						//nappien 1,2,3 toiminnot
						vastaus1.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								if(e.getActionCommand().equals("Kolmio"));
								
								vastaus1.setBackground(Color.RED);
								vastaus1.setSize(200,20);
								vastaus1.setText("Hmmmm, Hävisit pelin!");
								
							}
						});
						
						vastaus3.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								if(e.getActionCommand().equals("Kolmio"));
								
								vastaus3.setBackground(Color.RED);
								vastaus3.setSize(200,20);
								vastaus3.setText("Hmmmm, Hävisit pelin!");
								
							}
						});
						
							vastaus2.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									
									if(e.getActionCommand().equals("Ympyrä"));
									
									vastaus2.setBackground(Color.GREEN);
									vastaus2.setSize(200,20);
									vastaus2.setText("JESSSS, Voitit pelin!");
											
									
								}
							});
								
						} 
}
