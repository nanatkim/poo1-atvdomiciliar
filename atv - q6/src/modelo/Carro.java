package modelo;

public class Carro {
	private String modelo;
	private String cor;
		
	public Carro(String modelo,String cor) {
		this.setModelo(modelo);
		this.setCor(cor);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Carro\nModelo: "+this.getModelo()+" - Cor: "+this.getCor();
	}
}
