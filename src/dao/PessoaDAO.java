package dao;

import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class PessoaDAO {

	private List<Pessoa> pessoas = new ArrayList<>();
	private int idCounter = 1;

	public void criarPessoa(String nome) {
		Pessoa novapessoa = new Pessoa(idCounter++, nome);
		pessoas.add(novapessoa);
		System.out.println("Pessoa criada:  " + novapessoa);

	}

	public void lerPessoa() {
		if(pessoas.isEmpty()) {
			System.out.println("Não há pessoas cadastradas");
			return;
		}
		System.out.println("Lista de pessoas");
		for(Pessoa pessoa: pessoas) {
			System.out.println("ID: " + pessoa.getId() + ", Nome: "+ pessoa.getNome());
		}	
	}

	public void atualizarPessoa(int id, String novoNome) {
		Pessoa pessoa = encontrarPessoaPorId(id);
		if(pessoa!=null) {
			pessoa.setNome(novoNome);
			System.out.println("Pessoa atualizada com sucesso");
		} else {
			System.out.println("Pessoa não encontrada CÓDIGO 2");			
		}

	}
	

	public void excluirPessoa(int id) {
		Pessoa pessoa = encontrarPessoaPorId(id);
		if(pessoa!=null) {
			pessoas.remove(pessoa);
			System.out.println("Pessoa excluída");
		} else {
			System.out.println("Pessoa não encontrada CÓDIGO 3");
		}
	}
	private Pessoa encontrarPessoaPorId(int id) {
		for(Pessoa pessoa: pessoas) {
			if(pessoa.getId()==id) {
				return pessoa;
			}
		}
		System.out.println("Pessoa não encontrada CÓDIGO 4");
		return null;
	}
	

}
