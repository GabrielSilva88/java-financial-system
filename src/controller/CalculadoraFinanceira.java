/*
 Implementar a classe CalculadoraFinanceira no pacote controller, 
 contendo métodos estáticos para calcular o saldo atual e a média de despesas.
*/
package controller;

import java.util.List;

import model.Despesa;
import model.Receita;
import model.Transacao;

public class CalculadoraFinanceira {

	public static double calcularSaldoAtual(List<Transacao> transcacoes) {
		double saldo = 0;
		for (Transacao transacao : transcacoes) {
			if (transacao instanceof Receita) {
				saldo += transacao.getValor();

			} else if (transacao instanceof Despesa) {
				saldo -= transacao.getValor();
			}
		}
		return saldo;
	}

	public static double calcularMediaDespesas(List<Transacao> transcacoes) {
		double somaDespesas = 0;
		int contadorDespesas = 0;
		for (Transacao transacao : transcacoes) {
			if (transacao instanceof Despesa) {
				somaDespesas += transacao.getValor();
				contadorDespesas++;
			}
		}
		return contadorDespesas >  0 ? somaDespesas / contadorDespesas : 0;
	}
}
