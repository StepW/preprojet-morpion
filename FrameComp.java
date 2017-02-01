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
	
	private String j1 = "0";
	private String j2 = "X";
	
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
		JButton bouton2 = new JButton("");

		
		JLabel label = new JLabel("Test");
		
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
		

		this.add(choixDiff,BorderLayout.NORTH);
		this.add(panel);
		
		


	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		bouton1.setText(j1);
		
	}
	
	
}

