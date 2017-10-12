package com.moteur;

public class MoteurHybride extends Moteur {

	public MoteurHybride(String cCylindre, double pPrixMoteur) {
		this.setTypeMoteur(TypeMoteur.HYBRIDE);
		this.cylindre = cCylindre;
		this.prixMoteur = pPrixMoteur;
	}
	
	public String toString(){
		return "Moteur Hybride: " + this.cylindre + " prix " + this.prixMoteur + " €";
	}
	

}
