package atelier_5;

public class CartonT2 extends Carton{
	private int capacite;

	public CartonT2(int ref) {
		super(ref);
		this.capacite = 8;
	}
	
	public  void ajouter(Bouteille b) throws OutOfCapException, wronChoiceException{
		if(this.cart.size()==this.capacite)
			throw new OutOfCapException();
		else {
			if(b.getTaille()!=75)
				throw new wronChoiceException();
			this.cart.add(b);
		}
		
	}
}
