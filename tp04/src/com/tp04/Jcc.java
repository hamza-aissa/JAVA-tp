package com.tp04;

public class Jcc  {
	Film competition[] ;
	int annnee;
	int NBFMAX = 30;
	int nbFilms = 0;
	public Jcc(int taille,int annnee) {
		if(taille<NBFMAX) {
			this.competition = new Film[taille];
					}
			this.annnee = annnee;
			}

	public void ajouterFilm(Film f) {
		if (nbFilms < NBFMAX) {
			this.competition[nbFilms] = f;
			nbFilms++;
			}else if (nbFilms == NBFMAX){
			System.out.println("La compétition est au complet");

				}
			}
	public void listeFilmsJCC() {
		for (int i = 0; i < nbFilms; i++) {
			System.out.println(competition[i]);
		}
	}

	public float totalVenteBillets() {
		float total = 0;
		for (int i = 0; i < nbFilms; i++) {
			total += competition[i].totalVenteBillets(competition[i].getNbPlaces());
		}
		return total;
	}
	public static void main(String[] args) {
		Jcc jcc = new Jcc(3, 2021);
        Film f1 = new Documentaire("Le dernier refuge", "Ousman", "Mali", 86.0,100,"La guerre civile");
        Film f2 = new Film("Insurrection", " Jilani Saadi", "Tunisie", 105.0, 45);
        jcc.ajouterFilm(f1);
        jcc.ajouterFilm(f2);
        jcc.listeFilmsJCC(); 
        System.out.println(jcc.totalVenteBillets());
    }
	
	
	}
