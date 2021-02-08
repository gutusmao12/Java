package POO;

public class Cachorro extends Animal {

	public Cachorro()
	{
		super("Bob", 3);
	}

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("au au au");
	}

	@Override
	public void locomocao() {
		// TODO Auto-generated method stub
		System.out.println("corre");
	}
	

}