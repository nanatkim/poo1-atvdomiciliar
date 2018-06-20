package modelo;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private ArrayList<Objeto> objetos = new ArrayList<Objeto>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Objeto> getObjetos() {
		return objetos;
	}
	public void addObjetos(Objeto objeto) {
		this.objetos.add(objeto);
	}
	
	public void exibirTudo() {
		System.out.println("Nome: "+this.getNome() + "\n Objetos:");
		for(Objeto obj : this.getObjetos()) {
			System.out.println(obj.getNome());
		}
	}
	
	public void trocarObj(Pessoa pessoa, Objeto objeto) {
		int index = 0;
		for(Objeto obj : objetos) {
			if(obj.getNome().equals(objeto.getNome())){
				pessoa.addObjetos(obj);
				index = objetos.indexOf(obj);
			}
		}
		objetos.remove(index);
	}
}
