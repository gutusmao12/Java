package POO;

public class Ex3TesteProdutoElet {
	public static void main(String[] args) {
		
		Ex3ProdutoElet prod = new Ex3ProdutoElet("Xiaomi", "Lenovo", "PS4", "Aple", "LG");
		
		prod.imprimirInfo();
		System.out.println("\n**************************************************");
		System.out.println("Atualizando os produtos que chegaram para conserto");
		System.out.println("**************************************************\n");
		prod.setCelular("Iphone");
		prod.setNotebook("Dell");
		prod.setGame("X-Box 360");
		prod.setTablet("Samsung");
		prod.setMonitor("Samsung");
		prod.imprimirInfo();
		
	}
}
