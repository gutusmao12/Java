package Turma15;

import java.util.Scanner;

public class Ex6RepeticaoJava {
	public static void main(String[] args) {
		int num, mult3 = 0, soma = 0;
		float media = 0;
		
		do
		{
			Scanner ler = new Scanner(System.in);
			System.out.println("Entre com um número inteiro à sua escolha: ");
			num = ler.nextInt();
			if(num % 3 == 0 && num != 0)
			{
				soma = soma + num;
				mult3++;
				media = soma / mult3;
			}
		}
		while(num != 0);
		
		System.out.println("A média dos números digitados que são múltiplos de 3 é de: " +media);
	}

}
