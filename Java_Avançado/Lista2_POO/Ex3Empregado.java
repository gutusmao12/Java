package POO;

import java.text.NumberFormat;

public class Ex3Empregado extends Ex2Pessoa{
	private int codSetor;
	private double salarioBase;
	private double imposto;
	
	public Ex3Empregado(String nome, String endereco, String telefone, int codSetor,
			double salarioBase, double imposto) {
		
		super(nome, endereco, telefone);
		this.codSetor = codSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodSetor() {
		return codSetor;
	}

	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public String FormatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salarioBase);
		return formatoMoeda;
	}
	
	public void calcularSalario(double percentual) {
		salarioBase *= 1 - percentual/100;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome: " +getNome()+ "\nEndereço: " +getEndereco()+ "\nTelefone: " 
				+getTelefone()+ "\nCódigo do setor: " +codSetor+ "\nSálario base: " +salarioBase+ 
				"\nImposto em porcentagem: " +imposto);
	}
	
	public void imprimirInfo2() {
		System.out.println("Nome: " +getNome()+ "\nEndereço: " +getEndereco()+ "\nTelefone: " 
				+getTelefone()+ "\nCódigo do setor: " +codSetor+ "\nSálario Final: " +this.FormatarMoeda());
	}
	
}
