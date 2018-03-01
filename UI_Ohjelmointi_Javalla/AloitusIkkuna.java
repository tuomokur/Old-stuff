import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AloitusIkkuna extends JFrame {
		
		private static final long serialVersionUID = 1L;
		private JLabel peliNimi;
		JButton aloita;
		
		public AloitusIkkuna() {
			//framen koko, -otsikko ja -layout
			setSize(1000,800); 
			setTitle("GEOMETRIAPELI"); 
			setLayout(null);
	 

			
			//Aloituspainike
			aloita = new JButton("ALOITA");
			
			// napin sijainti gridissi
			Dimension paikka_aloita = aloita.getPreferredSize();													
			aloita.setBounds(350, 330, paikka_aloita.width, paikka_aloita.height);
			
				// napin koko, -fontti, -väri ja lisäys
				aloita.setSize(280,120);
				aloita.setFont(new Font("Serif", Font.BOLD, 20));
				aloita.setBackground(Color.GREEN);
				add(aloita);
				
				//actionListeneri napille
				aloita.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						//ehto
						if(e.getActionCommand().equals("ALOITA"));
						
						// avaa uuden ikkunan ja poistaa edellisen
						Ikkuna1 i1 = new Ikkuna1();
						
						i1.setLocationRelativeTo(null);
						i1.setVisible(true);
						i1.setResizable(false);
						dispose();

					}
				});
				
			
			//Pelin nimiteksti JLabelissa
			peliNimi= new JLabel("Geometriapeli"); 
			
				//paikka, lisäys, fontti ja koko
				Dimension paikka_peliNimi = peliNimi.getPreferredSize();													
				peliNimi.setBounds(360, 220, paikka_peliNimi.width, paikka_peliNimi.height);
				
					add(peliNimi);	
					
						peliNimi.setFont(new Font("Serif", Font.BOLD, 42));
						peliNimi.setSize(500,50);
				
			//pelin ohjenappula
			JButton ohjenappula = new JButton("?"); 
				
				//sijainti, lisäys, actionlistener yms.
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
					}
}
