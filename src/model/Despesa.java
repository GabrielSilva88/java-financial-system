/*Despesa e Receita deverão ser subclasses de Transacao que representam despesas e receitas, respectivamente.*/

package model;

public class Despesa extends Transacao{

	public Despesa(String descricao, double valor) {
		super(descricao, valor);
		this.descricao=descricao;
		this.valor = valor;
		// TODO Auto-generated constructor stub
	}
	
}
