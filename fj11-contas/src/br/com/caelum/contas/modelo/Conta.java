package br.com.caelum.contas.modelo;

/**
 * @author oo7222
 *
 */
public class Conta {

	private String titular;
	private double saldo;
	private String numero;
	private int agencia;
	private String dataAbertura;

	public Conta(String titular, int agencia, String numero, String dataAbertura) {
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
		this.dataAbertura = dataAbertura;
	}

	public Conta(String numero, int agencia) {
		this.numero = numero;
		this.agencia = agencia;
	}

	/**
	 * @author oo7222 reerer metodo deposita
	 */
	public boolean deposita(double valor) {
		if (valor > 0) {
			saldo += valor;
			return true;
		}
		return false;
	}

	/**
	 * @author oo7222 eesesses método saca
	 */
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

	public String getDataAbertura() {
		return dataAbertura;
	}
}
