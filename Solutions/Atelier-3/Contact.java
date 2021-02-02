package atelier_3;

public class Contact {
	private String nom;
	private String num;
	
	public Contact(String nom, String num) {		
		this.nom = nom;
		this.num = num;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getNom() {
		return nom;
	}
	
	
	public String toString() { return "Contact : "+nom+"\n"
	+"Numéro : "+num; }
	
}
