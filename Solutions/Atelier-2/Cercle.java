package atelier_2;

public class Cercle {
	private Point centre;
	private String couleur;
	//attribut rayon
	private double rayon;
	
	public Cercle (double x, double y) {
		centre = new Point(x,y);
		rayon = 1;
		couleur="gris";
	}
	public Cercle (double x, double y, String c) {
		centre = new Point(x,y);
		rayon = 1;
		couleur=c;
	}
	public Cercle (double x, double y, String c, double r) {
		centre = new Point(x,y);
		rayon = r;
		couleur=c;
	}
	
	//getter rayon
	public double getRayon() {
		return rayon;
	}
	//setter du rayon
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	public Point getCentre() {
		return centre;
	}
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	//changer la surface
	public void changerSurface(double r) {
		rayon += r; //rayon = rayon +r;
		rayon = Math.abs(rayon);
	}
	public void deplacer(double dx, double dy) {
		centre.setX(centre.getX()+dx); // centre.x = centre.x +dx
		centre.setY(centre.getY()+dy); // centre.y = centre.y +dy
		
	}
	public void afficher() {
		System.out.println("Le centre du cercle :"+centre);
		System.out.println("Le rayon du cercle :"+rayon);
		System.out.println("La couleur du cercle :"+couleur);
	}
}
