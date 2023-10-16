

import java.util.Scanner;

public class atividade3 {
	
	public static void main(String [] args) {
		//transformar em 0 os números negativos em uma matriz
		Scanner sc = new Scanner(System.in);
		
		int num [][] = new int [4][4];
		
		for (int i=0;i<4;i++) {
			for (int y=0;y<4;y++) {
				
				System.out.println("escreva os números da matriz: ");
				num [i][y] = sc.nextInt();
				
				if ( num[i][y] < 0 ) {
					num[i][y] = 0;
				}
			}	
		}
		for (int x=0;x<4;x++) {
			System.out.println("");
			for (int j=0;j<4;j++) {
				System.out.print(num[x][j]+ " ");
			}
		}
		sc.close();
	}
}