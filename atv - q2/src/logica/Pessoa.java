package logica;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome,int idade) {
		this.setIdade(idade);
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void exibirInfo() {
		System.out.println("Nome: "+this.getNome()+" - Idade: "+this.getIdade());
	}
}
