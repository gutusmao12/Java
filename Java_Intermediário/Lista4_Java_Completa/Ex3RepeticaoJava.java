package Turma15;

import java.util.Scanner;

public class Ex3RepeticaoJava {
	public static void main(String[] args) {
		int [][] matriz1 = new int [4][6];
		int [][] matriz2 = new int [4][6];
		int [][] somamat = new int [4][6];
		int [][] difmat = new int [4][6];
		int L, C = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com a primeira matriz");
		for(L=0;L<4;L++) {
			for(C=0;C<6;C++) {
			System.out.printf("Entre com o elemento M1[%d][%d]:", L, C);
			matriz1[L][C] = ler.nextInt();
			}
		}
		System.out.println("\n");
		System.out.println("Entre com a segunda matriz");
		for(L=0;L<4;L++) {
			for(C=0;C<6;C++) {
			System.out.printf("Entre com o elemento M2[%d][%d]:", L, C);
			matriz2[L][C] = ler.nextInt();
			}
		}
		for(L=0;L<4;L++) {
			for(C=0;C<6;C++) {
		somamat[L][C] = matriz1[L][C] + matriz2[L][C];
		System.out.printf("\nO resultado da soma das matrizes na posição [%d][%d] é: %d",L,C, somamat[L][C]);
			}
		}
		System.out.println("\n");
		for(L=0;L<4;L++) {
			for(C=0;C<6;C++) {
		difmat[L][C] = matriz1[L][C] - matriz2[L][C];
		System.out.printf("\nO resultado da subtração das matrizes na posição [%d][%d] é: %d",L,C, difmat[L][C]);
			}
		}
	}

}
