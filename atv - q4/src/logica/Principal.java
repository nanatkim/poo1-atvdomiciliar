package logica;
import java.util.*;
import modelo.*;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
		
		Universitario u1 = new Universitario("natali","paraíso");
		Universitario u2 = new Universitario("gabriel","paraíso");
		Universitario u3 = new Universitario("wiriane","paraíso");
		
		Trabalhador t1 = new Trabalhador("leonardo");
		Trabalhador t2 = new Trabalhador("leandro");
		Trabalhador t3 = new Trabalhador("edimo");
		
		estudantes.add(u1);
		estudantes.add(u2);
		estudantes.add(u3);
		estudantes.add(t1);
		estudantes.add(t2);
		estudantes.add(t3);
		
		for(Estudante e : estudantes) {
			e.estudar();
		}
	}
}
