package com.moteur;

public class MoteurDiesel extends Moteur {
	
	public MoteurDiesel(String cylindre, double prix){
		this.type = TypeMoteur.DIESEL;
		this.cylindre = cylindre;
		this.prixMoteur = prix;
	}
	
	public String toString(){
		return "Moteur Diesel" + this.cylindre + "prix " + this.prixMoteur + " €";
	}

}
