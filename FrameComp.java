package morpion;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class FrameComp extends JFrame implements ActionListener{

	//JButton bouton = new JButton("Mon bouton");
	

	
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
	
	
	public FrameComp() {
//		JPanel P = new JPanel();
//		JButton bouton = new JButton("Mon bouton");
//		
	    setSize(600, 600);
	    
	    setTitle("Morpion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);

		
		JPanel panelg = new JPanel();
		JPanel interf = new JPanel();

		
		panelg.setLayout(new GridLayout(3, 3)) ;


	
		JComboBox<String> choixDiff = new JComboBox<>();

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
		

		
		interf.add(choixDiff);
		interf.add(bReset);
		
		this.add(interf,BorderLayout.NORTH);
		this.add(label,BorderLayout.SOUTH);
		this.add(panelg);

	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		

		Tour(bouton1,arg0);
		Tour(bouton2,arg0);
		Tour(bouton3,arg0);
		Tour(bouton4,arg0);
		Tour(bouton5,arg0);
		Tour(bouton6,arg0);
		Tour(bouton7,arg0);
		Tour(bouton8,arg0);
		Tour(bouton9,arg0);
		
		Reset(arg0);

	}

		
	
	public void Tour(JButton bouton, ActionEvent arg0){  //appuyer sur le bouton pour placer la valeur dans la case
		if(arg0.getSource() == bouton && bouton.getText() == "") {
			bouton.setText(Joueurs.getJc());

			if(		bouton1.getText() == Joueurs.getJc()  //si 3 symboles sont allignés
					&& bouton2.getText() == Joueurs.getJc()
					&& bouton3.getText() == Joueurs.getJc()
						|| bouton4.getText() == Joueurs.getJc()
					&& bouton5.getText() == Joueurs.getJc()
					&& bouton6.getText() == Joueurs.getJc()
						|| bouton7.getText() == Joueurs.getJc()
					&& bouton8.getText() == Joueurs.getJc()
					&& bouton9.getText() == Joueurs.getJc()
						|| bouton1.getText() == Joueurs.getJc()
					&& bouton4.getText() == Joueurs.getJc()
					&& bouton7.getText() == Joueurs.getJc()
						|| bouton2.getText() == Joueurs.getJc()
					&& bouton5.getText() == Joueurs.getJc()
					&& bouton8.getText() == Joueurs.getJc()
						|| bouton3.getText() == Joueurs.getJc()
					&& bouton6.getText() == Joueurs.getJc()
					&& bouton9.getText() == Joueurs.getJc()
						|| bouton1.getText() == Joueurs.getJc()
					&& bouton5.getText() == Joueurs.getJc()
					&& bouton9.getText() == Joueurs.getJc()
						|| bouton3.getText() == Joueurs.getJc()
					&& bouton5.getText() == Joueurs.getJc()
					&& bouton7.getText() == Joueurs.getJc()){
				
				label.setText("Le joueur " + Joueurs.getJc() + " gagne");
				
			}
			
			else if(bouton1.getText() != ""
					&& bouton2.getText() != ""
					&& bouton3.getText() != ""
					&& bouton4.getText() != ""
					&& bouton5.getText() != ""
					&& bouton6.getText() != ""
					&& bouton7.getText() != ""
					&& bouton8.getText() != ""
					&& bouton9.getText() != ""){
				label.setText("Match nul");
			}
			
			else if(Joueurs.getJc() == Joueurs.getJ1()){  //passer au tour suivant
				Joueurs.setJc(Joueurs.getJ2());
				label.setText("C'est le tour de " + Joueurs.getJc());
			}else if (Joueurs.getJc() == Joueurs.getJ2()){
				Joueurs.setJc(Joueurs.getJ1());
				label.setText("C'est le tour de " + Joueurs.getJc());
			}
//			label.setText("C'est le tour de " + Joueurs.getJc());
			

		}
		
	}
	
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
		}
	}
	
}

