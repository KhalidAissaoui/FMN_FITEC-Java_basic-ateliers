package atelier_4;

import java.util.Vector;

public class ListeDeDocuments {
	private Vector<Document> liste;

	public ListeDeDocuments() {
		liste = new Vector<Document>();
	}
	
	public void ajout(Document d) {
		liste.addElement(d);
	}
	
	public void tousLesAuteurs() {
		for(int i=0;i<liste.size();i++) {
			
			liste.get(i).auteur();
		}
		
	}
	public void tousLesDocuments() {
		for(Document d : liste) {
			
			System.out.println(d);
		}
		
	}
}
