package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(){
		super();
	}
	
	public ContaPoupanca(String titular, int agencia, String numero) {
		super(titular, agencia, numero);
	}
	
	public String getTipo(){
		return "Conta Poupança";
	}

}
