package modelo;

public class Comida {
	private String nome;
	
	public Comida(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Comida\nNome: "+this.getNome();
	}
}
