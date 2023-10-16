

import java.util.Scanner;

public class atividade5 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int matriz[][] = new int [4][4];
		int vetor [] = new int [4];
		int vetor2 [] = new int [12];
		int y = 0, k = 0;
		
		for (int i=0;i<4;i++) {
			for (int x=0;x<4;x++) {
				System.out.println("escreva os números das matrizes"+ "["+ (i+1) +"]"+ "["+ (x+1) +"]");
				matriz [i][x] = sc.nextInt();
				
				if ( i == x ) {
					vetor [y] = matriz [i][x];
					y++;
				}
				else {
					vetor2 [k] = matriz [i][x];
					k++;
				}
			}
		}
		for (int j=0;j<4;j++) {
			System.out.println("A diagonal principal é: "+ vetor[j]);
		}
		for ( int j=0;j<12;j++) {
			System.out.println("Os números que não estão na diagonal principal são: "+ vetor2[j]);
		}
	}
}