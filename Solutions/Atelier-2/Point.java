package atelier_2;

public class Point {
	private double x;
	private double y;
	
	public Point() {
		x = 1;
		y = 1;
	}
	public Point(double x, double y) {		
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	//coordonnées polaires
	public double rho() {
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	public double theta() {
		return Math.atan(y/x);
	}
	
	public String toString() { return "("+x+", "+y+")"; }
	 
	
		
	public void rotation(double theta) {
		double xn = this.rho()*Math.cos(this.theta()+Math.toRadians(theta));
		double yn = this.rho()*Math.sin(this.theta()+Math.toRadians(theta));
		x = xn;
		y = yn;
	}

}
