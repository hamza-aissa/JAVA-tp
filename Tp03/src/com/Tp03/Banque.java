package com.Tp03;

public class Banque {
	public static void main(String[] args) {
		compte co1 = new compte(2512542);
		compte co2 = new compte(265261054);
		co1.voirSolde();
		co2.voirSolde();
		co1.deposer(1000);
		co2.deposer(500);
		co1.voirSolde();
		co2.voirSolde();
		co1.transferer(700, co2);
		co1.voirSolde();
		co2.voirSolde();
		System.out.println("compte 1 est en rouge? "+co1.isRed()); 
		System.out.println("compte 2 est en rouge? "+co2.isRed()); 
	}


}
