package Turma15;

public class Ex2ArraysJava {
	public static void main(String[] args) {
		int [] vetor2 = new int [10];
		float media, soma = 0;
		int i, contmaior = 0;
		
		for(i=0;i<vetor2.length;i++) {
			int rnd = (int) (1 + Math.random() * 6);
			vetor2[i] = rnd;
			System.out.println("Lan�ando o dado pela " + (i+1) + "� vez: " +vetor2[i]);
			soma = soma + vetor2[i];
			if(vetor2[i] == 6) {
				contmaior++;
			}
		}
		media = soma / 10;
		System.out.printf("\nA m�dia aritm�tica dos lan�amentos � igual a: %2.2f\n", media);
		System.out.println("A soma dos lan�amentos � igual a: " +soma);
		System.out.println("O maior n�mero apareceu " +contmaior+ " vez(es)!");
	
	}

}
