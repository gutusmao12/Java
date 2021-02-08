package POO;

public class Ex3ProdutoElet {
	
	private String celular;
	private String notebook;
	private String game;
	private String tablet;
	private String monitor;
	
	public Ex3ProdutoElet(String celular, String notebook, String game, String tablet, String monitor)
	{
		this.celular = celular;
		this.notebook = notebook;
		this.game = game;
		this.tablet = tablet;
		this.monitor = monitor;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Modelos de produtos para conserto:\n");
		System.out.println("Celular: " +celular+ "\nNotebook: " +notebook+ "\nVídeo Game: " +game+
				"\nTablet: " +tablet+ "\nMonitor: " +monitor);
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getNotebook() {
		return notebook;
	}

	public void setNotebook(String notebook) {
		this.notebook = notebook;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getTablet() {
		return tablet;
	}

	public void setTablet(String tablet) {
		this.tablet = tablet;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	
	

}
