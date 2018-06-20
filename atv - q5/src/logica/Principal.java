package logica;

import java.util.*;

import modelo.Lutador;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Lutador> lutadores = new ArrayList<Lutador>();
		Lutador l1 = new Lutador("natali",1.59f,100);
		Lutador l2 = new Lutador("gabriel", 1.70f,300);
		Lutador l3 = new Lutador("antony", 1.75f,300);
		Lutador l4 = new Lutador("rayc",1.70f,250);
		
		lutadores.add(l1);
		lutadores.add(l2);
		lutadores.add(l3);
		lutadores.add(l4);
		
		Comparator<Lutador> comparatorPorNome = new Comparator<Lutador>() {
			@Override
			public int compare(Lutador arg0, Lutador arg1) {
				return arg0.getNome().compareTo(arg1.getNome());
			}
		};
		Comparator<Lutador> comparatorPorAltura = new Comparator<Lutador>() {
			@Override
			public int compare(Lutador arg0, Lutador arg1) {
				return Float.compare(arg0.getAltura(), arg1.getAltura());
			}
		};
		
		Comparator<Lutador> comparatorPorForca = new Comparator<Lutador>() {
			@Override
			public int compare(Lutador arg0, Lutador arg1) {
				return Integer.compare(arg0.getForca(), arg1.getForca());
			}
		};
		
		System.out.println("\nComparator por nome:\n");
		Collections.sort(lutadores,comparatorPorNome);
		System.out.println(lutadores);
		System.out.println("\nComparator por altura:\n");
		Collections.sort(lutadores,comparatorPorAltura);
		System.out.println(lutadores);
		System.out.println("\nComparator por força:\n");
		Collections.sort(lutadores,comparatorPorForca);
		System.out.println(lutadores);
	
	}
}
