package com.moteur;

public class MoteurElectrique extends Moteur {
	
	public MoteurElectrique( String cCylindre, double pPrix){
		this.type = TypeMoteur.ELECTRIQUE;
		this.cylindre = cCylindre;
		this.prixMoteur = pPrix;
	}
	
	public String toString(){
		return "Moteur Electrique" + this.cylindre + "prix " + this.prixMoteur + " €";
	}

}
