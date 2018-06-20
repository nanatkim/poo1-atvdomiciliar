package logica;

import java.util.*;
import modelo.*;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Object> objetos = new ArrayList<Object>();
		Pessoa pessoa = new Pessoa("natali",18);
		Carro carro = new Carro("gol","azul");
		Comida comida = new Comida("macarrão");
		
		objetos.add(pessoa);
		objetos.add(carro);
		objetos.add(comida);
		
		for(Object o : objetos) {
			System.out.println(o.toString());
		}
	}
}
