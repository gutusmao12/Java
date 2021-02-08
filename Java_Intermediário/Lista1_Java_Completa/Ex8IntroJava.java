package Turma15;

import java.util.Scanner;

public class Ex8IntroJava {

	public static void main(String[] args) {
		float consum, fabrica;		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o preço de fábrica do carro que deseja: ");
		fabrica = ler.nextFloat();
		
		consum = (fabrica + (fabrica * (28/100)) + (fabrica * (45/100)));
		
		System.out.println("O valor total do carro que deseja é: " +consum);
		
		
	}

}
