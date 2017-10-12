package com.voiture;

public enum Marque {
	RENO ("RENO"),
	PIGEOT ("PIGEOT"),
	TROEN ("TROEN");
	
	private String marque;
	
	Marque (String mMarque){
		this.marque = mMarque;
	}
	
	public String toString(){
		return marque;
	}

}
