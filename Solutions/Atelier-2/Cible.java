package atelier_2;

public class Cible {
	private Cercle corps;
	private double seuil;
	
	public Cible(double x, double y) {
		corps = new Cercle(x,y);
		seuil = 0.5;
	}
	
	public void touche() {
		if(!corps.getCouleur().equalsIgnoreCase("red")) {
			corps.setRayon(corps.getRayon()-1);
			if(corps.getRayon()<=seuil)
				corps.setCouleur("red");
		}
	}
	
	public void grossir() {
		if(!corps.getCouleur().equalsIgnoreCase("red"))
			corps.setRayon(corps.getRayon()+1);
	}
	public void deplace(double dx, double dy) {
		if(!corps.getCouleur().equalsIgnoreCase("red")) {
			corps.getCentre().setX(dx);
			corps.getCentre().setY(dy);
		}
	}

	public Cercle getCorps() {
		return corps;
	}

	public void setCorps(Cercle corps) {
		this.corps = corps;
	}

	public double getSeuil() {
		return seuil;
	}

	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}
}
