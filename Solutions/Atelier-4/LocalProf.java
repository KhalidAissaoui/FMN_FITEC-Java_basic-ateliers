package atelier_4;

public class LocalProf extends Local {
	private int nbrEmployees;

	public LocalProf(String proprio, String adresse, double surface, int nbrEmployees) {
		super(proprio, adresse, surface);
		this.nbrEmployees = nbrEmployees;
	}
	
	public double impot() {
		return super.impot()+(this.nbrEmployees/10)*2000;
	}

	public int getNbrEmployees() {
		return nbrEmployees;
	}

	public void setNbrEmployees(int nbrEmployees) {
		this.nbrEmployees = nbrEmployees;
	}
}
