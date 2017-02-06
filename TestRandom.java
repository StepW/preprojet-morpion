package morpion;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestRandom {
	public static void main(String[] args){

		

		
		String[] l = new String[9];
		
		l[0]="bouton1";
		l[1]="bouton2";
		l[2]="bouton3";
		l[3]="bouton4";
		l[4]="bouton5";
		l[5]="bouton6";
		l[6]="bouton7";
		l[7]="bouton8";
		l[8]="bouton9";
		
		int Min = 1;
		int Max = 9;
		
		int nombreAleatoire = Min + (int)(Math.random() * ((Max - Min) + 1));
		System.out.println(l[nombreAleatoire]);
		int nombreAleatoire1 = Min + (int)(Math.random() * ((Max - Min) + 1));
		System.out.println(l[nombreAleatoire1]);

	}

}
