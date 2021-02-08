package Turma15;

import java.util.Scanner;
public class Ex7IntroJava {
	public static void main(String[] args) {
		
		float a, b, c, d, e, f, x, y;
		
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o primeiro número: ");
			a = ler.nextInt();
			System.out.println("Digite o segundo número: ");
			b = ler.nextInt();
			System.out.println("Digite o terceiro número: ");
			c = ler.nextInt();
			System.out.println("Digite o quarto número: ");
			d = ler.nextInt();
			System.out.println("Digite o quinto número: ");
			e = ler.nextInt();
			System.out.println("Digite o sexto número: ");
			f = ler.nextInt();
			
		x = (c*e) - (b*f) / (a*e) - (b*d);
		y = (a*f) - (c*d) / (a*e) - (b*d);
		
		System.out.println("O valor de x é igual a: " +x);
		System.out.println("O valor de y é igual a: " +y);
		
	}

}
