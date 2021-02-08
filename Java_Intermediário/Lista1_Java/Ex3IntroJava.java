package Turma15;

import java.util.Scanner;
public class Ex3IntroJava {
	public static void main(String[] args) {
		int segundos, hora, minuto, sec;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a duração do seu evento apenas em segundos: ");
		segundos = ler.nextInt();
		
		hora = segundos / 3600;
		minuto = (segundos % 3600) / 60;
		sec = ((segundos % 3600) % 60) / 1;
		
		System.out.println("A duração do seu evento é de " +hora+ " hora(s), " +minuto+ " minuto(s) e " +sec+ " segundo(s)!");
	}

}
