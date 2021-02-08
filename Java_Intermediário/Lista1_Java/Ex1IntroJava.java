package Turma15;

import java.util.Scanner;
public class Ex1IntroJava {
	public static void main(String[] args) {
		int idade, ano, mes, dia;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos, meses e dias");
		System.out.println("\nDigite sua idade em anos: ");
		ano = ler.nextInt();
		System.out.println("Digite sua idade em meses: ");
		mes = ler.nextInt();
		System.out.println("Digite sua idade em dias: ");
		dia = ler.nextInt();
		
		idade = (ano * 365) + (mes * 30) + dia;
		System.out.printf("\nSua idade em dias é: " +idade);
		
	}

}
