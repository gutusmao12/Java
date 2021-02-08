package POO;

public class Ex1TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1Cliente cliente1 = new Ex1Cliente("Gustavo", " Vilela", "Rua João Morzilho, 248", 
				"422.214.448-76", "solteiro", "masculino", 500);
		cliente1.imprimirInfo();
		
		System.out.println("\n** Recebendo o sálario da empresa\n");
		cliente1.setSaldo(3500);
		cliente1.imprimirInfo();
		
		System.out.println("\n** Atualizando estado civil\n");
		cliente1.setEstadoCivil("casado");
		cliente1.imprimirInfo();
	}

}
