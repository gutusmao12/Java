package Turma15;

import java.util.Scanner;

public class Ex3RepeticaoJava {
	public static void main(String[] args) {
		int idade = 0, idade1 = 0, idade2 = 0;
		
		while(idade != -99) 
		{
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com uma idade: ");
		idade = ler.nextInt();
		
		if(idade < 21 && idade > 0) {
			idade1++;
		}
		if(idade > 50) {
			idade2++;
		}
		
		}
		System.out.println("Temos " +idade1+ " pessoa(s) com menos de 21 anos e "
				+idade2+ " pessoa(s) com mais de 50 anos!");
	}
}
