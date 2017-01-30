package Projet;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Projet1 extends JFrame{
	JPanel P = new JPanel();
	//JButton bouton = new JButton("Mon bouton");
	
	public Projet1() {
//		JPanel P = new JPanel();
//		JButton bouton = new JButton("Mon bouton");
//		
	    this.setSize(600, 600);
	    
	    this.setTitle("Projet");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(3, 3));
		//this.getContentPane().add(bouton);
		this.getContentPane().add(new JButton(" "));
		this.getContentPane().add(new JButton(" "));
		this.getContentPane().add(new JButton(" "));
	    this.getContentPane().add(new JButton(" "));
		this.getContentPane().add(new JButton(" "));
		this.getContentPane().add(new JButton(" "));
		this.getContentPane().add(new JButton(" "));
		this.getContentPane().add(new JButton(" "));
		this.getContentPane().add(new JButton(" "));
	}
	

}
