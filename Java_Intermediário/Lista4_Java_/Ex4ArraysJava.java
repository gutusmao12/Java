package Turma15;

import java.util.Scanner;

public class Ex4ArraysJava {
	public static void main(String[] args) {
		int [][] matriz = new int [3][3];
		int somamatriz = 0, somadiagonal = 0, L, C;
		
		Scanner ler = new Scanner(System.in);
		for(L=0;L<3;L++) {
			for(C=0;C<3;C++) {
				System.out.printf("Entre com o elemento M[%d][%d] da matriz ", L,C);
				matriz [L][C] = ler.nextInt();
				somamatriz = somamatriz + matriz [L][C];
			}
		}
		somadiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.println("A soma dos valores da matriz é igual a: " +somamatriz);
		System.out.println("A soma dos valores da diagonal principal é igual a: " +somadiagonal);
		
	}

}
