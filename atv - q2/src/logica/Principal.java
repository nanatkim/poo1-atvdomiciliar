package logica;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa p1 = new Pessoa("natali",18);
		Pessoa p2 = new Pessoa("wiriane",23);
		Pessoa p3 = new Pessoa("gabriel",22);
		Pessoa p4 = new Pessoa("antony",19);
		Pessoa p5 = new Pessoa("rayc",26);
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		
		System.out.println("for");
		for(int i=0;i<pessoas.size();i++) {
			pessoas.get(i).exibirInfo();
		}
		
		System.out.println("\nforeach");
		for(Pessoa pessoa : pessoas) {
			pessoa.exibirInfo();
		}
		
		System.out.println("\nforEach");
		forEach(pessoas);
	}
	
	static void forEach(ArrayList<Pessoa> pessoas) {
		pessoas.get(0).exibirInfo();
		pessoas.get(1).exibirInfo();
		pessoas.get(2).exibirInfo();
		pessoas.get(3).exibirInfo();
		pessoas.get(4).exibirInfo();
	}
}
