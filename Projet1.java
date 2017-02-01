package Projet;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gui.HelloComponent;
import gui.SimpleJFrame;



public class Projet1 extends JFrame implements ActionListener{

	//JButton bouton = new JButton("Mon bouton");
	JPanel panel1 = new JPanel();
	
	
	private JButton bouton1 = new JButton("");
	private JButton bouton2 = new JButton("");
	private	JButton bouton3 = new JButton("");
	private JButton bouton4 = new JButton("");
	private JButton bouton5 = new JButton("");
	private JButton bouton6 = new JButton("");
	private JButton bouton7 = new JButton("");
	private JButton bouton8 = new JButton("");
	private JButton bouton9 = new JButton("");
	
	
	public Projet1() {
//		JPanel P = new JPanel();
//		P.setLayout(new GridLayout(1,1));
//		JButton bouton = new JButton("Mon bouton");

	    setSize(600, 600);
	    
	    setTitle("Morpion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);

		
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		panel.setLayout(new GridLayout(3, 3)) ;
		
//		JButton bouton1 = new JButton("");


		
		
		JComboBox<String> choixDiff = new JComboBox<>();

		choixDiff.addItem("Facile");
		choixDiff.addItem("Normal");
		choixDiff.addItem("Difficile");
		choixDiff.addItem("JCJ");
		
		panel.add(bouton1);
		panel.add(bouton2);
		panel.add(bouton3);
		panel.add(bouton4);
		panel.add(bouton5);
		panel.add(bouton6);
		panel.add(bouton7);
		panel.add(bouton8);
		panel.add(bouton9);
		panel1.setToolTipText("jjj");
		
		bouton1.addActionListener(this);
		bouton2.addActionListener(this);
		bouton3.addActionListener(this);
		bouton4.addActionListener(this);
		bouton5.addActionListener(this);
		bouton6.addActionListener(this);
		bouton7.addActionListener(this);
		bouton8.addActionListener(this);
		bouton9.addActionListener(this);
		

		this.add(choixDiff,BorderLayout.NORTH);
		this.add(panel);
		

	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {


		if(arg0.getSource() == bouton1 && bouton1.getText() == "")
			bouton1.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton2 && bouton2.getText() == "")
			bouton2.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton3 && bouton3.getText() == "")
		    bouton3.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton4 && bouton4.getText() == "")
			bouton4.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton5 && bouton5.getText() == "")
		    bouton5.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton6 && bouton6.getText() == "")
		    bouton6.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton7 && bouton7.getText() == "")
		    bouton7.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton8 && bouton8.getText() == "")
		    bouton8.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton9 && bouton9.getText() == "")
		    bouton9.setText(Joueurs.getJc());
		
		
		if(Joueurs.getJc() == Joueurs.getJ1()){
			Joueurs.setJc(Joueurs.getJ2());
		}else{
			Joueurs.setJc(Joueurs.getJ1());
		}
	
		if( bouton1.getText() == "X" && bouton2.getText() == "X" && bouton3.getText() == "X"   ) {
			JTextField text = new JTextField("gagné x");
			this.add(text, BorderLayout.SOUTH) ;		
	}
		else if(bouton4.getText() == "X" && bouton5.getText() == "X" && bouton6.getText() == "X" ) {
			JTextField text = new JTextField("gagné x");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton7.getText() == "X" && bouton8.getText() == "X" && bouton9.getText() == "X" ) {
			JTextField text = new JTextField("gagné x");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton4.getText() == "X" && bouton5.getText() == "X" && bouton6.getText() == "X" ) {
			JTextField text = new JTextField("gagné x");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton3.getText() == "X" && bouton5.getText() == "X" && bouton7.getText() == "X" ) {
			JTextField text = new JTextField("gagné x");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton9.getText() == "X" && bouton5.getText() == "X" && bouton1.getText() == "X" ) {
			JTextField text = new JTextField("gagné x");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton1.getText() == "X" && bouton4.getText() == "X" && bouton7.getText() == "X" ) {
			JTextField text = new JTextField("gagné x");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton2.getText() == "X" && bouton5.getText() == "X" && bouton8.getText() == "X" ) {
			JTextField text = new JTextField("gagné x");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton3.getText() == "X" && bouton6.getText() == "X" && bouton9.getText() == "X" ) {
			JTextField text = new JTextField("gagné x");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		

		




		

		
		
		if( bouton1.getText() == "0" && bouton2.getText() == "0" && bouton3.getText() == "0"   ) {
			JTextField text = new JTextField("gagné 0");
			this.add(text, BorderLayout.SOUTH) ;
			
	}
		else if(bouton4.getText() == "0" && bouton5.getText() == "0" && bouton6.getText() == "0" ) {
			JTextField text = new JTextField("gagné 0");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton7.getText() == "0" && bouton8.getText() == "0" && bouton9.getText() == "0" ) {
			JTextField text = new JTextField("gagné 0");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton4.getText() == "0" && bouton5.getText() == "0" && bouton6.getText() == "0" ) {
			JTextField text = new JTextField("gagné 0");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton3.getText() == "0" && bouton5.getText() == "0" && bouton7.getText() == "0" ) {
			JTextField text = new JTextField("gagné 0");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton9.getText() == "0" && bouton5.getText() == "0" && bouton1.getText() == "0" ) {
			JTextField text = new JTextField("gagné 0");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton1.getText() == "0" && bouton4.getText() == "0" && bouton7.getText() == "0" ) {
			JTextField text = new JTextField("gagné 0");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton2.getText() == "0" && bouton5.getText() == "0" && bouton8.getText() == "0" ) {
			JTextField text = new JTextField("gagné 0");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		else if(bouton3.getText() == "0" && bouton6.getText() == "0" && bouton9.getText() == "0" ) {
			JTextField text = new JTextField("gagné 0");
			this.add(text, BorderLayout.SOUTH) ;	
		}
		

		


	
	}
	
	
		
}