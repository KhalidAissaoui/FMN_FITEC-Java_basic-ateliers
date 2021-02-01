package atelier_2;

public class Segment {
	private Point a;
	private Point b;
	public Segment() {
		a = new Point();
		b = new Point(2,2);
	}
	public Segment(double abs, double ord) {
		a = new Point();
		b = new Point(abs,ord);
	}
	public Segment(double x, double y, double z, double w) {
		a = new Point(x,y);
		b = new Point(z,w);			
	}
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public void position() {
		System.out.println("Extrémité a :");
		System.out.println(a);
		System.out.println("Extrémité b :");
		System.out.println(b);
	}
	public void tranlate(double x) {
		a.setX(a.getX()+x);
		b.setX(b.getX()+x);
		
		a.setY(a.getY()+x);
		b.setY(b.getY()+x);
	}
	public void tranlate(double x, double y) {
		a.setX(a.getX()+x);
		b.setX(b.getX()+x);
		
		a.setY(a.getY()+y);
		b.setY(b.getY()+y);
	}
	
	public double longueur() {
		double d;
		d = Math.sqrt(Math.pow(a.getX()
				-b.getX(), 2)+
				Math.pow(a.getY()-b.getY()
						, 2));
		return d;
	}

}
