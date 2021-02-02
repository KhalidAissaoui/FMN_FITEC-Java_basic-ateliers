package atelier_5;

public class Entier {
	private int val;

	public Entier(int val) throws ErrConst {
		if(val<0)
			throw new ErrConst();
		this.val = val;
	}
	public static Entier somme(Entier a, Entier b) throws ErrSom {
		if(a.val+b.val>Integer.MAX_VALUE)
			throw new ErrSom();
	
		try {
			return new Entier(a.val+b.val);
		} catch (ErrConst e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	public static Entier produit(Entier a, Entier b) throws ErrProd {
		if(a.val*b.val>Integer.MAX_VALUE)
			throw new ErrProd();
	
		try {
			return new Entier(a.val*b.val);
		} catch (ErrConst e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	public static Entier difference(Entier a, Entier b) throws ErrDiff {
		if(a.val*b.val<Integer.MIN_VALUE)
			throw new ErrDiff();
	
		try {
			return new Entier(a.val-b.val);
		} catch (ErrConst e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
