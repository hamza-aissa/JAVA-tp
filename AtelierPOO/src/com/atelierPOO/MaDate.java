package com.atelierPOO;
import java.util.Scanner;

public class MaDate {
    private int jour;
    private int Mois;
    private int Annee;
	public MaDate(int jour, int mois, int annee) {
		this.jour = jour;
		this.Mois = mois;
		this.Annee = annee;
	}
    public MaDate(int annee) {
        this.jour = 1;   
        this.Mois = 1;   
        this.Annee = annee;
    }
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	public int getMois() {
		return this.Mois;
	}
	public void setMois(int mois) {
		this.Mois = mois;
	}
	@Override
	public String toString() {
		return   this.jour + "/" + this.Mois + "/" + this.Annee;
	}
	public int getAnnee() {
		return this.Annee;
	}
	public void setAnnee(int annee) {
		this.Annee = annee;
	}
	private boolean estBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }

    private int joursDansMois(int mois, int annee) {
        switch (mois) {
            case 4: case 6: case 9: case 11:
                return 30; 
            case 2:
                return estBissextile(annee) ? 29 : 28; 
            default:
                return 31; 
        }
    }

    public void ajouterUnJour() {
        this.jour++; 

        if (this.jour > joursDansMois(this.Mois, this.Annee)) {
            this.jour = 1; 
            this.Mois++;   

            if (this.Mois > 12) {
                this.Mois = 1; 
                this.Annee++;  
            }
        }
    }
	public void ajouterUnMois() {
		this.Mois += 1;
		if(this.Annee > 12) {
			this.Mois = 1;
			this.Annee += 1 ;
		}
	}
	public void ajouterUneAnee() {
		this.Annee += 1;
	}
	public void ajouterPluseursJours(int n) {
		for(int i=0 ; i<=n ; i++) {
			ajouterUnJour();
		}
		}
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        MaDate d1 = new MaDate(31, 12, 2023);
	        MaDate d2 = new MaDate(1, 1, 2024);
	        MaDate d3 = new MaDate(2024); 

	        d1.setJour(1);
	        d2.setMois(2);
	        d3.setAnnee(2025);

	        System.out.println("Date 1 : " + d1);
	        System.out.println("Date 2 : " + d2);
	        System.out.println("Date 3 : " + d3);

	        boolean identiques = d1.getJour() == d2.getJour() && d1.getMois() == d2.getMois() && d1.getAnnee() == d2.getAnnee();
	        System.out.println("Les dates d1 et d2 sont identiques : " + identiques);

	        while (true) {
	            System.out.println("\nMenu :");
	            System.out.println("1. Ajouter un jour");
	            System.out.println("2. Ajouter plusieurs jours");
	            System.out.println("3. Ajouter un mois");
	            System.out.println("4. Ajouter une année");
	            System.out.println("5. Quitter");

	            System.out.print("Choisissez une option : ");
	            int choix = scanner.nextInt();

	            switch (choix) {
	                case 1:
	                    d1.ajouterUnJour();
	                    System.out.println("Date après ajout d'un jour : " + d1);
	                    break;
	                case 2:
	                    System.out.print("Combien de jours à ajouter ? ");
	                    int jours = scanner.nextInt();
	                    d1.ajouterPluseursJours(jours);
	                    System.out.println("Date après ajout de " + jours + " jours : " + d1);
	                    break;
	                case 3:
	                    d1.ajouterUnMois();
	                    System.out.println("Date après ajout d'un mois : " + d1);
	                    break;
	                case 4:
	                    d1.ajouterUneAnee();
	                    System.out.println("Date après ajout d'une année : " + d1);
	                    break;
	                case 5:
	                    System.out.println("Au revoir !");
	                    scanner.close();
	                    return; 
	                default:
	                    System.out.println("Choix invalide, veuillez réessayer.");
	            }
	        }
		}
}
