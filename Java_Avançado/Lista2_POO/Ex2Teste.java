package POO;

public class Ex2Teste {
	public static void main(String[] args) {
		Ex2Fornecedor cliente1 = new Ex2Fornecedor("Gustavo Vilela", "Rua João morzilho, 248",
				"(11)96443-4580", 6000, 2000);
		
		cliente1.imprimirInfo();
		cliente1.obterSaldo();
		System.out.println("\n**********Atualizando status da conta**********\n");
		cliente1.imprimirInfo2();
		
		
	}

}
