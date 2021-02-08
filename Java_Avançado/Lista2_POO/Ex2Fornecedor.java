package POO;

import java.text.NumberFormat;

public class Ex2Fornecedor extends Ex2Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	public Ex2Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) 
	{
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo() 
	{
		return valorCredito - valorDivida;
		
	}
	
	public String FormatarMoeda() 
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String FormatoMoeda = nf.format(obterSaldo());
		return FormatoMoeda;		
		
	}
	
	public void imprimirInfo()
	{
		System.out.println("Cliente: " +getNome()+ "\nEndereço: " +getEndereco()+ 
				"\nTelefone: " +getTelefone()+ "\nValor em Crédito: " +valorCredito+ 
				"\nValor da Dívida: " +valorDivida);
	}
	
	public void imprimirInfo2()
	{
		System.out.println("Cliente: " +getNome()+ "\nEndereço: " +getEndereco()+ 
				"\nTelefone: " +getTelefone()+ "\nSaldo: " +this.FormatarMoeda());
	}
}
