package aula2102;

import java.util.Random;

public class ex2 {
	public static void main(String[] args) {
		Random rng = new Random();
		int[][] stuff = new int[10][10];
		
		for(int i = 0;i<stuff.length;i++) {
			for(int j=0;j<stuff.length;j++) {
				stuff[i][j]= rng.nextInt(1001);
			}
		}
		for(int i = 0;i<stuff.length;i++) {
			for(int j=0;j<stuff.length;j++) {
				System.out.print(stuff[i][j]+"\t");
			}
			System.out.println();
		}
		int max = 0;
		for(int i = 0;i<stuff.length;i++) {
			for(int j=0;j<stuff.length;j++) {
				if(stuff[i][j]>max) {
					max = stuff[i][j];
				}
			}
		}
		System.out.println("Max = " + max);
		System.out.println("Occurences:");
		for(int i = 0;i<stuff.length;i++) {
			for(int j=0;j<stuff.length;j++) {
				if(max == stuff[i][j]) {
					System.out.println("["+i+"] ["+j+"]");
				}
			}
		}
	}
}
