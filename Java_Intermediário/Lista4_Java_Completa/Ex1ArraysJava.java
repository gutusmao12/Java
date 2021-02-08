package Turma15;

import java.util.Scanner;

public class Ex1ArraysJava {
	public static void main(String[] args) {
		float maior = 0, menor = 0;
		float [] nota = new float [5];
		
		Scanner ler = new Scanner(System.in);
		for(int i=0;i<5;i++) {
		System.out.println("Entre com a nota da atividade: ");
		nota[i] = ler.nextFloat();
		
		if(nota[i] < menor) {
			menor = nota[i];
		}
		else if(nota[i] > maior) {
			maior = nota[i];
		}
		}
		for(int i=0;i<5;i++) {
		System.out.println("A nota da atividade " + (i+1) + " foi: " +nota[i]);
		}
		System.out.println("\nA maior nota da atividade foi: " +maior);
	}

}
