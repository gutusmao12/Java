package Turma15;

import java.util.Scanner;

public class Ex3CondicionaisJava {
	public static void main(String[] args) {
		int idade;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		idade = ler.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria Infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria Juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria Adulta");
		}
		else {
			System.out.println("Você não se enquadra em nenhuma categoria!");
		}
	}

}
