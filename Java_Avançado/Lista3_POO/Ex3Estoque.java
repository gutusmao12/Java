package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3Estoque {
	public static void main(String[] args) {
		
		int op;
		int entrega;
		
		try (Scanner ler = new Scanner(System.in))
		{
			ArrayList<String> compras = new ArrayList();
			
			System.out.println("**********Quitanda do Seu Zé!**********\n");
			
			do
			{
				System.out.println("Digite uma opção: ");
				System.out.println("********************");
				System.out.println("(1) Adicionar produtos ao carrinho \n(2) Remover produtos "
						+ "\n(3) Atualizar carrinho \n(4) Mostras os produtos do carrinho"
						+ " \n(0) Finalizar compra");
				System.out.println("********************");
				op = ler.nextInt();
				
				switch(op)
				{
				case 1:
					ler.nextLine();
					System.out.println("Digite o produto para adicionar ao carrinho: ");
					String produto = ler.nextLine();
					compras.add(produto);
				break;
				case 2: 
					ler.nextLine();
					System.out.println("Qual produto deseja remover: ");
					String remover = ler.nextLine();
						if(compras.contains(remover))
						{
							compras.remove(remover);
						}
						else
						{
							System.out.println("Produto não encontrado!");
						}
				break;
				case 3: 
					ler.nextLine();
					System.out.println("Digite o nome do produto que quer substituir: ");
					String verifica = ler.nextLine();
					System.out.println("Digite o produto que entrará no lugar de " +verifica+ ":");
					String atualiza = ler.nextLine();
						if(compras.contains(verifica))
						{
							compras.remove(verifica);
							compras.add(atualiza);
						}
						else
						{
							System.out.println("Produto não encontrado no carrinho!");
						}
				break;
				case 4:
					System.out.println("Seus produtos são: " +compras+ "\n");
				break;	
				default:
					if(op > 4) 
					{
					System.out.println("Erro");
					}
				}
			}while(op != 0);
			System.out.println("Compra finalizada!");
			System.out.println("\nDeseja receber seus produtos em casa?");
			System.out.println("\n(1) Sim \n(2) Não");
			entrega = ler.nextInt();
			
			if(entrega == 1)
			{
				ler.nextLine();
				System.out.println("Por favor, nos informe o seu endereço: ");
				String endereco = ler.nextLine();
			}
			else
			{
				System.out.println("Sua compra já está reservada para retirada...");
				System.out.println("\n*****Agradecemos a preferência!*****");
			}
			System.out.println("\nDentro de 1 hora sua compra estará na sua casa!");
			System.out.println("\n*****Agradecemos a preferência!*****");
		}
	}

}
