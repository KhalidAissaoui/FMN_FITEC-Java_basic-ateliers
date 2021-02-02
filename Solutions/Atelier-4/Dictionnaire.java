package atelier_4;

public class Dictionnaire extends Document{
	private String langue;
	private int nbTomes;
	
	public Dictionnaire(int num, String titre,String langue, int nbTomes) {
		super(num, titre);
		this.langue = langue;
		this.nbTomes = nbTomes;
	}
	
	public String toString() {
		return num+"  "+titre+"  "+langue+"  "+nbTomes;
	}
}
