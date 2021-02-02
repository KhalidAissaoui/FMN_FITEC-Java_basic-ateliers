package atelier_5;

public class CartonT1 extends Carton{
	private int capacite;

	public CartonT1(int ref) {
		super(ref);
		this.capacite = 12;
	}
	
	public  void ajouter(Bouteille b) throws OutOfCapException, wronChoiceException{
		if(this.cart.size()==this.capacite)
			throw new OutOfCapException();
		else {
			if(b.getTaille()!=50)
				throw new wronChoiceException();
			this.cart.add(b);
		}
		
	}
	
	

}
