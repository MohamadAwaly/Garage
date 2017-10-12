package com.moteur;

public enum TypeMoteur {
	
	DIESEL (" DIESEL"),
	ESSENCE ("ESSENCE"),
	HYBRIDE ("HYBRIDE"),
	ELECTRIQUE("ELECTRIQUE");
	
	private String typeString;
	
	TypeMoteur (String tTypeMateur){
		this.typeString = tTypeMateur;
	}
	
	public String toString(){
		return typeString; 
	}

}
