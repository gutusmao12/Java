package Turma15;

import java.util.Scanner;
public class Ex7IntroJava {
	public static void main(String[] args) {
		
		float a, b, c, d, e, f, x, y;
		
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o primeiro n�mero: ");
			a = ler.nextInt();
			System.out.println("Digite o segundo n�mero: ");
			b = ler.nextInt();
			System.out.println("Digite o terceiro n�mero: ");
			c = ler.nextInt();
			System.out.println("Digite o quarto n�mero: ");
			d = ler.nextInt();
			System.out.println("Digite o quinto n�mero: ");
			e = ler.nextInt();
			System.out.println("Digite o sexto n�mero: ");
			f = ler.nextInt();
			
		x = (c*e) - (b*f) / (a*e) - (b*d);
		y = (a*f) - (c*d) / (a*e) - (b*d);
		
		System.out.println("O valor de x � igual a: " +x);
		System.out.println("O valor de y � igual a: " +y);
		
	}

}
