package Turma15;

import java.util.Scanner;
public class Ex6IntroJava {
	public static void main(String[] args) {
		
		double x1, x2, y1, y2, P1, P2, d;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite os valores do primeiro Ponto: ");
		x1 = ler.nextFloat();
		x2 = ler.nextFloat();
		System.out.println("Digite os valores do segundo Ponto: ");
		y1 = ler.nextFloat();
		y2 = ler.nextFloat();
		
		P1 = (x2 - x1);
		P2 = (y2 - y1);
		d = Math.sqrt(Math.pow(P1, 2) + Math.pow(P2, 2));
		
		System.out.printf("A distância entre os pontos é igual a: %6.2f", d);
	}

}
