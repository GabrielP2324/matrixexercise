package aula2102;

import java.util.Random;


public class ex4 {
	public static void main(String[] args) {
		int[][] stuff = new int[5][5];
		Random rng = new Random();
		// preencher e imprimir antes da troca
		for (int i = 0; i < stuff.length; i++) {
			for (int j = 0; j < stuff.length; j++) {
				stuff[i][j] = rng.nextInt(101);
				System.out.print(stuff[i][j] + "\t");
			}
			System.out.println();
		}

		// swap
		int swap;
		int i = 0;
		int j = stuff.length - 1;
		while (i < stuff.length) {
			swap = stuff[i][i];
			stuff[i][i] = stuff[i][j];
			stuff[i][j] = swap;
			i++;
			j--;
		}

	
		 // imprimir matriz
		System.out.println();
		for (i = 0; i < stuff.length; i++) {
			for (j = 0; j < stuff.length; j++) {
				System.out.print(stuff[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
