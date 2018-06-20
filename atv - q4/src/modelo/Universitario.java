package modelo;

public class Universitario implements Estudante {
	private String nome;
	private String faculdade;
	
	public Universitario(String nome, String faculdade) {
		this.setNome(nome);
		this.setFaculdade(faculdade);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	@Override
	public void estudar() {
		System.out.println(this.getNome()+" é universitário da "+getFaculdade()+""
				+ " e está estudando...");
	}
}
