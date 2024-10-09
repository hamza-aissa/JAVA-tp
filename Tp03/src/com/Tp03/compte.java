package com.Tp03;

public class compte {
	public int numero;
	private float solde;
	public static int count = 0;
	public compte(int numero,int solde) {
		count++;
		this.numero = numero;
		this.solde = solde;
	}

	public compte(int numero) {
		this.numero = numero;
		this.solde = 0;
	}
	public compte() {
        count++;
        this.numero = count;
        this.solde = 0;
        }

	public float getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public void deposer(int m) {
		this.solde += m;
	}

	public void retirer(int m) {
		this.solde -= m;
	}

	public void voirSolde() {
		System.out.println("Le solde du compte " + this.numero + " est de " + this.solde + " euros");
	}
	public void transferer(float m,compte c) {
		this.solde -= m;
		c.solde += m;
		System.out.println("Transfert "+m+"  du compte "+this.numero+" au compte "+c.numero);
		System.out.println("Solde du compte "+this.numero+" : "+this.solde);
	}
	public boolean isRed() {
		if (this.solde < 0) {
            return true;
          } else {
        	  return false;
          }
				}
	
}
