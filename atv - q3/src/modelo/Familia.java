package modelo;

import java.util.ArrayList;

public class Familia {
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void addPessoas(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}
	
	public void exibirTudo() {
		System.out.println("Família");
		for(Pessoa pessoa : this.pessoas) {
			pessoa.exibirTudo();
		}
	}
}
