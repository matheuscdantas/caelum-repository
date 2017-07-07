package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

/**
 * @author Matheus
 * Classe responsável de executar o main.
 */
public class TestaConta {
	public static void main(String[] args) {
		
		Conta c1 = new Conta("Matheus", 1, "1-1", "06/07/2017");
		if (c1.deposita(50.0)) {
			System.out.println("Depósito efetuado.");
		} else {
			System.out.println("Não é possível depositar valor negativo.");
		}
	}
}
