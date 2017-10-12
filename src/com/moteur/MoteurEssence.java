package com.moteur;

public class MoteurEssence extends Moteur {
	
	public MoteurEssence(String cCylindre, double pPrixMoteur) {
		this.setTypeMoteur(TypeMoteur.HYBRIDE);
		this.cylindre = cCylindre;
		this.prixMoteur = pPrixMoteur;
	}
	
	public String toString(){
		return "Moteur Essence: " + this.cylindre + " prix " + this.prixMoteur + " €";
	}

}
