package Turma15;

import java.util.Scanner;
public class Ex2IntroJava {
	public static void main(String[] args) {
		int ano, mes, dia, dias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade apenas em dias: ");
		dias = ler.nextInt();
		
		ano = dias / 365;
		mes = (dias % 365) / 30;
		dia = ((dias % 365) % 30) / 1;
		
		System.out.println("Sua idade é " +ano+ " ano(s), " +mes+ " mes(es) e " +dia+ " dia(s)!");
	}

}
