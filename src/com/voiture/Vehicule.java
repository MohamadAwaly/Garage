package com.voiture;
import com.moteur.Moteur;
import com.option.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicule implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected double prix;
	protected String nomVoiture;
	protected List <Option> Options = new ArrayList<Option>();
	protected Marque marqueVoiture;
	protected Moteur moteurVehicule;
	protected double prixDesOptions;
	
	public Vehicule (){
		this.Options = new ArrayList<Option>();
	}
	
	public void addOption (Option opt){
		Options.add(opt);
	}
	
	public Marque getMarqueVoiture(){
		return marqueVoiture;
	}
	
	public List<Option> getOption (){
		return Options;
	}
	
	public double getPrix(){
		return prix;
	}
	
	public void setMoteurVehicule(Moteur moteur){
		this.moteurVehicule = moteur;
	}
	
	public String getNom(){
		return nomVoiture;
	}
	public void afficheOption(){
		for (Option option : Options)
		{
			option.toString();
			System.out.println(option);
		}
	}
		
	public double getPrixDesOptions(){
		for (int i = 0; i <this.Options.size(); i++){
				this.prixDesOptions += this.Options.get(i).prixOption();
			}
			return prixDesOptions;
			
		
	}
	public String toString(){
		String str = "Voiture de Marque "+ getMarqueVoiture() 
				+ " \nModèle : " + getNom()
				+" \nPrix de Véhicule seul: "+	getPrix() 
				+ " \nOptions: " + this.moteurVehicule.toString()
				+ "\nPrix des options :"
				+ "\n-----------------------------------"
				+"\nPrix Total des Véhicule: "
				
				+ (prix+ getPrixDesOptions()+ this.moteurVehicule.getPrix()+ " €")
				+"\n*************************************************************";

		return str.toString();
	}
}
