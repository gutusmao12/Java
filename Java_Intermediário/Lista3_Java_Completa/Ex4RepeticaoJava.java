package Turma15;

import java.util.Scanner;

public class Ex4RepeticaoJava {
	public static void main(String[] args) {
		int idade, sexo, op, i = 0, pessoacalma = 0, outrocalmo = 0, menorcalmo = 0, femnerv = 0
				,acimanerv = 0, mascgressive = 0;
		
		while(i<150) 
		{
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Entre com o seu sexo:");
		System.out.println("1- Feminino   2- Masculino   3- Outro");
		sexo = ler.nextInt();
		
		System.out.println("Entre com a op��o que voc� se enquadra:");
		System.out.println("1- Calma   2- Nervosa   3- Agressiva");
		op = ler.nextInt();
		
		if(op == 1)
		{
			pessoacalma++;
			if(sexo == 3 && idade < 18)
			{
				outrocalmo++;
			}
			else if(idade < 18)
			{
				menorcalmo++;
			}
		}
		if(sexo == 1 && op == 2)
		{
			femnerv++;
			if(idade > 40)
			{
				acimanerv++;
			}
		}
		if(sexo == 2 && op ==3)
		{
			mascgressive++;
		}
		i++;
		}
		System.out.println("O n�mero de pessoas calmas � de: " +pessoacalma+ " pessoa(s)");
		System.out.println("O n�mero de mulheres nervosas � de: " +femnerv+ " pessoa(s)");
		System.out.println("O n�mero de homens agressivos � de: " +mascgressive+ " pessoa(s)");
		System.out.println("O n�mero de Outros calmos � de: " +outrocalmo+ " pessoa(s)");
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos � de: " +acimanerv+ " pessoa(s)");
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos � de: " +menorcalmo+ " pessoa(s)");
	}

}
