package atelier_4;

public class Person {
	private String nom;
	private House maison;
	public Person(String nom, House maison) {
		super();
		this.nom = nom;
		this.maison = maison;
	}
	public void display() {
		System.out.println("nom : "+this.nom);
		maison.display();
		maison.getPorte().display();
	}
	
	

}
