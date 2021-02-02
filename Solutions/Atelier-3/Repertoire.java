package atelier_3;

import java.util.Vector;

public class Repertoire {
	private Vector<Contact> rep;
	private int max;
	
	public Repertoire() {
		rep = new Vector<Contact>();
		max = 3;
	}
	public Repertoire(int max) {
		rep = new Vector<Contact>();
		this.max = max;
	}
	
	public boolean addContact(Contact a) {
		if(rep.size()<max) {
			rep.addElement(a);
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public String getNum(String nom) {
		for(int i=0;i<rep.size();i++) {
			if(rep.get(i).getNom().equalsIgnoreCase(nom))
				return rep.get(i).getNum();
		}
		return "";		
	}
	
	public int getNContacts() {
		return rep.size();
	}
	
	public Contact getContact(int i) {
		return rep.get(i);
	}

}
