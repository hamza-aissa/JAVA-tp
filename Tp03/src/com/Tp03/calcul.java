package com.Tp03;

public class calcul {
	public static void main(String[] args) {

	Entier n = new Entier();
	int factoriel = Entier.factoriel(5);
	System.out.println(factoriel);
	System.out.println(Entier.absolu(-5));
	Entier.comparer(4,5);
	System.out.println( Entier.premier(7));
	}
}
