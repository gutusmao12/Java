package Turma15;

import java.util.Scanner;

public class Ex5RepeticaoJava {
	public static void main(String[] args) {
		int num, soma = 0;
		
		Scanner ler = new Scanner(System.in);
		do {
			System.out.println("Entre com um n�mero: ");
			num = ler.nextInt();
			soma = soma + num;
		}
		while(num != 0);	
		System.out.println("A soma dos n�meros digitados � igual a: " +soma);
	}

}
