package morpion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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

public class FrameComp extends JFrame implements ActionListener {

	// attributs, création des boutons et des zones de texte

	private JButton bouton1 = new JButton("");
	private JButton bouton2 = new JButton("");
	private JButton bouton3 = new JButton("");
	private JButton bouton4 = new JButton("");
	private JButton bouton5 = new JButton("");
	private JButton bouton6 = new JButton("");
	private JButton bouton7 = new JButton("");
	private JButton bouton8 = new JButton("");
	private JButton bouton9 = new JButton("");

	private JButton bReset = new JButton("Recommencer");

	private JLabel label = new JLabel("C'est le tour de O");

	private JComboBox<String> choixDiff;

	public FrameComp() { // création de la structure de la fenetre

		setSize(600, 600);

		setTitle("Morpion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLocationRelativeTo(null);
		
		//création des panels

		JPanel panelg = new JPanel();
		JPanel interf = new JPanel();

		
		//création de la grille
		panelg.setLayout(new GridLayout(3, 3));

		choixDiff = new JComboBox<>();

		choixDiff.addItem("JCJ");
		choixDiff.addItem("Facile");
		choixDiff.addItem("Normal");
		choixDiff.addItem("Difficile");
		
		//ajout des boutonds dans la grille

		panelg.add(bouton1);
		panelg.add(bouton2);
		panelg.add(bouton3);
		panelg.add(bouton4);
		panelg.add(bouton5);
		panelg.add(bouton6);
		panelg.add(bouton7);
		panelg.add(bouton8);
		panelg.add(bouton9);
		
		//ajout d'interaction
	
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
		
		//couleur des boutons

		bouton1.setBackground(Color.white);
		bouton2.setBackground(Color.white);
		bouton3.setBackground(Color.white);
		bouton4.setBackground(Color.white);
		bouton5.setBackground(Color.white);
		bouton6.setBackground(Color.white);
		bouton7.setBackground(Color.white);
		bouton8.setBackground(Color.white);
		bouton9.setBackground(Color.white);

		// attributions des objets dans les panels

		Font police = new Font("Tahoma", Font.BOLD, 16);
		Font policeB = new Font("Tahoma", Font.BOLD, 60);

		//application de la police
		
		bouton1.setFont(policeB);
		bouton2.setFont(policeB);
		bouton3.setFont(policeB);
		bouton4.setFont(policeB);
		bouton5.setFont(policeB);
		bouton6.setFont(policeB);
		bouton7.setFont(policeB);
		bouton8.setFont(policeB);
		bouton9.setFont(policeB);

		label.setFont(police);

		//ajout des composants dans l'interface en haut
		
		interf.add(choixDiff);
		interf.add(bReset);
		
		//ajout des panels dans la frame

		this.add(interf, BorderLayout.NORTH);
		this.add(label, BorderLayout.SOUTH);
		this.add(panelg);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		// debut du jeu

		//la console vérifie le niveau de difficilté dans la liste ComboBox

		if (choixDiff.getSelectedItem().toString() == "JCJ") {

			// le mode JCJ se déclenche

			Jeu(bouton1, arg0);
			Jeu(bouton2, arg0);
			Jeu(bouton3, arg0);
			Jeu(bouton4, arg0);
			Jeu(bouton5, arg0);
			Jeu(bouton6, arg0);
			Jeu(bouton7, arg0);
			Jeu(bouton8, arg0);
			Jeu(bouton9, arg0);

		}

		else if (choixDiff.getSelectedItem().toString() == "Facile") {
			
			//le niveau de difficulté Facile se déclenche

			TourFacile(bouton1, arg0);
			TourFacile(bouton2, arg0);
			TourFacile(bouton3, arg0);
			TourFacile(bouton4, arg0);
			TourFacile(bouton5, arg0);
			TourFacile(bouton6, arg0);
			TourFacile(bouton7, arg0);
			TourFacile(bouton8, arg0);
			TourFacile(bouton9, arg0);

		}

		else if (choixDiff.getSelectedItem().toString() == "Normal") {
			
			//le niveau de difficulté Normal se déclenche

			TourNormal(bouton1, arg0);
			TourNormal(bouton2, arg0);
			TourNormal(bouton3, arg0);
			TourNormal(bouton4, arg0);
			TourNormal(bouton5, arg0);
			TourNormal(bouton6, arg0);
			TourNormal(bouton7, arg0);
			TourNormal(bouton8, arg0);
			TourNormal(bouton9, arg0);

		}
		
		else if (choixDiff.getSelectedItem().toString() == "Difficile") {
			
			//le niveau de difficulté Difficile se déclenche

			TourDifficile(bouton1, arg0);
			TourDifficile(bouton2, arg0);
			TourDifficile(bouton3, arg0);
			TourDifficile(bouton4, arg0);
			TourDifficile(bouton5, arg0);
			TourDifficile(bouton6, arg0);
			TourDifficile(bouton7, arg0);
			TourDifficile(bouton8, arg0);
			TourDifficile(bouton9, arg0);

		}
		
		//on peut recommencer la partie en appuyant sur le bouton Recommencer

		Reset(arg0);
		
		//la couleur des cases est réinitialisée en cas de victoire

		couleurCase(bouton1);
		couleurCase(bouton2);
		couleurCase(bouton3);
		couleurCase(bouton4);
		couleurCase(bouton5);
		couleurCase(bouton6);
		couleurCase(bouton7);
		couleurCase(bouton8);
		couleurCase(bouton9);
	}



	public void TourFacile(JButton bouton, ActionEvent arg0) {

		Jeu(bouton, arg0);
		JButton[] l = new JButton[9];

		l[0] = bouton1;
		l[1] = bouton2;
		l[2] = bouton3;
		l[3] = bouton4;
		l[4] = bouton5;
		l[5] = bouton6;
		l[6] = bouton7;
		l[7] = bouton8;
		l[8] = bouton9;
		// Random r = new Random(Min);
		//
		// int n =r.nextInt(Max+1);
		Random rand = new Random();
		int n = rand.nextInt(8);
		// Jeu(bouton,arg0);

		while (Joueurs.getJc() == Joueurs.getJ2() && l[n].getText() == "") {
			System.out.println(n);
			l[n].setText(Joueurs.getJ2());

			if (bouton1.getText() == Joueurs.getJ2() // si 3 symboles sont
														// allignés
					&& bouton2.getText() == Joueurs.getJ2() && bouton3.getText() == Joueurs.getJ2()) {
				bouton1.setBackground(Color.yellow);
				bouton2.setBackground(Color.yellow);
				bouton3.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");

			} else if (bouton4.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2()
					&& bouton6.getText() == Joueurs.getJ2()) {
				bouton4.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton6.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			} else if (bouton7.getText() == Joueurs.getJ2() && bouton8.getText() == Joueurs.getJ2()
					&& bouton9.getText() == Joueurs.getJ2()) {
				bouton7.setBackground(Color.yellow);
				bouton8.setBackground(Color.yellow);
				bouton9.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			} else if (bouton1.getText() == Joueurs.getJ2() && bouton4.getText() == Joueurs.getJ2()
					&& bouton7.getText() == Joueurs.getJ2()) {
				bouton1.setBackground(Color.yellow);
				bouton4.setBackground(Color.yellow);
				bouton7.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");

			} else if (bouton2.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2()
					&& bouton8.getText() == Joueurs.getJ2()) {
				bouton2.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton8.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			} else if (bouton3.getText() == Joueurs.getJ2() && bouton6.getText() == Joueurs.getJ2()
					&& bouton9.getText() == Joueurs.getJ2()) {
				bouton3.setBackground(Color.yellow);
				bouton6.setBackground(Color.yellow);
				bouton9.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			} else if (bouton1.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2()
					&& bouton9.getText() == Joueurs.getJ2()) {
				bouton1.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton9.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");

			} else if (bouton3.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2()
					&& bouton7.getText() == Joueurs.getJ2()) {
				bouton3.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton7.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			}

			// fin fu neu si une des conditions est accomplie

			else if (bouton1.getText() != "" && bouton2.getText() != "" && bouton3.getText() != ""
					&& bouton4.getText() != "" && bouton5.getText() != "" && bouton6.getText() != ""
					&& bouton7.getText() != "" && bouton8.getText() != "" && bouton9.getText() != "") {
				label.setText("Match nul");
			}

			//
			Joueurs.setJc(Joueurs.getJ1());

		}

	}

	public void TourNormal(JButton bouton, ActionEvent arg0) {
		Jeu(bouton, arg0);
		System.out.println("bouton1:" + bouton1.getText());
		System.out.println("bouton2:" + bouton2.getText());
		System.out.println("bouton3:" + bouton3.getText());

		JButton[] l = new JButton[9];

		l[0] = bouton1;
		l[1] = bouton2;
		l[2] = bouton3;
		l[3] = bouton4;
		l[4] = bouton5;
		l[5] = bouton6;
		l[6] = bouton7;
		l[7] = bouton8;
		l[8] = bouton9;

		// Random r = new Random(Min);
		//
		// int n =r.nextInt(Max+1);
		Random rand = new Random();
		int n = rand.nextInt(8);

		while (Joueurs.getJc() == Joueurs.getJ2() && l[n].getText() == "") {
			


			if (bouton1.getText() == Joueurs.getJ1() // si 3 symboles sont
														// allignés
					&& bouton2.getText() == Joueurs.getJ1() && bouton3.getText() == "") {
				bouton3.setText(Joueurs.getJ2());
			} else if (bouton1.getText() == Joueurs.getJ1() // si 3 symboles
															// sont allignés
					&& bouton3.getText() == Joueurs.getJ1() && bouton2.getText() == "") {
				bouton2.setText(Joueurs.getJ2());
			}

			else if (bouton2.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton3.getText() == Joueurs.getJ1() && bouton1.getText() == "") {
				bouton1.setText(Joueurs.getJ2());
			}

			else if (bouton4.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton6.getText() == "") {
				bouton6.setText(Joueurs.getJ2());
			}

			else if (bouton4.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton6.getText() == Joueurs.getJ1() && bouton5.getText() == "") {
				bouton5.setText(Joueurs.getJ2());
			}

			else if (bouton6.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton4.getText() == "") {
				bouton4.setText(Joueurs.getJ2());
			}

			else if (bouton7.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton8.getText() == Joueurs.getJ1() && bouton9.getText() == "") {
				bouton9.setText(Joueurs.getJ2());
			}

			else if (bouton7.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton9.getText() == Joueurs.getJ1() && bouton8.getText() == "") {
				bouton8.setText(Joueurs.getJ2());
			}

			else if (bouton9.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton8.getText() == Joueurs.getJ1() && bouton7.getText() == "") {
				bouton7.setText(Joueurs.getJ2());
			}

			else if (bouton1.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton4.getText() == Joueurs.getJ1() && bouton7.getText() == "") {
				bouton7.setText(Joueurs.getJ2());
			}

			else if (bouton1.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton7.getText() == Joueurs.getJ1() && bouton4.getText() == "") {
				bouton4.setText(Joueurs.getJ2());
			}

			else if (bouton7.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton4.getText() == Joueurs.getJ1() && bouton1.getText() == "") {
				bouton1.setText(Joueurs.getJ2());
			}

			else if (bouton2.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton8.getText() == "") {
				bouton8.setText(Joueurs.getJ2());
			}

			else if (bouton2.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton8.getText() == Joueurs.getJ1() && bouton5.getText() == "") {
				bouton5.setText(Joueurs.getJ2());
			}

			else if (bouton8.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton2.getText() == "") {
				bouton2.setText(Joueurs.getJ2());
			}

			else if (bouton3.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton6.getText() == Joueurs.getJ1() && bouton9.getText() == "") {
				bouton9.setText(Joueurs.getJ2());
			}

			else if (bouton3.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton9.getText() == Joueurs.getJ1() && bouton6.getText() == "") {
				bouton6.setText(Joueurs.getJ2());
			}

			else if (bouton9.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton6.getText() == Joueurs.getJ1() && bouton3.getText() == "") {
				bouton3.setText(Joueurs.getJ2());
			}

			else if (bouton1.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton9.getText() == "") {
				bouton9.setText(Joueurs.getJ2());
			}

			else if (bouton1.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton9.getText() == Joueurs.getJ1() && bouton5.getText() == "") {
				bouton5.setText(Joueurs.getJ2());
			}

			else if (bouton9.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton1.getText() == "") {
				bouton1.setText(Joueurs.getJ2());
			}

			else if (bouton3.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton7.getText() == "") {
				bouton7.setText(Joueurs.getJ2());
			}

			else if (bouton3.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton7.getText() == Joueurs.getJ1() && bouton5.getText() == "") {
				bouton5.setText(Joueurs.getJ2());
			}

			else if (bouton7.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton3.getText() == "") {
				bouton3.setText(Joueurs.getJ2());
			}

			else {
				l[n].setText(Joueurs.getJ2());
			}

			if (bouton1.getText() == Joueurs.getJ2() // si 3 symboles sont
														// allignés
					&& bouton2.getText() == Joueurs.getJ2() && bouton3.getText() == Joueurs.getJ2()) {
				bouton1.setBackground(Color.yellow);
				bouton2.setBackground(Color.yellow);
				bouton3.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");

			} else if (bouton4.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2()
					&& bouton6.getText() == Joueurs.getJ2()) {
				bouton4.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton6.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			} else if (bouton7.getText() == Joueurs.getJ2() && bouton8.getText() == Joueurs.getJ2()
					&& bouton9.getText() == Joueurs.getJ2()) {
				bouton7.setBackground(Color.yellow);
				bouton8.setBackground(Color.yellow);
				bouton9.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			} else if (bouton1.getText() == Joueurs.getJ2() && bouton4.getText() == Joueurs.getJ2()
					&& bouton7.getText() == Joueurs.getJ2()) {
				bouton1.setBackground(Color.yellow);
				bouton4.setBackground(Color.yellow);
				bouton7.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");

			} else if (bouton2.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2()
					&& bouton8.getText() == Joueurs.getJ2()) {
				bouton2.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton8.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			} else if (bouton3.getText() == Joueurs.getJ2() && bouton6.getText() == Joueurs.getJ2()
					&& bouton9.getText() == Joueurs.getJ2()) {
				bouton3.setBackground(Color.yellow);
				bouton6.setBackground(Color.yellow);
				bouton9.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			} else if (bouton1.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2()
					&& bouton9.getText() == Joueurs.getJ2()) {
				bouton1.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton9.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");

			} else if (bouton3.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2()
					&& bouton7.getText() == Joueurs.getJ2()) {
				bouton3.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton7.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			}

			// fin fu neu si une des conditions est accomplie

			else if (bouton1.getText() != "" && bouton2.getText() != "" && bouton3.getText() != ""
					&& bouton4.getText() != "" && bouton5.getText() != "" && bouton6.getText() != ""
					&& bouton7.getText() != "" && bouton8.getText() != "" && bouton9.getText() != "") {
				label.setText("Match nul");
			}

			//
			Joueurs.setJc(Joueurs.getJ1());
		}

	}

	public void TourDifficile(JButton bouton, ActionEvent arg0) {

		Jeu(bouton, arg0);
		System.out.println("bouton1:" + bouton1.getText());
		System.out.println("bouton2:" + bouton2.getText());
		System.out.println("bouton3:" + bouton3.getText());

		JButton[] l = new JButton[9];

		l[0] = bouton1;
		l[1] = bouton2;
		l[2] = bouton3;
		l[3] = bouton4;
		l[4] = bouton5;
		l[5] = bouton6;
		l[6] = bouton7;
		l[7] = bouton8;
		l[8] = bouton9;

		// Random r = new Random(Min);
		//
		// int n =r.nextInt(Max+1);
		Random rand = new Random();
		int n = rand.nextInt(8);

		while (Joueurs.getJc() == Joueurs.getJ2() && l[n].getText() == "") {
			
			if(bouton5.getText() == "")
				bouton5.setText(Joueurs.getJ2());
			
			//difficile L'ia fait des choix stratégiques
			
			
//			else if(bouton3.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2() && bouton7.getText() == ""){
//				bouton7.setText(Joueurs.getJ2());
//				}
			
//			else if(bouton3.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2() && bouton6.getText() == ""){
//				
//				if(bouton7.getText() == Joueurs.getJ1()){
//					bouton4.setText(Joueurs.getJ2());
//				}else{	bouton6.setText(Joueurs.getJ2());}
//			}
//			else if(bouton3.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2() && bouton7.getText() == "")
//				bouton7.setText(Joueurs.getJ2());

			
			else if (bouton1.getText() == Joueurs.getJ1() 
					&& bouton2.getText() == Joueurs.getJ1() && bouton3.getText() == "") {
				bouton3.setText(Joueurs.getJ2());
			} else if (bouton1.getText() == Joueurs.getJ1() // si 3 symboles
															// sont allignés
					&& bouton3.getText() == Joueurs.getJ1() && bouton2.getText() == "") {
				bouton2.setText(Joueurs.getJ2());
			}

			else if (bouton2.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton3.getText() == Joueurs.getJ1() && bouton1.getText() == "") {
				bouton1.setText(Joueurs.getJ2());
			}

			else if (bouton4.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton6.getText() == "") {
				bouton6.setText(Joueurs.getJ2());
			}

			else if (bouton4.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton6.getText() == Joueurs.getJ1() && bouton5.getText() == "") {
				bouton5.setText(Joueurs.getJ2());
			}

			else if (bouton6.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton4.getText() == "") {
				bouton4.setText(Joueurs.getJ2());
			}

			else if (bouton7.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton8.getText() == Joueurs.getJ1() && bouton9.getText() == "") {
				bouton9.setText(Joueurs.getJ2());
			}

			else if (bouton7.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton9.getText() == Joueurs.getJ1() && bouton8.getText() == "") {
				bouton8.setText(Joueurs.getJ2());
			}

			else if (bouton9.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton8.getText() == Joueurs.getJ1() && bouton7.getText() == "") {
				bouton7.setText(Joueurs.getJ2());
			}

			else if (bouton1.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton4.getText() == Joueurs.getJ1() && bouton7.getText() == "") {
				bouton7.setText(Joueurs.getJ2());
			}

			else if (bouton1.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton7.getText() == Joueurs.getJ1() && bouton4.getText() == "") {
				bouton4.setText(Joueurs.getJ2());
			}

			else if (bouton7.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton4.getText() == Joueurs.getJ1() && bouton1.getText() == "") {
				bouton1.setText(Joueurs.getJ2());
			}

			else if (bouton2.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton8.getText() == "") {
				bouton8.setText(Joueurs.getJ2());
			}

			else if (bouton2.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton8.getText() == Joueurs.getJ1() && bouton5.getText() == "") {
				bouton5.setText(Joueurs.getJ2());
			}

			else if (bouton8.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton2.getText() == "") {
				bouton2.setText(Joueurs.getJ2());
			}

			else if (bouton3.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton6.getText() == Joueurs.getJ1() && bouton9.getText() == "") {
				bouton9.setText(Joueurs.getJ2());
			}

			else if (bouton3.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton9.getText() == Joueurs.getJ1() && bouton6.getText() == "") {
				bouton6.setText(Joueurs.getJ2());
			}

			else if (bouton9.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton6.getText() == Joueurs.getJ1() && bouton3.getText() == "") {
				bouton3.setText(Joueurs.getJ2());
			}

			else if (bouton1.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton9.getText() == "") {
				bouton9.setText(Joueurs.getJ2());
			}

			else if (bouton1.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton9.getText() == Joueurs.getJ1() && bouton5.getText() == "") {
				bouton5.setText(Joueurs.getJ2());
			}

			else if (bouton9.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton1.getText() == "") {
				bouton1.setText(Joueurs.getJ2());
			}

			else if (bouton3.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton7.getText() == "") {
				bouton7.setText(Joueurs.getJ2());
			}

			else if (bouton3.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton7.getText() == Joueurs.getJ1() && bouton5.getText() == "") {
				bouton5.setText(Joueurs.getJ2());
			}

			else if (bouton7.getText() == Joueurs.getJ1() // si 3 symboles sont
															// allignés
					&& bouton5.getText() == Joueurs.getJ1() && bouton3.getText() == "") {
				bouton3.setText(Joueurs.getJ2());
			}
			
			

			else {
				l[n].setText(Joueurs.getJ2());
			}

			if (bouton1.getText() == Joueurs.getJ2() // si 3 symboles sont
														// allignés
					&& bouton2.getText() == Joueurs.getJ2() && bouton3.getText() == Joueurs.getJ2()) {
				bouton1.setBackground(Color.yellow);
				bouton2.setBackground(Color.yellow);
				bouton3.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");

			} else if (bouton4.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2()
					&& bouton6.getText() == Joueurs.getJ2()) {
				bouton4.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton6.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			} else if (bouton7.getText() == Joueurs.getJ2() && bouton8.getText() == Joueurs.getJ2()
					&& bouton9.getText() == Joueurs.getJ2()) {
				bouton7.setBackground(Color.yellow);
				bouton8.setBackground(Color.yellow);
				bouton9.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			} else if (bouton1.getText() == Joueurs.getJ2() && bouton4.getText() == Joueurs.getJ2()
					&& bouton7.getText() == Joueurs.getJ2()) {
				bouton1.setBackground(Color.yellow);
				bouton4.setBackground(Color.yellow);
				bouton7.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");

			} else if (bouton2.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2()
					&& bouton8.getText() == Joueurs.getJ2()) {
				bouton2.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton8.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			} else if (bouton3.getText() == Joueurs.getJ2() && bouton6.getText() == Joueurs.getJ2()
					&& bouton9.getText() == Joueurs.getJ2()) {
				bouton3.setBackground(Color.yellow);
				bouton6.setBackground(Color.yellow);
				bouton9.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			} else if (bouton1.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2()
					&& bouton9.getText() == Joueurs.getJ2()) {
				bouton1.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton9.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");

			} else if (bouton3.getText() == Joueurs.getJ2() && bouton5.getText() == Joueurs.getJ2()
					&& bouton7.getText() == Joueurs.getJ2()) {
				bouton3.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton7.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJ2() + " gagne");
			}

			// fin fu neu si une des conditions est accomplie

			else if (bouton1.getText() != "" && bouton2.getText() != "" && bouton3.getText() != ""
					&& bouton4.getText() != "" && bouton5.getText() != "" && bouton6.getText() != ""
					&& bouton7.getText() != "" && bouton8.getText() != "" && bouton9.getText() != "") {
				label.setText("Match nul");
			}

			//
			Joueurs.setJc(Joueurs.getJ1());
		}

	
		
		

	}

	// while(!l[n].getText().equals("")){
	// n = r.nextInt(Max+1);
	// System.out.println(n);
	// }
	//
	// JeuIA(l[n],arg0);
	//
	// Joueurs.setJc(Joueurs.getJ1());

	// if(Joueurs.getJc() == Joueurs.getJ2()){
	// System.out.println("---- Nouveau tour ----");
	// System.out.println("n : " + n);
	// for(int i = 0; i<=8; i++){
	// System.out.print("bouton " + i + " :" + l[i].getText()+" ; ");
	// }
	// System.out.println();
	// while(!l[n].getText().equals("")){
	// System.out.println("On retire ...");
	// for(int i = 0; i<=8; i++){
	// System.out.print("bouton " + i + " :" + l[i].getText()+" ; ");
	// }
	// System.out.println();
	// n =r.nextInt(Max+1);
	//
	// System.out.println("n : " + n);
	// }
	// System.out.println("N final : " + n);
	// JeuIA(l[n],arg0);
	// for(int i = 0; i<=8; i++){
	// System.out.print("bouton " + i + " :" + l[i].getText()+" ; ");
	// }
	// System.out.println();
	// System.out.println("---- fin ----");

	// if(bouton.getText() != ""){
	// l[n].setText(Joueurs.getJc());
	//
	// }
	// Joueurs.setJc(Joueurs.getJ1());

	public void Reset(ActionEvent arg0) {

		// on vide les cases

		if (arg0.getSource() == bReset) {
			bouton1.setText("");
			bouton2.setText("");
			bouton3.setText("");
			bouton4.setText("");
			bouton5.setText("");
			bouton6.setText("");
			bouton7.setText("");
			bouton8.setText("");
			bouton9.setText("");

			bouton1.setBackground(Color.white);
			bouton2.setBackground(Color.white);
			bouton3.setBackground(Color.white);
			bouton4.setBackground(Color.white);
			bouton5.setBackground(Color.white);
			bouton6.setBackground(Color.white);
			bouton7.setBackground(Color.white);
			bouton8.setBackground(Color.white);
			bouton9.setBackground(Color.white);

			Joueurs.setJc(Joueurs.getJ1());
			label.setText("C'est le tour de " + Joueurs.getJc());
		}
	}

	public void Jeu(JButton bouton, ActionEvent arg0) {

		// debut du jeu

		if (arg0.getSource() == bouton && bouton.getText() == "") {
			bouton.setText(Joueurs.getJc());

			if (bouton1.getText() == Joueurs.getJc() // si 3 symboles sont
														// allignés
					&& bouton2.getText() == Joueurs.getJc() && bouton3.getText() == Joueurs.getJc()) {
				bouton1.setBackground(Color.yellow);
				bouton2.setBackground(Color.yellow);
				bouton3.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJc() + " gagne");

			} else if (bouton4.getText() == Joueurs.getJc() && bouton5.getText() == Joueurs.getJc()
					&& bouton6.getText() == Joueurs.getJc()) {
				bouton4.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton6.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJc() + " gagne");
			} else if (bouton7.getText() == Joueurs.getJc() && bouton8.getText() == Joueurs.getJc()
					&& bouton9.getText() == Joueurs.getJc()) {
				bouton7.setBackground(Color.yellow);
				bouton8.setBackground(Color.yellow);
				bouton9.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJc() + " gagne");
			} else if (bouton1.getText() == Joueurs.getJc() && bouton4.getText() == Joueurs.getJc()
					&& bouton7.getText() == Joueurs.getJc()) {
				bouton1.setBackground(Color.yellow);
				bouton4.setBackground(Color.yellow);
				bouton7.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJc() + " gagne");

			} else if (bouton2.getText() == Joueurs.getJc() && bouton5.getText() == Joueurs.getJc()
					&& bouton8.getText() == Joueurs.getJc()) {
				bouton2.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton8.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJc() + " gagne");
			} else if (bouton3.getText() == Joueurs.getJc() && bouton6.getText() == Joueurs.getJc()
					&& bouton9.getText() == Joueurs.getJc()) {
				bouton3.setBackground(Color.yellow);
				bouton6.setBackground(Color.yellow);
				bouton9.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJc() + " gagne");
			} else if (bouton1.getText() == Joueurs.getJc() && bouton5.getText() == Joueurs.getJc()
					&& bouton9.getText() == Joueurs.getJc()) {
				bouton1.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton9.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJc() + " gagne");

			} else if (bouton3.getText() == Joueurs.getJc() && bouton5.getText() == Joueurs.getJc()
					&& bouton7.getText() == Joueurs.getJc()) {
				bouton3.setBackground(Color.yellow);
				bouton5.setBackground(Color.yellow);
				bouton7.setBackground(Color.yellow);
				label.setText("Le joueur " + Joueurs.getJc() + " gagne");
			}

			// fin fu neu si une des conditions est accomplie

			else if (bouton1.getText() != "" && bouton2.getText() != "" && bouton3.getText() != ""
					&& bouton4.getText() != "" && bouton5.getText() != "" && bouton6.getText() != ""
					&& bouton7.getText() != "" && bouton8.getText() != "" && bouton9.getText() != "") {
				label.setText("Match nul");
			}

			else if (Joueurs.getJc() == Joueurs.getJ1()) { // passer au tour
															// suivant
				Joueurs.setJc(Joueurs.getJ2());
				label.setText("C'est le tour de " + Joueurs.getJc());
			}

			else if (Joueurs.getJc() == Joueurs.getJ2()) {
				Joueurs.setJc(Joueurs.getJ1());
				label.setText("C'est le tour de " + Joueurs.getJc());
			}
			// label.setText("C'est le tour de " + Joueurs.getJc());

		}

	}

	// public void victoire(JButton b1,JButton b2,JButton b3){ // vérification
	// de l'allignement des 3 symboles
	// if( b1.getText() == Joueurs.getJc() //si 3 symboles sont allignés
	// && b2.getText() == Joueurs.getJc()
	// && b3.getText() == Joueurs.getJc()){
	// b1.setBackground(Color.cyan);
	// b2.setBackground(Color.cyan);
	// b3.setBackground(Color.cyan);
	// label.setText("Le joueur " + Joueurs.getJc() + " gagne");
	// }
	// }

//	public void IANormal(JButton b1, JButton b2, JButton b3) {
//		if (b1.getText() == Joueurs.getJ1() // si 2 symboles sont allignés
//				&& b2.getText() == Joueurs.getJ1() && b3.getText() == "") {
//			b3.setText(Joueurs.getJ2());
//		} else if (b1.getText() == Joueurs.getJ1() && b3.getText() == Joueurs.getJ1() && b2.getText() == "") {
//			b2.setText(Joueurs.getJ2());
//		} else if (b3.getText() == Joueurs.getJ1() && b2.getText() == Joueurs.getJ1() && b1.getText() == "") {
//			b1.setText(Joueurs.getJ2());
//		}
//	}

	public void couleurCase(JButton b) {
		if (b.getText() == Joueurs.getJ1())
			b.setForeground(Color.blue);
		else if (b.getText() == Joueurs.getJ2())
			b.setForeground(Color.red);
	}

}
