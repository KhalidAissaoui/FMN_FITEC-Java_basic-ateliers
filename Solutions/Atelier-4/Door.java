package atelier_4;

public class Door {
	protected String color;

	public Door(String color) {
		super();
		this.color = color;
	}
	
	public void display() {
		System.out.println("Je suis une porte, "
				+ "ma couleur est "+color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
