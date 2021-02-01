package atelier_2;

public class Entier {
	private int v;
	public Entier(int v) {		
		this.v = v;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	
	public static Entier addition(Entier e, Entier f) {
		return new Entier(e.v+f.v);
	}
	
	public static Entier mult(Entier e, Entier f) {
		return new Entier(e.v*f.v);
	}

}
