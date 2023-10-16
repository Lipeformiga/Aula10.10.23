import java.util.Scanner;

public class atividade2 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao, linha, coluna;
		
		System.out.println("Qual o tamanho das linhas: ");
		linha = sc.nextInt();
		System.out.println("Digite o tamanho das colunas: ");
		coluna = sc.nextInt();
		
		int matriz [][] = new int [linha][coluna];
		int matriz2 [][] = new int [linha][coluna];
		int matrizSom [][] = new int [linha][coluna];
		int matrizSub[][] = new int [linha][coluna];
		int matrizMul[][] = new int [linha][coluna];
		
		for ( int cont1 = 0; cont1 < linha; cont1++) {
			for ( int cont2 = 0; cont2 < coluna; cont2++) {
				System.out.println("Escreva os números da primeira matriz: ");
				matriz [cont1][cont2] = sc.nextInt();
			}
		}
		for ( int cont3 = 0; cont3 < linha; cont3++) {
			for ( int cont4 = 0; cont4 < coluna; cont4++) {
				System.out.println("Escreva os números da segunda matriz: ");
				matriz2 [cont3][cont4] = sc.nextInt();
			}
		}	
		System.out.println("qual opção você quer: soma (1), subtrair(2), multiplicar(3), sair(0)");
		opcao = sc.nextInt();
		switch (opcao) {
		
		case 1: 
			for(int cont5 = 0; cont5 < linha; cont5++) {
				for(int cont6 = 0; cont6< coluna; cont6++) {
					matrizSom[cont5][cont6] = matriz[cont5][cont6] + matriz2[cont5][cont6];
				}
			}
			for(int cont5 = 0; cont5 < linha; cont5++) {
				System.out.println();
				for(int cont6 = 0; cont6< coluna; cont6++) {
					System.out.print(matrizSom[cont5][cont6]+ " ");
				}
			}
			break;
		case 2:
			for(int cont7 = 0; cont7 < linha; cont7++) {
				for(int cont8 = 0; cont8< coluna; cont8++) {
					matrizSub[cont7][cont8] = matriz[cont7][cont8] - matriz2[cont7][cont8];
				}
			}
			for(int cont7 = 0; cont7 < linha; cont7++) {
				System.out.println();
				for(int cont8 = 0; cont8< coluna; cont8++) {
					System.out.print(matrizSub[cont7][cont8]+ " ");
				}
			}
			break;
		case 3:
			for(int cont9 = 0; cont9 < linha; cont9++) {
				for(int cont = 0; cont< coluna; cont++) {
					matrizMul[cont9][cont] = matriz[cont9][cont] * matriz2[cont9][cont];
				}
			}
			for(int cont9 = 0; cont9 < linha; cont9++) {
				System.out.println();
				for(int cont = 0; cont< coluna; cont++) {
					System.out.print(matrizMul[cont9][cont]+ " ");
				}
			}
			break;
		case 0:
			break;
		}
	}
}