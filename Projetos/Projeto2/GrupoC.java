package POO;

import java.util.Scanner;

public class GrupoC extends Veiculos {
	
	public GrupoC(String fabricante, String placa, String modelo, int ano, int qntd_lugares, 
	         boolean blindado, boolean ar_condicionado, boolean automatico,
	         boolean adaptavel, boolean disponivel) {
			 super(fabricante, placa, modelo, ano, qntd_lugares, blindado, ar_condicionado, automatico, adaptavel, disponivel);
			 this.setCategoria('C');
	}
	
	@Override
	public double calculaTotal() {
		return getQntd_dias()*90;
	}
	
	@Override
	public double calculaSeguro() {
		if(!isSeguro()) {
			return 0;
		}
		else {
			return calculaTotal()*0.15;
		}
	}
	
	public static GrupoC criaObj() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o fabricante do ve�culo: ");
		String fabricante = scanner.nextLine();
		
		System.out.print("Digite a placa do ve�culo: ");
		 String placa  = scanner.nextLine();
		
		System.out.print("Digite o modelo do ve�culo: ");
		String modelo = scanner.nextLine();
		
		System.out.print("Digite o ano de fabrica��o do ve�culo: ");
		int ano = scanner.nextInt();
		
		System.out.print("Digite a quantidade de lugares do ve�culo: ");
		int qntd_lugares = scanner.nextInt();
		
		return new GrupoC(fabricante, placa, modelo, ano, qntd_lugares, false, true, false, false, true);
	}
}
