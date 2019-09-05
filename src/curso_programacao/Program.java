package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m= sc.nextInt();
		int n= sc.nextInt();
		
		int[][] mat= new int[m][n];
		
		for (int i= 0; i<mat.length; i++) {
			for (int j= 0; j<mat[i].length; j++) {
				int x= sc.nextInt();
			}	
		}
		
		int y= sc.nextInt();
		
		for (int i= 0; i<mat.length; i++) {
			for (int j= 0; j<mat[i].length; j++) {
				
				if (mat[m][n]== y) {
					System.out.println("Position " + m + "," + n + ":");
				}
				
			}	
		}
		

		sc.close();
	}
}
