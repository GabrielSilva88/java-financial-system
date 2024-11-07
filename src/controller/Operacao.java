/*Desenvolver a classe Operacoes no pacote controller para gerenciar as operações do sistema, 
 * incluindo adicionar transações, exibir extrato, saldo atual e média de despesas.*/
package controller;

import java.util.ArrayList;
import java.util.List;

import model.Transacao;

public class Operacao {

	List<Transacao> transacoes = new ArrayList<Transacao>();
	
	public void adicionarTransacoes(Transacao transacao) {
		transacoes.add(transacao);
		
	}
	
	public void exibirExtrato() {
		for (Transacao transacao : transacoes) {
			System.err.println(transacao.getClass().getSimpleName() + ":" + transacao.getDescricao() + ", R$: "+ transacao.getValor());
		}
	}
	
	public double exibirSaldoAtual() {
		return CalculadoraFinanceira.calcularSaldoAtual(transacoes);
	}
	
	public double exibirMediaDespesas() {
		return CalculadoraFinanceira.calcularMediaDespesas(transacoes);
	}
	
}
