package Turma15;

import java.util.Scanner;

public class Ex1CondicionaisJava {
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite tr�s n�meros � sua escolha");
		System.out.println("Digite o primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.println("\nDigite o segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.println("\nDigite o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("\nEsse � o maior dos tr�s n�meros digitados!\n" +num1);
		}
		
		else if(num2 > num1 && num2 > num3) {
			System.out.println("\nEsse � o maior dos tr�s n�meros digitados!\n" +num2);
		}
		
		else if(num3 > num2 && num3 > num1) {
			System.out.println("\nEsse � o maior dos tr�s n�meros digitados!\n" +num3);
		}
		
	}
	
}
