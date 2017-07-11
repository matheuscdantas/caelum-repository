package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(){
		super();
	}
	
	public ContaCorrente(String titular, int agencia, String numero) {
		super(titular, agencia, numero);
	}
		
	@Override
	public boolean saca(double valor){
		valor *= 1.1;
		if(super.saca(valor)) return true;
		return false;
	}
	
	public String getTipo(){
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
}