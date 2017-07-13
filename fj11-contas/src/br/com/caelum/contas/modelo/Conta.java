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

	public Conta() {

	}

	public Conta(String titular, int agencia, String numero) {
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Conta)) return false;
		Conta c = (Conta) obj;
		if(this.agencia == c.getAgencia() && this.numero.equals(c.getNumero())) return true;
		return false;
	}

	@Override
	public String toString() {
		titular = titular.toUpperCase();
		return titular + "-" + numero;
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public abstract String getTipo();

	public String imprimeDados() {
		String dados = "Titular: " + this.getTitular() + "\nAgencia: " + this.getAgencia() + "\nNúmero:"
				+ this.getNumero() + "\nTipo de Conta: " + this.getTipo();
		return dados;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor negativo inválido");
		}
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor negativo inválido");
		}
		this.saldo -= valor;
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
