package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco {
	public static void main(String[] args) {
		Banco b1 = new Banco("Santander", 1);
		for (int i = 0; i < 12; i++) {
			Conta c = new ContaCorrente();
			c.setAgencia(1);
			c.setNumero(String.valueOf(i));
			c.setTitular("Matheus" + i);
			c.deposita(i * 10000.0);
			b1.adiciona(c);
		}
	}
}
