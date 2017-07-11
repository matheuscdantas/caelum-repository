package br.com.caelum.contas.modelo;

/**
 * @author oo7222
 *
 */
public abstract class Conta {

	private String titular;
	protected double saldo;
	private String numero;
	private int agencia;

	public Conta(){
		
	}
	
	public Conta(String titular, int agencia, String numero) {
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return titular + "-" + numero;
	}

	public void transfere(double valor, Conta conta){
		this.saca(valor);
		conta.deposita(valor);
	}
	
	public abstract String getTipo();
	
	public String imprimeDados(){
		String dados = "Titular: " + this.getTitular() + "\nAgencia: " + this.getAgencia()
				+"\nNúmero:" + this.getNumero() + "\nTipo de Conta: " + this.getTipo();
		return dados;
	}
	
	public boolean deposita(double valor) {
		if (valor > 0) {
			saldo += valor;
			return true;
		}
		return false;
	}

	public boolean saca(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}	
}
