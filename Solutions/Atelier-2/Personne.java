package atelier_2;

public class Personne {
	private String nom;
	private String adress;
	private int age;
	private int num;
	private static int c=0;
	public Personne(String nom, String adress, int num, int age) {
		c++;
		this.nom = nom;
		this.adress = adress;
		this.num = num;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void setC(int c) {
		Personne.c = c;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public static int getC() {
		return c;
	}
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString() {
		return nom+" habite à  l'adresse : "
	+adress+" porte le numéro "+num;
	}
	public void grandir() {age++;}
	public void grandir(int a) {age+=a;}

}
