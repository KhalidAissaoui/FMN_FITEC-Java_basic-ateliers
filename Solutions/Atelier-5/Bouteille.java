package atelier_5;

public class Bouteille {
	private int taille;

	public Bouteille(int taille) throws wrongSizeException{
		if(taille!=50 && taille!=75)
			throw new wrongSizeException();
		this.taille = taille;
	}

	public int getTaille() {
		return taille;
	}
	

}
