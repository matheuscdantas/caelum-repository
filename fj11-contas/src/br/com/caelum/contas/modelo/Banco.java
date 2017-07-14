package br.com.caelum.contas.modelo;

public class Banco {
	private String nome;
	private int numero;
	Conta[] contas;
	int qtd;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}

	public void adiciona(Conta conta) {
		if (this.qtd < this.contas.length) {
			this.contas[this.qtd] = conta;
		} else{
			System.out.println("Array cheio!");
		}
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public Conta[] getContas() {
		return contas;
	}

}
