package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(){
		super();
	}
	
	public ContaCorrente(String titular, int agencia, String numero) {
		super(titular, agencia, numero);
	}
	
	private double limite;
	
	@Override
	public boolean saca(double valor){
		valor *= 1.1;
		if(super.saca(valor)) return true;
		return false;
	}
	
	public String getTipo(){
		return super.getTipo() + " Corrente";
	}
}
