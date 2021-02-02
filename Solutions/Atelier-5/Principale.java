package atelier_5;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Entier a = new Entier(458_697);
			Entier b = new Entier(1_239_694);
			Entier c = Entier.somme(a, b);
			Entier d = Entier.produit(a, b);
			Entier e = Entier.difference(a, b);
		} catch (ErrNat e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
			Entier a;
			try {
				a = new Entier(458_697);
				Entier b = new Entier(1_239_694);
				Entier c = Entier.somme(a, b);
				Entier d = Entier.produit(a, b);
				Entier e = Entier.difference(a, b);
			} catch (ErrConst e1) {
				// TODO Auto-generated catch block
				System.out.println("Instanciation");
				e1.printStackTrace();
			}
			catch(ErrSom e) {
				System.out.println("Somme");
				e.printStackTrace();
			}
			catch(ErrDiff e) {
				System.out.println("Différence");
				e.printStackTrace();
			}
			catch(ErrProd e) {
				System.out.println("Produit");
				e.printStackTrace();
			}

	}

}
