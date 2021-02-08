package Turma15;

import java.util.Scanner;
public class Ex4IntroJava {
	public static void main(String[] args) {
		int A, B, C, R, S, D;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite três números inteiros e positivos");
		System.out.println("Primeiro número: ");
		A = ler.nextInt();
		System.out.println("Segundo número: ");
		B = ler.nextInt();
		System.out.println("Terceiro número: ");
		C = ler.nextInt();
		
		R = (int) Math.pow((A + B), 2);
		S = (int) Math.pow((B + C), 2);
		D = (R + S) / 2;
		
		System.out.println("O resultado para a expressão D = (R + S) / 2, é igual a: " +D);
				
	}

}
