package POO;

import java.util.Scanner;

public class Ex3Teste {
	public static void main(String[] args) {
		
		int codigoSetor;
		double salario;
		double impost = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o c�digo do seu setor: ");
		codigoSetor = ler.nextInt();
		System.out.println("Entre com seu s�lario base: ");
		salario = ler.nextDouble();
		
		if(salario>1900 && salario<=2800) {
			impost = 7.5;
		}
		else if(salario>2800 && salario<=3700) {
			impost = 15;
		}
		else if(salario>3700 && salario<= 4500) {
			impost = 22.5;
		}
		else {
			System.out.println("Voc� est� isento de imposto!");
		}
		
		Ex3Empregado jose = new Ex3Empregado("Jos� Luiz", "Rua Beija Flor, 45", "(11)98765-4371", codigoSetor, 
				salario, impost);
		
		jose.imprimirInfo();
		System.out.println("\n**********Atualizando Sal�rio**********\n");
		jose.calcularSalario(impost);
		jose.imprimirInfo2();
	}
}
