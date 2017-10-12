package com.principale;
import com.moteur.MoteurDiesel;
import com.moteur.MoteurElectrique;
import com.moteur.MoteurEssence;
import com.moteur.MoteurHybride;
import com.moteur.MoteurHybride;
import com.option.BarreDeToit;
import com.option.Climatisation;
import com.option.Gps;
import com.option.SiegeChauffant;
import com.option.VitreElectrique;
import com.voiture.*;
public class ClasseMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   	 Garage garage = new Garage();   
	   	 System.out.println(garage);
	   	 System.out.println("1");
	   	 Vehicule lag1 = new Lagouna();
	   	 lag1.setMoteurVehicule(new MoteurEssence("150 Chevaux", 10256d));
	   	 lag1.addOption(new Gps());
	   	 lag1.addOption(new SiegeChauffant());
	   	 lag1.addOption(new VitreElectrique());
	   	 garage.addVoiture(lag1);
	    	System.out.println("2");
	   	 Vehicule A300B_2 = new A300B();
	   	 A300B_2.setMoteurVehicule(new MoteurElectrique("1500 W", 1234d));
	   	 A300B_2.addOption(new Climatisation());
	   	 A300B_2.addOption(new BarreDeToit());
	   	 A300B_2.addOption(new SiegeChauffant());
	   	 garage.addVoiture(A300B_2);
	   	System.out.println("3");
	   	 Vehicule d4_1 = new D4();
	   	 d4_1.setMoteurVehicule(new MoteurDiesel("200 Hdi", 25684.80d));
	   	 d4_1.addOption(new BarreDeToit());
	   	 d4_1.addOption(new Climatisation());
	   	 d4_1.addOption(new Gps());
	   	 garage.addVoiture(d4_1);   	 
	   	System.out.println("4");
	   	 Vehicule lag2 = new Lagouna();
	   	 lag2.setMoteurVehicule(new MoteurDiesel("500 Hdi", 456987d));
	   	 garage.addVoiture(lag2);
	   	System.out.println("5");
	   	 Vehicule A300B_1 = new A300B();
	   	 A300B_1.setMoteurVehicule(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
	   	 A300B_1.addOption(new VitreElectrique());
	   	 A300B_1.addOption(new BarreDeToit());
	   	 garage.addVoiture(A300B_1);
	   	System.out.println("6");
	   	 Vehicule d4_2 = new D4();
	   	 d4_2.setMoteurVehicule(new MoteurElectrique("100 KW", 1224d));
	   	 d4_2.addOption(new SiegeChauffant());
	   	 d4_2.addOption(new BarreDeToit());
	   	 d4_2.addOption(new Climatisation());
	   	 d4_2.addOption(new Gps());
	   	 d4_2.addOption(new VitreElectrique());
	   	 garage.addVoiture(d4_2);  
	}

}
