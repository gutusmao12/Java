package POO;

public class TesteAnimal {
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sono = new Preguica();
		
		System.out.println("**********Veterin�rio**********\n");
		System.out.println("Animal: Cachorro \nNome: " +dog.getNome()+ "\nIdade: " +dog.getIdade()+ " anos");
		System.out.println("Som emitido: ");
		dog.som();
		System.out.println("Meio de locomo��o: ");
		dog.locomocao();
		
		System.out.println("\nAnimal: Cavalo \nNome: " +horse.getNome()+ "\nIdade: " +horse.getIdade()+ " anos");
		System.out.println("Som emitido: ");
		horse.som();
		System.out.println("Meio de locomo��o: ");
		horse.locomocao();
		
		System.out.println("\nAnimal: Cavalo \nNome: " +sono.getNome()+ "\nIdade: " +sono.getIdade()+ " anos");
		System.out.println("Som emitido: ");
		sono.som();
		System.out.println("Meio de locomo��o: ");
		sono.locomocao();
	}
}
