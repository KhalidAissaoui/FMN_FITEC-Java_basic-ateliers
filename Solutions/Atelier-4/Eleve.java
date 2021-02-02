package atelier_4;

import java.util.ArrayList;

public class Eleve implements Comparable<Eleve> {
	private String nom;
	private ArrayList<Integer> listeNotes; 
	private double moyenne;
	
	public Eleve( String nom) {
		this.nom = nom;
		listeNotes = new ArrayList<Integer>();
		this.moyenne = 0;
	}
	
	public void ajouter(int note) {
		note = (note>20? 20 : (note<0? 0: note));
		listeNotes.add(note);
		int sum = 0;
		for(Integer val : listeNotes) {
			sum+=val;
		}
		this.moyenne = sum/listeNotes.size();
	}
	
	public int compareTo(Eleve e) {
		if(this.moyenne<e.moyenne)
			return -1;
		else if(this.moyenne == e.moyenne)
			return 0;
		else
			return 1;
	}

	public String getNom() {
		return nom;
	}

	public ArrayList<Integer> getListeNotes() {
		return listeNotes;
	}

	public double getMoyenne() {
		return moyenne;
	}
	public String toString() {
		return nom+"("+this.moyenne+")";
	}
	
}
