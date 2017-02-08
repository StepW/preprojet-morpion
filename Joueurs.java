package morpion;



public class Joueurs{
	

	
	public static final String j1 = "O";
	public static final String j2 = "X";
	public static String jc = j1;

	
	
	public Joueurs(){
		
	}
	
	public static String getJ1() {
		return j1;
	}

	public static String getJ2() {
		return j2;
	}

	public static String getJc() {
		return jc;
	}
	
	public static void setJc(String j) {
		jc=j;
	}
	
	
}
