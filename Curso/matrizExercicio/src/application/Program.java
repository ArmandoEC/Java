package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite os valores de M e N: ");
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		Integer [][] mat = new Integer [M][N];
		
		System.out.println("Digite os valores para a matriz: ");
		for(int i = 0; i< mat.length; i++) {
			for(int j = 0; j< mat[i].length; j++) {
				mat [i][j] = sc.nextInt();
			}
		}

		for(int i =0; i< mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				
				if(mat[i][j] == 8) {
					System.out.printf("Position %d,%d\n",i,j);
					
					if(j > 0) {
						System.out.printf("Left: %d\n",mat[i][j-1]);
					}
					
					if(i > 0) {
						System.out.printf("Up: %d\n",mat[i-1][j]);
					}
					
					if(j < mat[i].length-1) {
						System.out.printf("Right: %d\n",mat[i][j+1]);
					}
					
					if(i < mat.length-1) {
						System.out.printf("Down: %d\n",mat[i+1][j]);
					}
				}
			}
		}
		
		
		sc.close();

	}

}
