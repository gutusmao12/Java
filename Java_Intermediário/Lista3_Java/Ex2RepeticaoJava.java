package Turma15;

import java.util.Scanner;

public class Ex2RepeticaoJava {
	public static void main(String[] args) {
		int num, i, par = 0, impar = 0;
		
		for(i = 1; i <=10; i++) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o " +i+ "º número: ");
			num = ler.nextInt();
			if(num % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Você digitou " +par+ " números pares e " +impar+ " números ímpares!");
	}

}
