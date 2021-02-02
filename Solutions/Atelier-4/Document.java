package atelier_4;

public class Document {
	protected int num;
	protected String titre;
	
	public Document(int num, String titre) {
		
		this.num = num;
		this.titre = titre;
	}
	public void auteur() {
		System.out.println("Numéro du document : "+num);
	}
	
	public String toString() {
		return num+"  "+titre;
	}	
}
