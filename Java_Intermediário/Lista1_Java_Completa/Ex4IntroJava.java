package Turma15;

import java.util.Scanner;
public class Ex4IntroJava {
	public static void main(String[] args) {
		int A, B, C, R, S, D;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros inteiros e positivos");
		System.out.println("Primeiro n�mero: ");
		A = ler.nextInt();
		System.out.println("Segundo n�mero: ");
		B = ler.nextInt();
		System.out.println("Terceiro n�mero: ");
		C = ler.nextInt();
		
		R = (int) Math.pow((A + B), 2);
		S = (int) Math.pow((B + C), 2);
		D = (R + S) / 2;
		
		System.out.println("O resultado para a express�o D = (R + S) / 2, � igual a: " +D);
				
	}

}
