package com.tp04;
import java.util.Scanner;
public class Film {
	protected String titre;
	protected String realisateur;
	protected String paysOrigine;
	protected double duree;
	protected int nbPlaces;
	public Film(String titre, String realisateur, String paysOrigine, double  duree, int nbPlaces) {
		this.titre = titre;
		this.realisateur = realisateur;
		this.paysOrigine = paysOrigine;
		this.duree = duree;
		this.nbPlaces = nbPlaces;
	}
	public Film(String titre, String realisateur, String paysOrigine, Double duree) {
		super();
		this.titre = titre;
		this.realisateur = realisateur;
		this.paysOrigine = paysOrigine;
		this.duree = duree;
	}
	public int getNbPlaces() {
		return nbPlaces;
	}
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	@Override
	public String toString() {
		return  titre + "de" + realisateur + "(" + paysOrigine + ")"+" - "+ duree ;
	}

	public float totalVenteBillets(int nbPlaces) {
		Scanner sc = new Scanner(System.in);
		int nb_billets_etudiants = nbPlaces+5;
		while(nb_billets_etudiants < 0 || nb_billets_etudiants > nbPlaces) {
			System.out.println("donner le nombre detudiants : ");
			nb_billets_etudiants = sc.nextInt();
		}
		return (nb_billets_etudiants*2 + (nbPlaces-nb_billets_etudiants)*3);
	}

}
