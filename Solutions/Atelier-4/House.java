package atelier_4;

public class House {
	private double surface;
	private Door porte;

	public House(double surface, Door porte) {
		super();
		this.surface = surface;
		this.porte = porte;
	}

	public House(double surface) {
		super();
		this.surface = surface;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}
	public void display() {
		System.out.println("Je suis une maison, "
				+ "ma surface est de "+this.surface+" m2");
	}

	public Door getPorte() {
		return porte;
	}
	
}
