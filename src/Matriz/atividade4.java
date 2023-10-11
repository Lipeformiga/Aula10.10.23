package Matriz;

import java.util.Scanner;

public class atividade4 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int matriz [][] = new int [6][6];
		
		System.out.println("escreva o número que você quer buscar na matriz: ");
		num = sc.nextInt();
		
		for (int i=0;i<6;i++) {
			for (int y=0;y<6;y++) {
				System.out.println("escreva os números da matriz: "+"["+(i+1)+"]"+"["+(y+1)+"]");
				matriz [i][y] = sc.nextInt();
				
				if ( matriz[i][y] == num ) {
					System.out.println("número encontrado! e esta na linha"+ "["+(i+1)+"]"+ " e na coluna"+ "["+(y+1)+"]");
				}
				else {
					System.out.println("Numero não encontrado");
				}
			}	
		}
		sc.close();
	}
}
