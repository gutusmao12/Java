package Turma15;

import java.util.Scanner;

public class Ex4CondicionaisJava {
	public static void main(String[] args) {
		double num, raiz, pot;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um n�mero � sua escolha: ");
		num = ler.nextDouble();
		
		if(num % 2 == 0) {
			raiz = Math.sqrt(num);
			System.out.printf("O n�mero %10.2f � par e sua raiz � igual a %10.2f!", num, raiz);
		}
		else {
			pot = Math.pow(num, 2);
			System.out.printf("O n�mero %10.2f � �mpar e elevado ao quadrado � igual a %10.2f!", num, pot);
		}
	}

}
