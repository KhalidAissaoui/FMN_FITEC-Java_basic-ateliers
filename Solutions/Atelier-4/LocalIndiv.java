package atelier_4;

public class LocalIndiv extends Local{
	private int nbrPieces;
	private int piscine; //1 oui 0 non
	
	public LocalIndiv(String proprio, String adresse, double surface, int nbrPieces, int piscine) {
		super(proprio, adresse, surface);
		this.nbrPieces = nbrPieces;
		this.piscine = piscine;
	}
	
	public int getNbrPieces() {
		return nbrPieces;
	}

	public void setNbrPieces(int nbrPieces) {
		this.nbrPieces = nbrPieces;
	}

	public int getPiscine() {
		return piscine;
	}

	public void setPiscine(int piscine) {
		this.piscine = piscine;
	}

	public double impot() {
		return super.impot()+200*this.nbrPieces+this.piscine*1000;
		
	}
	
	

}
