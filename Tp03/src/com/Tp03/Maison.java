package com.Tp03;

public class Maison {
	public String adresse;
	public float superficie;
	public int nbChambres;
	public 	String type;
	public Maison(String adresse, float superficie, int nbChambres) {
		this.adresse = adresse;
		this.superficie = superficie;
		this.nbChambres = nbChambres;
	}
	public Maison(String adresse, int nbChambres,String type) {
		this.adresse = adresse;
		this.nbChambres = nbChambres;
		this.type = type;

	}
	public Maison(String adresse, float superficie, int nbChambres, String type) {
		super();
		this.adresse = adresse;
		this.superficie = superficie;
		this.nbChambres = nbChambres;
		this.type = type;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	public void calculPrix(float pmc) {
		float prix = this.superficie * pmc;
		System.out.println("Le prix de la maison est: " + prix);
	}

	public void calculPrix( ) {
        float prix = this.superficie * 2100;
		System.out.println("Le prix de la maison est (surcharge) : " + prix);
	}
	public String toChaine() {
		String chaine = "Un appartement de "+this.superficie+" a "+this.adresse+" avec "+this.nbChambres+" chambres.";
		return chaine;
	}
	public static void main(String[] args) {
		Maison maison1 = new Maison("tunis", 210, 4,"duplex,");
		Maison maison2 = new Maison("nabeul", 6, "villa");
		System.out.println(maison1.toChaine()); 
		System.out.println(maison2.toChaine()); 
		maison2.setSuperficie(230);
		maison1.calculPrix(1000);
		maison1.calculPrix();

		maison2.calculPrix(1000);
		maison2.calculPrix();

	}
}
