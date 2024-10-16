package com.tp04;

public class Documentaire extends Film {
	private String sujet;
	private float tarif;
	public Documentaire(String titre, String realisateur, String paysOrigine, double duree, int nbPlaces, String sujet) {
		super(titre, realisateur, paysOrigine, duree, nbPlaces);
		this.sujet = sujet;
		this.tarif = 2;
	}
	@Override
	public String toString() {
		return "Documentaire [sujet=" + sujet + ", tarif=" + tarif + ", titre=" + titre + ", realisateur=" + realisateur
				+ ", paysOrigine=" + paysOrigine + ", duree=" + duree + ", nbPlaces=" + nbPlaces + "]";
	}
	@Override
	public float totalVenteBillets(int nbPlaces ) {
		return (nbPlaces * 2 );
	}
}
