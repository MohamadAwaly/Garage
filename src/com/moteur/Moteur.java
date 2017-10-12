package com.moteur;

public abstract class Moteur {
	
	TypeMoteur type;
	String cylindre;
	double prixMoteur;
	
	public Moteur(){
	}
	
	public Moteur (String cCylindre, double pPrixMoteur){
		this.cylindre = cCylindre;
		this.prixMoteur = pPrixMoteur;
	}
	
	public double getPrix(){
		return prixMoteur;
	}
	public void setTypeMoteur(TypeMoteur type){
		this.type = type;
	}		
	
}
