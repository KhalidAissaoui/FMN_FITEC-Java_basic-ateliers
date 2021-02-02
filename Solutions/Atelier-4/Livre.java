package atelier_4;

public class Livre extends Document{
	private String nom;
	private int npages;
	public Livre(int num, String titre, String nom, int npages) {
		super(num, titre);
		this.nom = nom;
		this.npages = npages;
	}
	public void auteur() {
		super.auteur();
		System.out.println("Nom auteur : "+nom);
	}
	public String toString() {
		return num+"  "+titre+" "+nom+" "+npages;
	}
}
