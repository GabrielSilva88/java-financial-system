/* Criar as classes Transacao, Despesa e Receita. no pacote model. 

Transacao deverá ser uma classe abstrata que representa uma transação financeira.

Despesa e Receita deverão ser subclasses de Transacao que representam despesas e receitas, respectivamente.*/
package model;

public abstract class Transacao {
	
	// ATRIBUTOS
	protected String descricao;
	protected double valor;
	
	// CONTRUTOR PARA ALIMENTAR OS MÉTODOS
	public Transacao(String descricao, double valor) {
		super();		
		this.descricao = descricao;
		this.valor = valor;
	}
	
	// SET(){}; E GET(){};

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
		
}
