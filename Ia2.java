package Projet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Ia2 extends JFrame implements ActionListener{

	//attributs, création des boutons et des zones de texte
	

	private JButton bouton1 = new JButton("");
	private JButton bouton2 = new JButton("");
	private	JButton bouton3 = new JButton("");
	private JButton bouton4 = new JButton("");
	private JButton bouton5 = new JButton("");
	private JButton bouton6 = new JButton("");
	private JButton bouton7 = new JButton("");
	private JButton bouton8 = new JButton("");
	private JButton bouton9 = new JButton("");
	
	private JButton bReset = new JButton("Recommencer");
	
	private JLabel label = new JLabel("C'est le tour de 0");
	
	
	private JComboBox<String> choixDiff;
	
	
	public Ia2() {  //création de la structure de la fenetre

		
	    setSize(600, 600);
	    
	    setTitle("Morpion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);

		
		JPanel panelg = new JPanel();
		JPanel interf = new JPanel();
		
		
		panelg.setLayout(new GridLayout(3, 3)) ;


	
		choixDiff = new JComboBox<>();

		choixDiff.addItem("JCJ");
		choixDiff.addItem("Normal");
		choixDiff.addItem("Difficile");
		choixDiff.addItem("Facile");
		
		panelg.add(bouton1);
		panelg.add(bouton2);
		panelg.add(bouton3);
		panelg.add(bouton4);
		panelg.add(bouton5);
		panelg.add(bouton6);
		panelg.add(bouton7);
		panelg.add(bouton8);
		panelg.add(bouton9);
		
		bouton1.addActionListener(this);
		bouton2.addActionListener(this);
		bouton3.addActionListener(this);
		bouton4.addActionListener(this);
		bouton5.addActionListener(this);
		bouton6.addActionListener(this);
		bouton7.addActionListener(this);
		bouton8.addActionListener(this);
		bouton9.addActionListener(this);
		bReset.addActionListener(this);
		
		//attributions des objets dans les panels
		
		
		interf.add(choixDiff);
		interf.add(bReset);
		
		this.add(interf,BorderLayout.NORTH);
		this.add(label,BorderLayout.SOUTH);
		this.add(panelg);

		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//debut du jeu
		
//		label.setText("C'est le tour de " + Joueurs.getJc());
		
		
		if(choixDiff.getSelectedItem().toString() == "JCJ"){
		
			TourJCJ(bouton1,arg0);
			TourJCJ(bouton2,arg0);
			TourJCJ(bouton3,arg0);
			TourJCJ(bouton4,arg0);
			TourJCJ(bouton5,arg0);
			TourJCJ(bouton6,arg0);
			TourJCJ(bouton7,arg0);
			TourJCJ(bouton8,arg0);
			TourJCJ(bouton9,arg0);
			
		}
		
		else if (choixDiff.getSelectedItem().toString() == "Facile"){
			
			TourFacile(bouton1,arg0);
			TourFacile(bouton2,arg0);
			TourFacile(bouton3,arg0);
			TourFacile(bouton4,arg0);
			TourFacile(bouton5,arg0);
			TourFacile(bouton6,arg0);
			TourFacile(bouton7,arg0);
			TourFacile(bouton8,arg0);
			TourFacile(bouton9,arg0);
			
		}
		
		Reset(arg0);
		
	}

		
	
	public void TourJCJ(JButton bouton, ActionEvent arg0){  //appuyer sur le bouton pour placer la valeur dans la case
		Jeu(bouton,arg0);
//		if(arg0.getSource() == bouton && bouton.getText() == "") {
//			bouton.setText(Joueurs.getJc());
//
//			if(		bouton1.getText() == Joueurs.getJc()  //si 3 symboles sont allignés
//					&& bouton2.getText() == Joueurs.getJc()
//					&& bouton3.getText() == Joueurs.getJc()
//						|| bouton4.getText() == Joueurs.getJc()
//					&& bouton5.getText() == Joueurs.getJc()
//					&& bouton6.getText() == Joueurs.getJc()
//						|| bouton7.getText() == Joueurs.getJc()
//					&& bouton8.getText() == Joueurs.getJc()
//					&& bouton9.getText() == Joueurs.getJc()
//						|| bouton1.getText() == Joueurs.getJc()
//					&& bouton4.getText() == Joueurs.getJc()
//					&& bouton7.getText() == Joueurs.getJc()
//						|| bouton2.getText() == Joueurs.getJc()
//					&& bouton5.getText() == Joueurs.getJc()
//					&& bouton8.getText() == Joueurs.getJc()
//						|| bouton3.getText() == Joueurs.getJc()
//					&& bouton6.getText() == Joueurs.getJc()
//					&& bouton9.getText() == Joueurs.getJc()
//						|| bouton1.getText() == Joueurs.getJc()
//					&& bouton5.getText() == Joueurs.getJc()
//					&& bouton9.getText() == Joueurs.getJc()
//						|| bouton3.getText() == Joueurs.getJc()
//					&& bouton5.getText() == Joueurs.getJc()
//					&& bouton7.getText() == Joueurs.getJc()){
//				
//				label.setText("Le joueur " + Joueurs.getJc() + " gagne");
//				
//			}
//			
//			else if(bouton1.getText() != ""
//					&& bouton2.getText() != ""
//					&& bouton3.getText() != ""
//					&& bouton4.getText() != ""
//					&& bouton5.getText() != ""
//					&& bouton6.getText() != ""
//					&& bouton7.getText() != ""
//					&& bouton8.getText() != ""
//					&& bouton9.getText() != ""){
//				label.setText("Match nul");
//			}
//			
//			else if(Joueurs.getJc() == Joueurs.getJ1()){  //passer au tour suivant
//				Joueurs.setJc(Joueurs.getJ2());
//				label.setText("C'est le tour de " + Joueurs.getJc());
//			}else if (Joueurs.getJc() == Joueurs.getJ2()){
//				Joueurs.setJc(Joueurs.getJ1());
//				label.setText("C'est le tour de " + Joueurs.getJc());
//			}
////			label.setText("C'est le tour de " + Joueurs.getJc());
//			
//
//		}
		
	}
	
	public void TourFacile(JButton bouton, ActionEvent arg0){
		Jeu(bouton,arg0);
		JButton[] l = new JButton[9];
		
		l[0]=bouton1;
		l[1]=bouton2;
		l[2]=bouton3;
		l[3]=bouton4;
		l[4]=bouton5;
		l[5]=bouton6;
		l[6]=bouton7;
		l[7]=bouton8;
		l[8]=bouton9;
		
		int Min = 0;
		int Max = 8;
		//Joueurs.getJc() == Joueurs.getJ1()
		Random rand = new Random();
		int n = rand.nextInt(8);
		while(Joueurs.getJc() == Joueurs.getJ2() && l[n].getText() == ""){
		//	Random rand = new Random();
	//	}

			//        	 //int e = rand.nextInt(6);
//			
		//	int n = rand.nextInt(8);
//    		while (l[n].getText() == ""){
    			System.out.println(n);
//
//			//if(bouton.getText() == ""  ){
				l[n].setText(Joueurs.getJ2());
//			
				Joueurs.setJc(Joueurs.getJ1());
			}
			
	}
//	}	
	
	
	
	public void Reset(ActionEvent arg0){
		if(arg0.getSource() == bReset) {
			bouton1.setText("");
			bouton2.setText("");
			bouton3.setText("");
			bouton4.setText("");
			bouton5.setText("");
			bouton6.setText("");
			bouton7.setText("");
			bouton8.setText("");
			bouton9.setText("");
			
			bouton1.setBackground(null);
			bouton2.setBackground(null);
			bouton3.setBackground(null);
			bouton4.setBackground(null);
			bouton5.setBackground(null);
			bouton6.setBackground(null);
			bouton7.setBackground(null);
			bouton8.setBackground(null);
			bouton9.setBackground(null);
			
			Joueurs.setJc(Joueurs.getJ1());
			label.setText("C'est le tour de " + Joueurs.getJc());
		}
	}
	
	public void Jeu(JButton bouton, ActionEvent arg0){
		
		//debut du jeu
		
		if(arg0.getSource() == bouton && bouton.getText() == "") {
			bouton.setText(Joueurs.getJc());

			if(		bouton1.getText() == Joueurs.getJc()  //si 3 symboles sont allignés
					&& bouton2.getText() == Joueurs.getJc()
					&& bouton3.getText() == Joueurs.getJc()){
				bouton1.setBackground(Color.cyan);
				bouton2.setBackground(Color.cyan);
				bouton3.setBackground(Color.cyan);
				label.setText("Le joueur " + Joueurs.getJc() + " gagne");

			}
			else if(		bouton4.getText() == Joueurs.getJc()
					&& bouton5.getText() == Joueurs.getJc()
					&& bouton6.getText() == Joueurs.getJc()){
						bouton4.setBackground(Color.cyan);
						bouton5.setBackground(Color.cyan);
						bouton6.setBackground(Color.cyan);
						label.setText("Le joueur " + Joueurs.getJc() + " gagne");
						}
			else if(		bouton7.getText() == Joueurs.getJc()
					&& bouton8.getText() == Joueurs.getJc()
					&& bouton9.getText() == Joueurs.getJc()){
							bouton7.setBackground(Color.cyan);
							bouton8.setBackground(Color.cyan);
							bouton9.setBackground(Color.cyan);
							label.setText("Le joueur " + Joueurs.getJc() + " gagne");
						}
			else if(		bouton1.getText() == Joueurs.getJc()
					&& bouton4.getText() == Joueurs.getJc()
					&& bouton7.getText() == Joueurs.getJc()){
							bouton1.setBackground(Color.cyan);
							bouton4.setBackground(Color.cyan);
							bouton7.setBackground(Color.cyan);
							label.setText("Le joueur " + Joueurs.getJc() + " gagne");
							
						}
			else if( 	bouton2.getText() == Joueurs.getJc()
					&& bouton5.getText() == Joueurs.getJc()
					&& bouton8.getText() == Joueurs.getJc()){
								bouton2.setBackground(Color.cyan);
								bouton5.setBackground(Color.cyan);
								bouton8.setBackground(Color.cyan);
								label.setText("Le joueur " + Joueurs.getJc() + " gagne");
							}
			else if( 	bouton3.getText() == Joueurs.getJc()
					&& bouton6.getText() == Joueurs.getJc()
					&& bouton9.getText() == Joueurs.getJc()){
								bouton3.setBackground(Color.cyan);
								bouton6.setBackground(Color.cyan);
								bouton9.setBackground(Color.cyan);
								label.setText("Le joueur " + Joueurs.getJc() + " gagne");
							}
			else if( 	bouton1.getText() == Joueurs.getJc()
					&& bouton5.getText() == Joueurs.getJc()
					&& bouton9.getText() == Joueurs.getJc()){
								bouton1.setBackground(Color.cyan);
								bouton5.setBackground(Color.cyan);
								bouton9.setBackground(Color.cyan);
								label.setText("Le joueur " + Joueurs.getJc() + " gagne");
								
							}
			else if( 	bouton3.getText() == Joueurs.getJc()
					&& bouton5.getText() == Joueurs.getJc()
					&& bouton7.getText() == Joueurs.getJc()){
								bouton3.setBackground(Color.cyan);
								bouton5.setBackground(Color.cyan);
								bouton7.setBackground(Color.cyan);
								label.setText("Le joueur " + Joueurs.getJc() + " gagne");		
							}

			//fin fu neu si une des conditions est accomplie
			
			
			else if(bouton1.getText() != ""
					&& bouton2.getText() != ""
					&& bouton3.getText() != ""
					&& bouton4.getText() != ""
					&& bouton5.getText() != ""
					&& bouton6.getText() != ""
					&& bouton7.getText() != ""
					&& bouton8.getText() != ""
					&& bouton9.getText() != ""
					){
				label.setText("Match nul");
			}
			
			else if(Joueurs.getJc() == Joueurs.getJ1()){  //passer au tour suivant
				Joueurs.setJc(Joueurs.getJ2());
				label.setText("C'est le tour de " + Joueurs.getJc());
			}
			
			else if (Joueurs.getJc() == Joueurs.getJ2()){
				Joueurs.setJc(Joueurs.getJ1());
				label.setText("C'est le tour de " + Joueurs.getJc());
			}
//			label.setText("C'est le tour de " + Joueurs.getJc());
			

		}
		
		
	}
	
//	public void victoire(JButton b1,JButton b2,JButton b3){  // vérification de l'allignement des 3 symboles
//		if(		b1.getText() == Joueurs.getJc()  //si 3 symboles sont allignés
//				&& b2.getText() == Joueurs.getJc()
//				&& b3.getText() == Joueurs.getJc()){
//			b1.setBackground(Color.cyan);
//			b2.setBackground(Color.cyan);
//			b3.setBackground(Color.cyan);
//			label.setText("Le joueur " + Joueurs.getJc() + " gagne");
//		}
//	}
	
	

	
}

