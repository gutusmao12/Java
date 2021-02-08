package Turma15;

import java.util.Scanner;
public class Ex5IntroJava {
	public static void main(String[] args) {
		
		double nota1, nota2, nota3, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		nota1 = ler.nextFloat();
		System.out.println("Entre com a segunda nota: ");
		nota2 = ler.nextFloat();
		System.out.println("Entre com a terceira nota: ");
		nota3 = ler.nextFloat();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.printf("A média final do aluno é: %2.2f", media);
		
	}

}
