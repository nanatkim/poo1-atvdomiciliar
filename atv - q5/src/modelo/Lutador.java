package modelo;

import modelo.*;

public class Lutador {
	private String nome;
	private float altura;
	private int forca;
	
	public Lutador(String nome, float altura, int forca) {
		this.setAltura(altura);
		this.setForca(forca);
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	public int compareTo(Lutador lutador) {
		if (this.forca == lutador.getForca()) {
			if (lutador.getNome().compareTo(this.nome) < 0) {
				return 1;
			} else {
				return -1;
			}
		} else if (this.altura == lutador.getAltura()) {
			if (lutador.getNome().compareTo(this.nome) > 0) {
				return -1;
			} else {
				return 1;
			}
		} else if (this.forca > lutador.getForca()) {
			return 1;
		} else {
			return -1;

		}
	}
	
	@Override
	public String toString() {
		return "\nnome = " + getNome() + ", Forca = " + getForca() + ", altura" + getAltura();
	}
}
