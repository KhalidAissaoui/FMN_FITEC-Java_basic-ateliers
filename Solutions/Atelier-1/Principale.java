package atelier_1;

import java.util.Scanner;

public class Principale {
	public static void main (String[] args) {
		Scanner e = new Scanner(System.in);
		//Exercice 1	
		  System.out.println("\t*** Exercice 1 *** "); 
		  int A, B;
		  System.out.println("Le nombre A : "); A = e.nextInt(); 
		  do {
		  System.out.println("Le nombre B : "); B = e.nextInt(); 
		  }while(B>A); 
		  int quot=0; 
		  while(A>=B) { 
			  A-=B; quot++; 
		  }
		  System.out.println("Le quotient = "+quot);
		  System.out.println("Le reste = "+A);
		  
		  //Exercice 2 
		  System.out.println("\t*** Exercice 2 *** ");
		  System.out.println("Le nombre N : "); 
		  int N = e.nextInt();
		  System.out.println("Le nombre traité : "+N); 
		  int ch,c=0; 
		  for(int i=1;i<=nbrChiffre(N);i++) { 
			  ch = iChiffre(N,i); 
			  if(estPair(ch)==true) 
				  c++; 
			 }
		  System.out.println("Le nombre de chiffres pairs : "+c);
		  
		  //Exercice 3 
		  System.out.println("\t*** Exercice 3 *** ");
		  System.out.println("Le nombre N à calculer : "); 
		  int n = e.nextInt();
		  
		  System.out.println("Méthode 1 => Fibonacci à  l'ordre "+n+" est : "+fibonacci(n)); 
		  System.out.println("Méthode 2 => Fibonacci à  l'ordre "+n+" est : "+fibonacci2(n));
		  System.out.println("Méthode 3 => Fibonacci à  l'ordre "+n+" est : "+fibonacci3(n));
		  
		  //Exercice 4 
		  System.out.println("\t*** Exercice 4 *** "); 
		  int T[]= {3,6,9,10}; 
		  int R[] = {2,5,7,11,20,21}; 
		  int C[] = new int[10]; 
		  int i = 0, j = 0, k = 0; 
		  while(i<T.length && j<R.length) { 
			  if(T[i]<R[j]) 
				  C[k++]=T[i++]; 
			  else
				  C[k++]=R[j++]; 
			  } 
		  while(i<T.length) { 
			  C[k++]=T[i++];
		  
		  } 
		  while(j<R.length) { 
			  C[k++]=R[j++];
		  
		  } 
		  for(int val : C) { 
			  System.out.println(val); 
			 }
		  
		  
		  //Exercice 5 
		  System.out.println("\t*** Exercice 5 *** "); 
		  int X[] = new  int[20]; 
		  int t; 
		  do {
		  System.out.println("Nombre d'éléments dans le tableau X : "); 
		  t = e.nextInt(); 
		  }while(t>20); 
		  System.out.println("Remplissage du tableau X : ");
		  for(int ix=0;ix<t;ix++) 
			  X[ix] = e.nextInt(); 
		  System.out.println("Tableau X : ");
		  for(int v : X) { 
			  System.out.print("\t"+v); 
		  } 
		  System.out.println(""); 
		  int Y[]= {2,7,4}; 
		  System.arraycopy(Y, 0, X, t, Y.length);
		  System.out.println("Tableau X après ajout: "); 
		  for(int v : X) {
		  System.out.print("\t"+v); 
		  }
		 
		//Exercice 6
		System.out.println("\t*** Exercice 6 *** ");
		int M[] = {7,3,2};
		int L[] = {1,8,7,3,2,11,5};
		int im = 0, il =0; int idx = 0;
		boolean inclus = false;
		while(!inclus && (M.length-im < L.length-il)) {
			if(M[im]!=L[il]) {
				if(im == 0)
					il++;
				else {
					im=0;
					il = idx+1;
				}				
			}
			else {
				if(im == M.length-1)
					inclus = true;
				else {
					if(im==0)
						idx = il;
					im++;
					il++;
				}				
			}
		}
		if(inclus)
			System.out.println("Tableau M inclus dans L");
		else
			System.out.println("Tableau M non inclus dans L");
		
	}
	public static int nbrChiffre(int N) {		
		int c = 1;		
		while(N>9) {
			c++;
			N = N/10;
		}
		return c;		
	}
	
	public static int iChiffre(int N, int i) {
		
		return (N/(int)Math.pow(10, i-1))%10;
	}
	
	public static boolean estPair(int c) {
		
		return c%2==0?true:false;
	}
	
	public static int fibonacci(int N) {
		
		int T[] = new int[N];
		T[0]=1;
		T[1]=1;
		for(int i=2;i<N;i++)
			T[i]=T[i-1]+T[i-2];
		
		return T[N-1];
	}
	public static int fibonacci2(int N) {
		int a=1,b=1;
		int f=1;
		if(N==1||N==2)
			return f;
		for(int i =2;i<N;i++) {
			f=a+b;
			a=b;
			b=f;
			
		}
		return f;	
	}	
	public static int fibonacci3(int N) {
		if(N==1||N==2)
			return 1;
		else
			return fibonacci3(N-1)+fibonacci3(N-2);
	}
}
