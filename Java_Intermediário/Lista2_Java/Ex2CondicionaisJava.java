package Turma15;

import java.util.Scanner;

public class Ex2CondicionaisJava {
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
		
		if(num1 < num2 && num1 < num3) {
			System.out.println("\n" +num1);
			if(num2 < num3) {
				System.out.println(num2);
				System.out.println(num3);
			}
			else if(num3 < num2) {
				System.out.println(num3);
				System.out.println(num2);
			}
		}
		else if(num2 < num1 && num2 < num3) {
			System.out.println("\n" +num2);
			if(num1 < num3) {
				System.out.println(num1);
				System.out.println(num3);
			}
			else if(num3 < num1) {
				System.out.println(num3);
				System.out.println(num1);
			}
		}
		else if(num3 < num2 && num3 < num1) {
			System.out.println("\n" +num3);
			if(num2 < num1) {
				System.out.println(num2);
				System.out.println(num1);
			}
			else if(num1 < num2) {
				System.out.println(num1);
				System.out.println(num2);
			}
		}
		System.out.println("\n5Essa é a ordem crescente dos números!");
		
	}
	
}
