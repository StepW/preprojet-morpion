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
	
	
	public FrameComp() {
//		JPanel P = new JPanel();
//		JButton bouton = new JButton("Mon bouton");
//		
	    setSize(600, 600);
	    
	    setTitle("Morpion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);

		
		JPanel panel = new JPanel();
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


		if(arg0.getSource() == bouton1)
			bouton1.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton2)
			bouton2.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton3)
		    bouton3.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton4)
		    bouton4.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton5)
		    bouton5.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton6)
		    bouton6.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton7)
		    bouton7.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton8)
		    bouton8.setText(Joueurs.getJc());
		if(arg0.getSource() == bouton9)
		    bouton9.setText(Joueurs.getJc());
		
		
		if(Joueurs.getJc() == Joueurs.getJ1()){
			Joueurs.setJc(Joueurs.getJ2());
		}else{
			Joueurs.setJc(Joueurs.getJ1());
		}

		
	}
	
	
}

