package atelier_4;

public class Local {
	protected String proprio;
	protected String adresse;
	protected double surface;
	public Local(String proprio, String adresse, double surface) {
		this.proprio = proprio;
		this.adresse = adresse;
		this.surface = surface;
	}
	public String getProprio() {
		return proprio;
	}
	public void setProprio(String proprio) {
		this.proprio = proprio;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getSurface() {
		return surface;
	}
	public void setSurface(double surface) {
		this.surface = surface;
	}
	
	public double impot() {
		return 5*surface;
	}
	
	public void affiche() {
		System.out.println("Propriétaire : "+proprio);
		System.out.println("Adresse : "+adresse);
		System.out.println("Surface : "+surface);
		
	}

}
