package modelo;

public class Trabalhador implements Estudante{
	private String nome;
	
	public Trabalhador(String nome) {
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void estudar() {
		System.out.println(this.getNome()+" é trabalhador e está estudando...");
	}
	
}
