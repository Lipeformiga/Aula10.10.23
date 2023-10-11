package Matriz;

import java.util.Scanner;

public class atividade1 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int num [][] = new int [5][5];
		int armazena [][] = new int [5][5];
		int contador = 0;
		
		for (int i=0;i<5;i++) {
			for (int y=0;y<5;y++) {
				System.out.println("escreva os números da matriz: ");
				num [i][y] = sc.nextInt();	
				if ( num[i][y] == num[y][i] ) {
					System.out.println("Os números iguais são: "+ num[i][y]);
				}
			}
		}
		for (int x=0;x<5;x++) {
			System.out.println();
			for (int z=0;z<5;z++) {
				System.out.print(num[x][z]+ " ");
			}	
		}
		sc.close();
	}
}