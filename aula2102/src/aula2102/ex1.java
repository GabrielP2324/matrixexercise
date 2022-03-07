package aula2102;

import java.util.Random;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x=in.nextInt();
		int y = in.nextInt();
		
		int[][] stuff = new int[4][4];
		Random rng = new Random();
		for (int i = 0; i < stuff.length; i++) {
			for (int j = 0;j<stuff.length;j++) {
				stuff[i][j]= rng.nextInt(101);
			}
		}
		
		for (int i = 0; i < stuff.length; i++) {
			for (int j = 0;j<stuff.length;j++) {
				System.out.print(stuff[i][j]+"\t");
			}
			System.out.print("\n");
		}
		int sum = 0;
		for (int i = 0; i < stuff.length; i++) {
			for (int j = 0;j<stuff.length;j++) {
				if(i == j) {
					sum+=stuff[i][j];	
				}	
			}
		}
		System.out.println("Soma =" + sum);
		sum =0;
		for (int i = 0; i < stuff.length; i++) {
			for (int j = 0;j<stuff.length;j++) {
				if(i +j == 3) {
					sum+=stuff[i][j];	
				}	
			}
		}
		System.out.println("Soma =" + sum);
		
	
	}
}
