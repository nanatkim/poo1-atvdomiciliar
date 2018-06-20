package logica;

import modelo.*;
import java.util.*;

public class Principal {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		Familia familia = new Familia();
		boolean sim = true;
		
		while(sim) {
			System.out.println("Menuzinho:\n"
					+ "(1) adicionar pessoa na familia\n"
					+ "(2) exibir tudo da familia\n"
					+ "(3) trocar objetos\n"
					+ "(0) sair");
			int opcao = Integer.parseInt(s.nextLine());
			
			if(opcao == 1) {
				System.out.println("Adicionando pessoas...");
				adicionarPessoas(familia);
			} else if(opcao == 2) {
				System.out.println("Exibindo tudo da familia...");
				familia.exibirTudo();
			} else if(opcao == 3) {
				System.out.println("Trocando objetos...");
				trocarObjeto(familia);
			} else if(opcao == 0) {
				sim = false;
			}
		}
	}
	
	static void adicionarPessoas(Familia familia) {
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite o nome da pessoa:");
		String nome = s.nextLine();
		pessoa.setNome(nome);
		System.out.println("Agora adicione os objetos dessa pessoa");
		boolean sim = true;
		while(sim) {
			Objeto objeto = new Objeto();
			System.out.println("Nome do objeto:");
			String nomeObj = s.nextLine();
			System.out.println("Digite 0 para parar de adicionar");
			if(nomeObj.equals("0")) {
				sim = false;
			} else {
				objeto.setNome(nomeObj);
				pessoa.addObjetos(objeto);
			}
		}
		
		familia.addPessoas(pessoa);
	}
	
	static void trocarObjeto(Familia familia) {
		Pessoa pessoaEntregar = new Pessoa();
		Objeto objTrocar = new Objeto(); 
		Pessoa pessoaReceber = new Pessoa();
		
		System.out.println("De quem é o objeto que você quer trocar? Digite o nome.");
		String nome = s.nextLine();
		pessoaEntregar = procurarPessoa(familia, nome);
		
		System.out.println("Que objeto dessa pessoa você quer trocar? Digite o nome.");
		String nomeObj = s.nextLine();
		for(Objeto obj : pessoaEntregar.getObjetos()) {
			if(obj.getNome().equals(nomeObj)) {
				objTrocar = obj;
			}
		}
		
		System.out.println("Pra quem dar esse objeto?");
		String nome2 = s.nextLine();
		pessoaReceber = procurarPessoa(familia, nome);
		
		pessoaEntregar.trocarObj(pessoaReceber, objTrocar);
	}
	
	static Pessoa procurarPessoa(Familia familia,String nome) {
		for(Pessoa p : familia.getPessoas()){
			if(nome.equals(p.getNome())) {
				return p;
			}
		}
		return null;
	}
}
