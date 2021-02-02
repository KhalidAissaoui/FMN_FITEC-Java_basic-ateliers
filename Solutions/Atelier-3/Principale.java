package atelier_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Remplir la liste");
		for(int i = 0; i< 10;i++) {			
			list.add(e.nextInt());
		}
		for(int v : list){
			System.out.print("\t"+v);
		}
		System.out.println("");
		System.out.println("indice debut");
		int i = e.nextInt();
		System.out.println("indice fin");
		int k = e.nextInt();
		List<Integer> output = list.subList(i, k);
		for(int v : output){
			System.out.print("\t"+v);
		}
		
		

	}

}
