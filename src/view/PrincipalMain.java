/*Implementar a classe Principal no pacote view com o método main para iniciar o sistema e permitir interação com o usuário através do menu. */

package view;

import java.util.Scanner;

import controller.Menu;

public class PrincipalMain {
	Scanner scan = new Scanner(System.in);
	
	/*Desenvolver a lógica para que, ao executar seu sistema, ele continue ativo até que o usuário peça para sair ou encerre a aplicação.*/
	
	public static void main(String[] args) {
		Menu m = new Menu();
		
		boolean logado = false;
		
		while (!logado) {
		
			logado = m.autenticarUsuario();
	
		}
		
		m.exibirMenu();
	
	}
	
	
}
