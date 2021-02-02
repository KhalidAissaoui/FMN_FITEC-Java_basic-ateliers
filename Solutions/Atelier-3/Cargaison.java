package atelier_3;

import java.util.Vector;

public class Cargaison {
	private Vector<Marchandise> car;
	private double dist;
	private int type; //0 à 3
	private double pc;
	private double vc;
	public Cargaison(double dist, int type) {
		car = new Vector<Marchandise>();
		this.dist = dist;
		this.type = type;
		pc = 0;
		vc = 0;
	}
	
	public Vector<Marchandise> getCar() {
		return car;
	}

	public void ajout(Marchandise m) {
		switch(type) {
		case 0 : if(pc+m.poids()<300000) {
			car.addElement(m);
			pc += m.poids();
			vc += m.volume();
		}break;
		case 1 : if(pc+m.poids()<38000) {
			car.addElement(m);
			pc += m.poids();
			vc += m.volume();
		}break;
		default : if(vc+m.volume()<80000) {
				car.addElement(m);
				pc += m.poids();
				vc += m.volume();
			}
		}
	}
	
	public double cout() {
		switch(type) {
		case 0 : return dist*pc;
		case 1 : return 4*dist*pc;
		case 2 : return 10*dist*vc;
		default : return 20*dist*vc;
		}
	}
}
