package POO;

public class Preguica extends Animal{
	
	public Preguica()
	{
		super("Sonequinha", 100);
	}

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("Zzzzzzzzz");
	}

	@Override
	public void locomocao() {
		// TODO Auto-generated method stub
		System.out.println("subir em árvores");
	}
}
