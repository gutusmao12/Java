package POO;

import java.text.NumberFormat;

public class Ex1Cliente {
	private String primeiroNome;
	private String segundoNome;
	private String endereco;
	private String cpf;
	private String estadoCivil;
	private String genero;
	private double saldo;
	
	public Ex1Cliente(String primeiroNome, String segundoNome, String endereco, String cpf, String estadoCivil, String genero, int saldo)
	{
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
		this.genero = genero;
		this.saldo = saldo;
		
	}
	
	public void imprimirInfo()
	{
		System.out.println("Cliente: " +primeiroNome+ segundoNome+ "\nEndereço: " +endereco+
				"\nCPF: " +cpf+ "\nEstado Civil: " +estadoCivil+ "\nGênero: " +genero+ "\nSaldo: " +this.formatarMoeda());
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(saldo);
		return formatoMoeda;
	}

	
	
	
	
}
