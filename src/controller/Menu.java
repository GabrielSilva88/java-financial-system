/*
  Criar a classe Menu no pacote controller para exibir um menu de opções para o usuário, 
  permitindo adicionar receitas, adicionar despesas, exibir extrato, saldo atual, média de despesas e sair do sistema.
*/
package controller;

import java.util.Scanner;

import model.Despesa;
import model.Receita;

public class Menu {
	Operacao o = new Operacao();
	Scanner scan = new Scanner(System.in);
	
	String usuario = "adm";
	int senha = 123;
	
	// logica do acesso ao acessar o sistema.
	public boolean autenticarUsuario() {
		System.out.println("Digite o nome do usuário: ");
		 usuario = scan.nextLine();
		System.out.println("Digite a senha do usuário: ");
		 senha = scan.nextInt();
		
		if(usuario.equals("adm") && usuario.equals("123")) {
			System.out.println("Autenticado, Usuário: " + usuario);
			return true;
		}else {
			System.out.println("Usuário ou Senha incorretos, Tente novamente!");
			return false;
		}
	}
	
	public void exibirMenu() {
		int opc = 0;
		System.out.println(" MENU SISTEMA: \n" + "1. Adicionar Despesas.\n" + "2. Adicionar Despesas.\n"
				+ "3. Exibir Extrato.\n" + "4.Saldo Atual.\n" + "5.Média de Despesas\n" + "6.sair");
		
		opc = scan.nextInt();
		
		do {
			switch (opc) {
			case 1:
				adicionarReceitas();
				break;
			case 2:
				adicionarReceitas();
				break;
			case 3:
				o.exibirExtrato();
				break;
			case 4:
				System.out.println("Saldo Atual: " + o.exibirSaldoAtual());
				break;
			case 5:
				System.out.println("Média de despesas: " + o.exibirMediaDespesas());
				break;
			default:
				System.out.println("Saindo do sistema.");
				break;
			}
		} while (opc != 6);
	}

	public  void adicionarReceitas() {
		
		System.out.println("Adicionar Descrição Receita: " );
		String descricao = scan.nextLine();
		
		System.out.println("Adicionar Valor Receita: ");
		double valor = scan.nextDouble();
		
		scan.nextLine(); // quebrar linha
		
		o.adicionarTransacoes(new Receita(descricao, valor));
	}
	
	public void adicionarDespesas() {
		System.out.println("Adicionar Descrição Despesa: ");
		String descricao = scan.nextLine();
		
		System.out.println("Adicionar Valor Despesa: ");
		double valor = scan.nextDouble();
		
		scan.nextLine();
		
		o.adicionarTransacoes(new Despesa(descricao, valor));
	}
}