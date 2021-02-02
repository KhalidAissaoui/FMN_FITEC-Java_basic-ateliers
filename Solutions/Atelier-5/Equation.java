package atelier_5;

public class Equation {
	private int a;
	private int b;
	private int c;
	
	public Equation(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void solution() throws noSolutionException, CSolutionException {
		if(a==0)
			if(b==0)
				if(c==0)
					System.out.println("Solution ensemble R");
				else
					throw new noSolutionException();
			else
				System.out.println("Solution : "+(-c/b));
		else {
			int disc = b*b-4*a*c;
			if(disc<0)
				throw new CSolutionException();
			else if(disc==0)
				System.out.println("Solution : "+(-b/2*a));
			else {
				System.out.println("Solution 1 : "+(-b-Math.sqrt(disc))/2*a);
				System.out.println("Solution 2 : "+(-b+Math.sqrt(disc))/2*a);
			}
				
		}
			
		
	}
	
	
	
	

}