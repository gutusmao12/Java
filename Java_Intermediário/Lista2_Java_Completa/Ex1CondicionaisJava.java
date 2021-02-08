package Turma15;

import java.util.Scanner;

public class Ex1CondicionaisJava {
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite três números à sua escolha");
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("\nDigite o segundo número: ");
		num2 = ler.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		num3 = ler.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("\nEsse é o maior dos três números digitados!\n" +num1);
		}
		
		else if(num2 > num1 && num2 > num3) {
			System.out.println("\nEsse é o maior dos três números digitados!\n" +num2);
		}
		
		else if(num3 > num2 && num3 > num1) {
			System.out.println("\nEsse é o maior dos três números digitados!\n" +num3);
		}
		
	}
	
}
