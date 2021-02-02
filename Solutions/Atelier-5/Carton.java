package atelier_5;

import java.util.ArrayList;

public abstract class Carton {
	protected int ref;
	protected ArrayList<Bouteille> cart;
	public Carton(int ref) {
		this.cart = new ArrayList<Bouteille>();
		this.ref = ref;
	}
	public abstract void ajouter(Bouteille b) throws OutOfCapException, wronChoiceException;
	

}
