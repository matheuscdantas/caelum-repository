package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(){
		super();
	}
	
	public ContaCorrente(String titular, int agencia, String numero) {
		super(titular, agencia, numero);
	}
		
	@Override
	public void saca(double valor){
		valor *= 1.1;
		if(valor < 0){
			throw new IllegalArgumentException("Valor negativo inválido");
		}
		if(valor <= saldo){
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
		super.saca(valor);
	}

	public String getTipo(){
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
}