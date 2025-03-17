package main;

import java.util.Scanner;

import dao.PessoaDAO;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		Scanner scanner = new Scanner(System.in);
		
	
		try {
			
			while(true) {
			System.out.println("------------------------");
			System.out.println("------------------------");
			System.out.println("---ESCOLHA UMA OPÇÃO----");
			System.out.println("(1) CRIAR PESSOA");
			System.out.println("(2) LER PESSOA");
			System.out.println("(3) ATUALIZAR PESSOA");
			System.out.println("(4) DELETAR PESSOA");
			System.out.println("(5) SAIR");
		
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch(opcao) {
			      case 1:
			    	  System.out.println("DIGITE O NOME DA PESSOA: \n");
			    	  String nomePessoa = scanner.nextLine();
			    	  pessoaDAO.criarPessoa(nomePessoa);
			    	  break;
			      case 2:
			    	  System.out.println("LEITURA:");
			    	  pessoaDAO.lerPessoa();
			    	  break;
			      case 3:
			    	  System.out.println("DIGITE O ID DA PESSOA A SER ATUALIZADA: \n");
			    	  int atualizarId = scanner.nextInt();
			    	  scanner.nextLine();
			    	  System.out.println("DIGITE O NOVO NOME DA PESSOA: \n");
			    	  String novoNome = scanner.nextLine();
			    	  pessoaDAO.atualizarPessoa(atualizarId, novoNome);
			    	  break;
			      case 4:
			    	  System.out.println("DIGITE O ID DA PESSOA A SER EXCLUÍDA: \n ");
			    	  int excluirId = scanner.nextInt();
			    	  scanner.nextLine();
			    	  pessoaDAO.excluirPessoa(excluirId);
			    	  break;
			      case 5: 
			    	  System.out.println("SAINDO...");
			    	  System.out.println("PROGRAMA ENCERRADO");
			    	  return;
			     default: 
			    	 System.out.println("OPCÃO INVÁLIDA ");
			    	 
			    	 break;
			    	 
			    	 
			    	 
			}	
	
			
			}
		} catch(IllegalArgumentException e) {
			System.out.println("Erro " + e.getMessage());
			
			scanner.close();
		}
		
		
	}	
	
	
}

