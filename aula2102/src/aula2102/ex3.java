package aula2102;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Quantos alunos na sala? ");
		int studentsnum = in.nextInt();
		String[] students = new String[studentsnum];
		double[][] grades = new double[studentsnum][3];
		double[] avg = new double[studentsnum];
		boolean[] pass = new boolean[studentsnum];
		
		for (int i = 0; i < students.length; i++) {
			in.nextLine();
			System.out.print("Nome aluno " + (i + 1) + "-> ");
			students[i] = in.nextLine();

			for (int j = 0; j < 3; j++) {
				System.out.print("Nota " + (j + 1) + " Aluno " + (i + 1) + "-> ");
				grades[i][j] = in.nextDouble();
			}
			System.out.println();
		}

		double avgc = 0;
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					avgc += 0.3 * grades[i][j];
				} else if (j == 1) {
					avgc += 0.5 * grades[i][j];
				} else {
					avgc += 0.2 * grades[i][j];
				}
			}
			avg[i] = avgc;
			if (avgc >= 7) {
				pass[i] = true;
			} else {
				pass[i] = false;
			}
			avgc = 0;
		}
		
		System.out.println("Nome \tProva 1 \tProva 2 \tTrabalho \tMédia \tPassou?");
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i] + "\t");
			for (int j = 0; j < 3; j++) {
				System.out.print(grades[i][j] + "\t\t");
			}
			System.out.print(String.format("%.2f", avg[i]) + "\t");
			System.out.println(pass[i] ? "Passou" : "Não Passou");
		}

	}
}
