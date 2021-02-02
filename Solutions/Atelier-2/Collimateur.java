package atelier_2;

public class Collimateur {
	private Point position;
	
	
	public Collimateur() {
		position = new Point(0,0);
		
	}
	public Collimateur(double x, double y) {
		position = new Point(x,y);
		
	}
	public void bouger() {
		position.setX(2);
		position.setY(2);
	}
	public void bouger(double x, double y) {
		position.setX(position.getX()+x);
		position.setY(position.getY()+y);
	}
	
	public void tirer(Cible c) {
		if(this.inCible(c))
			c.touche();		
	}
	private boolean inCible(Cible c) {
		double dist =Math.sqrt(Math.pow(position.getX()-c.getCorps().getCentre().getX(), 2)+
				Math.pow(position.getY()-c.getCorps().getCentre().getY(), 2)); 
		if(dist<=c.getCorps().getRayon())
			return true;
		else 
			return false;
	}

}
